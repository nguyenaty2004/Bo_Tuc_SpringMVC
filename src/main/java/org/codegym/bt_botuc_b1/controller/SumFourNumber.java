package org.codegym.bt_botuc_b1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("SumFourNumber")

public class SumFourNumber {
    @GetMapping("")
    public String SumForNumber() {
        return "/SumFourNumber";
    }

    @GetMapping("result")
    public String SumForNumberResult(@RequestParam("number1") Long number1,
                                     @RequestParam("number2") Long number2,
                                     @RequestParam("number3") Long number3,
                                     @RequestParam("number4") Long number4, Model model) {
        Long result = number1 + number2 + number3 + number4;
        model.addAttribute("result", result);
        return "/SumFourNumber";
    }

}
