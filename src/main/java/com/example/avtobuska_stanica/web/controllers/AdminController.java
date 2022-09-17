package com.example.avtobuska_stanica.web.controllers;

import com.example.avtobuska_stanica.Model.Views.broj_rezervacii_i_suma_spored_patnik;
import com.example.avtobuska_stanica.Model.Views.izvestaj_spored_ruta;
import com.example.avtobuska_stanica.Model.Views.procent_mazi_i_zeni_patuvanja;
import com.example.avtobuska_stanica.Model.Views.profit_spored_mesec_i_godina;
import com.example.avtobuska_stanica.Model.patnik;
import com.example.avtobuska_stanica.Service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AdminController {

    private final broj_rezervacii_i_suma_spored_patnik_Service brojRezervaciiISumaSporedPatnikService;
    private final procent_mazi_i_zeni_patuvanja_Service procentMaziIZeniPatuvanjaService;
    private final profit_spored_mesec_i_godina_Service profitSporedMesecIGodinaService;
    private final izvestaj_spored_ruta_Service izvestajSporedRutaService;
    private final patnikService patnikService;


    public AdminController(broj_rezervacii_i_suma_spored_patnik_Service brojRezervaciiISumaSporedPatnikService, procent_mazi_i_zeni_patuvanja_Service procentMaziIZeniPatuvanjaService, profit_spored_mesec_i_godina_Service profitSporedMesecIGodinaService, izvestaj_spored_ruta_Service izvestajSporedRutaService, com.example.avtobuska_stanica.Service.patnikService patnikService) {
        this.brojRezervaciiISumaSporedPatnikService = brojRezervaciiISumaSporedPatnikService;
        this.procentMaziIZeniPatuvanjaService = procentMaziIZeniPatuvanjaService;
        this.profitSporedMesecIGodinaService = profitSporedMesecIGodinaService;
        this.izvestajSporedRutaService = izvestajSporedRutaService;
        this.patnikService = patnikService;
    }

    @GetMapping("/getChooseRole")
    public String getChooseRolePage(){
        return "adminOrUserPage";
    }

    @GetMapping("/adminIzvestai")
    public String getAdminReportsPage(Model model){
        List<procent_mazi_i_zeni_patuvanja> procent = this.procentMaziIZeniPatuvanjaService.findAll();
        procent_mazi_i_zeni_patuvanja mazi = procent.get(0);
        procent_mazi_i_zeni_patuvanja zeni = procent.get(1);
      List<broj_rezervacii_i_suma_spored_patnik> rezervaciiSporedUser =   this.brojRezervaciiISumaSporedPatnikService.findAll();
      model.addAttribute("rezervaciiSporedUser", rezervaciiSporedUser);
      model.addAttribute("mazi", mazi);
      model.addAttribute("zeni", zeni);

        return "adminIzvestai";
    }

    @GetMapping("/prikaziRutizvestaj")
    public String getRoutesReport(Model model){

        List<profit_spored_mesec_i_godina> profitMesecGodina = this.profitSporedMesecIGodinaService.findAll();
        List<izvestaj_spored_ruta> izvestajSporedRuta = this.izvestajSporedRutaService.findAll();

        model.addAttribute("profitMesecGodina", profitMesecGodina);
        model.addAttribute("izvestajSporedRuta", izvestajSporedRuta);

        return "izvestajRuti";
    }

    @GetMapping("/addUserForm")
    public String getAddNewUserForm(){

        return "add-new-user-form";
    }

    @PostMapping("/add/newUser")
    public String addNewUser(@RequestParam String embg,
                             @RequestParam String ime,
                             @RequestParam char pol){

        this.patnikService.save(new patnik(embg, ime, pol));

        return "redirect:/chooseRole";
    }

}
