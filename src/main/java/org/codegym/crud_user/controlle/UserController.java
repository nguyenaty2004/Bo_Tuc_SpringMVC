package org.codegym.crud_user.controlle;

import org.codegym.crud_user.model.User;
import org.codegym.crud_user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/index")
public class UserController {
    @Autowired
    public UserService userService;
    @GetMapping()
    public String home(Model model) {
        List<User> userList = userService.getAllListUsers();
        model.addAttribute("userList", userList);
        return "/index";
    }
    @GetMapping("/add-user")
    public String addUser(Model model){
        User user = new User();
        model.addAttribute("user", user);
        return "/create";
    }
    @PostMapping("/create")
    public String createUser(@ModelAttribute("user")User user, Model model){
        userService.addUser(user);
        return "/create";
    }
    @PostMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") int id){
        userService.delete(id);
        return "redirect:/index";
    }
    @GetMapping("/{id}/update")
        public String updateUser(@PathVariable("id") int id ,Model model){
        User user =userService.findById(id);
        model.addAttribute("user",user) ;
        return "/edit";
    }
    @PostMapping("/update")
    public String editUser(@ModelAttribute("user") User user){
        userService.update(user);
        return "redirect:/index";
    }
}