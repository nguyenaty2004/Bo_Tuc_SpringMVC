package org.codegym.bt_botuc_b1.controller.Calculate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/calculate")

public class CalculateTowNumber {
    @GetMapping("")
    public String Calculate() {
        return "/Calculate";
    }

    @GetMapping("/sum")
    public String SumCalculate(@RequestParam ("option") String option,
                               @RequestParam("number1") double number1,
                               @RequestParam("number2") double number2,
                               Model model) {
        double result = 0;
        switch (option) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = number1 / number2;
                break;
        };
        model.addAttribute("result", result);
        return "/Calculate";
    }
}
