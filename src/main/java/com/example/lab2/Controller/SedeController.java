package com.example.lab2.Controller;

import com.example.lab2.Entity.Auto;
import com.example.lab2.Entity.Sede;
import com.example.lab2.Repository.SedeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sede")
public class SedeController {
    final SedeRepository sedeRepository;

    public SedeController(SedeRepository sedeRepository) {this.sedeRepository = sedeRepository;}

    @GetMapping(value = {"","/"})
    public String listaSedes(Model model) {
        model.addAttribute("listaSedes", sedeRepository.findAll());
        return "sede/lista";
    }

    @GetMapping("/new")
    public String newSedeForm(Model model) {
        return "sede/form";
    }

    @PostMapping("/save")
    public String saveSede(Sede sede, Model model) {
        sedeRepository.save(sede);
        return "redirect:/sede";
    }
}
