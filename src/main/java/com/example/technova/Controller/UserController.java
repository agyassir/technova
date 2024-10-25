package com.example.technova.Controller;

import com.example.technova.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class UserController {

@Autowired
private UserService userService;

    @GetMapping("/")
    public ModelAndView index() {
        return new ModelAndView("index");
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }


}
