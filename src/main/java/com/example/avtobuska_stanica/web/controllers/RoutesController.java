package com.example.avtobuska_stanica.web.controllers;

import com.example.avtobuska_stanica.Model.Views.pogled_napravena_rezervacija_od_patnik;
import com.example.avtobuska_stanica.Model.avtobuska_stanica;
import com.example.avtobuska_stanica.Model.exceptions.InvalidPatnikEmbgException;
import com.example.avtobuska_stanica.Model.karta;
import com.example.avtobuska_stanica.Model.patnik;
import com.example.avtobuska_stanica.Model.ruta;
import com.example.avtobuska_stanica.Service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class RoutesController {

    private final detalen_prikaz_na_avtobuska_ruta_Service detalenPrikazNaAvtobuskaRutaService;
    private final rutaService rutaService;
    private final avtobuska_stanicaService  avtobuskaStanicaService;
    private final patnikService patnikService;
    private final com.example.avtobuska_stanica.Repository.jpa.kartaRepository kartaRepository;
    private final pogled_napravena_rezervacija_od_patnik_Service pogled_napravena_rezervacija_od_patnik_service;


    public RoutesController(detalen_prikaz_na_avtobuska_ruta_Service detalenPrikazNaAvtobuskaRutaService, com.example.avtobuska_stanica.Service.rutaService rutaService, avtobuska_stanicaService avtobuskaStanicaService, com.example.avtobuska_stanica.Service.patnikService patnikService, com.example.avtobuska_stanica.Repository.jpa.kartaRepository kartaRepository, pogled_napravena_rezervacija_od_patnik_Service pogled_napravena_rezervacija_od_patnik_service) {
        this.detalenPrikazNaAvtobuskaRutaService = detalenPrikazNaAvtobuskaRutaService;
        this.rutaService = rutaService;
        this.avtobuskaStanicaService = avtobuskaStanicaService;
        this.patnikService = patnikService;

        this.kartaRepository = kartaRepository;
        this.pogled_napravena_rezervacija_od_patnik_service = pogled_napravena_rezervacija_od_patnik_service;
    }

    @GetMapping("routes/{id}")
    public String getRoutes (Model model, @PathVariable int id){

        avtobuska_stanica stanica = this.avtobuskaStanicaService.findById_stanica(id);
        model.addAttribute("allRoutesById", detalenPrikazNaAvtobuskaRutaService.findAllById(id));
        model.addAttribute("id_stanica", id);
        model.addAttribute("stanica", stanica);

        return "allRoutes";
    }

    @PostMapping("/reserve-form/{id}/{id_stanica}/{cena}")
    public String getReservationForm(@PathVariable Integer id,
                                     @PathVariable Integer id_stanica,
                                     @PathVariable (required = false) Integer cena,
                                     Model model){

        avtobuska_stanica stanica = this.avtobuskaStanicaService.findById_stanica(id);
        ruta ruta_find = rutaService.findById_ruta(id);
        String [] parts = ruta_find.getIme_ruta().split("-");
        String patuva_od=parts[0];
        String patuva_do=parts[parts.length-1];

        model.addAttribute("ruta", ruta_find);
        model.addAttribute("stanica", stanica);
        model.addAttribute("patuva_od", patuva_od);
        model.addAttribute("patuva_do", patuva_do);
        model.addAttribute("cena", cena);

        return "reservation-form";
    }

//    @PostMapping("/reserve")
    @RequestMapping(value="/reserve",method = RequestMethod.POST)
    public String addNewReservation(HttpServletRequest req,
                                          Model model,
                                          @RequestParam String embg,
                                          @RequestParam Integer broj_sediste,
                                          @RequestParam String patuva_od,
                                          @RequestParam String patuva_do,
                                          @RequestParam Integer cena1,
                                          @RequestParam Integer id_ruta){

        patnik novPatnik = this.patnikService.findById(embg)
                .orElseThrow(()->new InvalidPatnikEmbgException(embg));
        ruta novaRuta = this.rutaService.findById_ruta(id_ruta);

        avtobuska_stanica as = this.avtobuskaStanicaService.findById_stanica(1);

        karta zacuvajKarta = new karta(broj_sediste, cena1, patuva_od, patuva_do, novPatnik, as, as, novaRuta);

        this.kartaRepository.save(zacuvajKarta);

        Integer id_karta = zacuvajKarta.getId_karta();
        List<pogled_napravena_rezervacija_od_patnik> rezervacija =  this.pogled_napravena_rezervacija_od_patnik_service.findAllByGivenEMBGAndTicket(embg, id_karta);

        req.getSession().setAttribute("rezervacii", rezervacija);
        req.getSession().setAttribute("karta", zacuvajKarta);
        req.getSession().setAttribute("embg", embg);

//        model.addAttribute("rezervacija", this.pogled_napravena_rezervacija_od_patnik_service.findAllByGivenEMBGAndTicket(embg, id_karta));

        return "redirect:/prikaziRezervacija";
    }

    @GetMapping("/prikaziRezervacija")
    public String getPreviewForReservation(){
        return "napravena_rezervacija";
    }

    @GetMapping("/allReservationsUser")
    public String getAllReservationForUser(Model model,
                                           HttpServletRequest req,
                                           @RequestParam (required = false) String embg){
        String embg1;
        if (embg==null) {
            embg1 = (String) req.getSession().getAttribute("embg");
        }
        else {
            embg1 = embg;
        }
        System.out.println(embg);

       List<pogled_napravena_rezervacija_od_patnik> pogled = this.pogled_napravena_rezervacija_od_patnik_service
                .findAllByGivenEMBG(embg1);
        model.addAttribute("usersReservations", pogled);

        return "allReservationsForUser";
    }
}
