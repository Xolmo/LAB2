package com.example.lab2.Controller;

import com.example.lab2.Repository.SeguroRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/seguro")
public class SeguroController {
    final SeguroRepository seguroRepository;

    public SeguroController(SeguroRepository seguroRepository) {this.seguroRepository = seguroRepository;}

    @GetMapping(value = {"","/"})
    public String listaSeguros(Model model) {
        model.addAttribute("listaSeguros", seguroRepository.findAll());
        return "seguro/lista";
    }
}
