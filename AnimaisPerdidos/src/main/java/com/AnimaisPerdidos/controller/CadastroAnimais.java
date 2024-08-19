package com.AnimaisPerdidos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CadastroAnimais {

    @GetMapping("/novo")
    public String home(Model model) {
//        model.addAttribute("message", "Bem-vindo ao Thymeleaf!");
        return "CadastroAnimais";
    }
}
