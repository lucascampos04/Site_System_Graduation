package com.colegio.jorgina.colegiojorginasite.controller;

import com.colegio.jorgina.colegiojorginasite.model.Entity.LogFuncionario;
import com.colegio.jorgina.colegiojorginasite.model.LogFuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LogFuncionarioRepository logFuncionarioRepository;

    @GetMapping
    public ModelAndView login(){
        ModelAndView mv = new ModelAndView("Login");
        mv.addObject("error", "Estamos em manuntenção no momento.");
        return mv;
    }

    public String loginSubmit(@RequestParam int matricula, @RequestParam String senha, Model model){
        LogFuncionario logFuncionario = logFuncionarioRepository.findById(matricula).orElse(null);

        if (logFuncionario != null && logFuncionario.getSenha().equals(senha)){
            return "redirect:/";
        } else {
            model.addAttribute("error", "Credenciais invalidas");
            return "login";
        }
    }
}
