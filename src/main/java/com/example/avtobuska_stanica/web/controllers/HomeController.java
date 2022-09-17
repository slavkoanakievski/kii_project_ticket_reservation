package com.example.avtobuska_stanica.web.controllers;

import com.example.avtobuska_stanica.Model.patnik;
import com.example.avtobuska_stanica.Service.detalen_prikaz_na_avtobuska_ruta_Service;
import com.example.avtobuska_stanica.Service.lista_site_avtobuski_stanici_Service;
import com.example.avtobuska_stanica.Service.patnikService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class HomeController {



    public HomeController(detalen_prikaz_na_avtobuska_ruta_Service detalenPrikazNaAvtobuskaRutaService,
            lista_site_avtobuski_stanici_Service listaSiteAvtobuskiStaniciService, patnikService patnikservice) {

        this.detalenPrikazNaAvtobuskaRutaService = detalenPrikazNaAvtobuskaRutaService;
        this.listaSiteAvtobuskiStaniciService = listaSiteAvtobuskiStaniciService;
        this.patnikservice = patnikservice;
    }

    private final detalen_prikaz_na_avtobuska_ruta_Service detalenPrikazNaAvtobuskaRutaService;
    private final lista_site_avtobuski_stanici_Service listaSiteAvtobuskiStaniciService;
    private final patnikService patnikservice;

    @GetMapping("/chooseRole")
    public String getChooseRolePage(Model model){
        List<patnik> patnici = patnikservice.findAll();
        model.addAttribute("patnici", patnici);
        return "adminOrUserPage";
    }

    @GetMapping("/home")
public String getHomePage (Model model,
                           HttpServletRequest req,
                           @RequestParam (required = false) String chosenUser){

    req.getSession().setAttribute("chosenUser", chosenUser);
    model.addAttribute("avtobuski_stanici", listaSiteAvtobuskiStaniciService.findAll());


    return "home";
}



}
