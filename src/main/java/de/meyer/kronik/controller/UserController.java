package de.meyer.kronik.controller;


import de.meyer.kronik.entities.User;
import de.meyer.kronik.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping("/user")
public class UserController {


    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository ur) {
        this.userRepository = ur;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String users(Model model) {
        model.addAttribute(userRepository.findAll());
        return "users";
    }

    @RequestMapping(value = "/registerNewUser", method = GET)
    public String showRegisterNewUser() {
        return "registerNewUser";
    }

    @RequestMapping(value = "/registerNewUser", method = POST)
    public String registerNewUser(User user) {
        userRepository.save(user);

        return "redirect:/";

    }
}
