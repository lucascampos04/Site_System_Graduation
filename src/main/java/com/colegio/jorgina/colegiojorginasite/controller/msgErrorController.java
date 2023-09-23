package com.colegio.jorgina.colegiojorginasite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class msgErrorController {

    @GetMapping
    public ModelAndView error(){
        ModelAndView mv = new ModelAndView("error");
        mv.addObject("error", "Estamos em manuntenção no momento.");
        return mv;
    }
}
