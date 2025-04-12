package com.example.lab2.Controller;

import com.example.lab2.Repository.AutoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auto")
public class AutoController {
    final AutoRepository autoRepository;

    public AutoController(AutoRepository autoRepository) {this.autoRepository = autoRepository;}

    @GetMapping(value = {"", "/"})
    public String listaAutos(Model model) {
        model.addAttribute("listaAutos", autoRepository.findAll());
        return "auto/lista";
    }
}
