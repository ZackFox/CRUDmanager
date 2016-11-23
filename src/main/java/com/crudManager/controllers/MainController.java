package com.crudManager.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {

    @RequestMapping(method = RequestMethod.GET)
    String welcome(){
        return "index";
    }
}
