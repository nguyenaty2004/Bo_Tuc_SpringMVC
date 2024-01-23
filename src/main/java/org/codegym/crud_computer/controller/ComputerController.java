package org.codegym.crud_computer.controller;

import org.codegym.crud_computer.model.Computer;
import org.codegym.crud_computer.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/computer")
public class ComputerController {
    @Autowired
    public ComputerService computerService;

    @GetMapping()
    public String home(Model model) {
        List<Computer> computerList = computerService.GetAllComputer();
        model.addAttribute("computer", computerList);
        return "/home";
    }

    @GetMapping("/add-computer")
    public String addComputer(Model model) {
        Computer computer = new Computer();
        model.addAttribute("computer", computer);
        return "/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("computer") Computer computer, Model model) {
        System.out.println("111111111111");
        computerService.AddComputer(computer);
        return "redirect:/computer";
    }

    @PostMapping("/delete/{id}")
    public String removeComputer(@PathVariable("id") int id) {
        System.out.println("111111111111");
        computerService.RemoveComputer(id);
        return "redirect:/computer";
    }
    @GetMapping("/{id}/update")
    public String update(@PathVariable("id") int id, Model model){
        System.out.println("2222222222222222222222");
        Computer computer = computerService.findById(id);
        model.addAttribute("computer", computer);
        return "/edit";
    }
    @PostMapping("/update")
    public String edit(@ModelAttribute("computer") Computer computer){
        System.out.println("8888");
        computerService.update(computer);
        System.out.println("9999");
        return "redirect:/computer";
    }
}
