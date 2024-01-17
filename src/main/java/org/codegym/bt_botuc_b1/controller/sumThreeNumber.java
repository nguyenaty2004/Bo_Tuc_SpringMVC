package org.codegym.bt_botuc_b1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/SumThreeNumber")
public class sumThreeNumber {
    @GetMapping("")
    public String SumThreeNumber(){
        return "/SumThreeNumber";
    }
    @GetMapping("/result")
    public String Result(@RequestParam("number1") int number1
                        , @RequestParam("number2") int number2
                        , @RequestParam("number3") int number3, Model model){
        int result = number1 + number2 + number3;
        model.addAttribute("result", result);
        return "/SumThreeNumber";
    }
}
