package de.meyer.kronik.controller;


import de.meyer.kronik.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {

    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository arg) {
        this.userRepository = arg;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String users(Model model) {
        model.addAttribute(userRepository.findUsers(Long.MAX_VALUE,20));
        return "users";
    }
}
