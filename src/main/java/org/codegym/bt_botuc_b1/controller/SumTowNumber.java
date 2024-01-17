package org.codegym.bt_botuc_b1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/home")
public class SumTowNumber {
    @GetMapping("")
    public String Home(){
        return "/home";
    }

    @GetMapping("/sum")
    public String Result(@RequestParam("number1") int number1, @RequestParam("number2") int number2, Model model){
        int result = number1 + number2;
        model.addAttribute("result", result);
        return "/home";
    }
}
