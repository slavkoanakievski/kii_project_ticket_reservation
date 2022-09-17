package com.example.avtobuska_stanica.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class pregledRezervacija {

    @GetMapping("/pregledNaRezervacija")
    public String getPreviewForReservation(Model model){
        return "napravena_rezervacija";
    }
}
