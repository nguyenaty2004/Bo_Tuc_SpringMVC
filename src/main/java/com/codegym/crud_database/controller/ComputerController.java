package com.codegym.crud_database.controller;

import com.codegym.crud_database.model.Computer;
import com.codegym.crud_database.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/computers")
public class ComputerController {
    @Autowired
    private ComputerService computerService;

    @GetMapping()
    public String getAllComputers(Model model) {
        List<Computer> list = computerService.getAllComputer();
        model.addAttribute("computers", list);
        return "/index";
    }

    @GetMapping("/add-computer")
    public String formAddComputer(Model model) {
        Computer computers = new Computer();
        model.addAttribute("computer", computers);
        return "/create";
    }

    @PostMapping("/create")
    public String addComputer(@ModelAttribute("computer") Computer computer) {
        computerService.add(computer);
        return "redirect:/computers";
    }

    @GetMapping("/edit/{id}")
    public String formEditComputer(@PathVariable int id, Model model) {
        model.addAttribute("computer", computerService.getComputerById(id));
        return "/edit";
    }

    @PostMapping("/edit")
    public String editComputer(@ModelAttribute("computer") Computer computer) {
        computerService.update(computer);
        return "redirect:/computers";
    }

    @PostMapping("/delete/{id}")
    public String deleteComputer(@PathVariable int id) {
        computerService.deleteById(id);
        return "redirect:/computers";
    }

    @GetMapping("/search")
    public String searchComputer(@RequestParam("name") String name, Model model) {
        model.addAttribute("computers", computerService.search(name));
        return "/index";
    }
}
