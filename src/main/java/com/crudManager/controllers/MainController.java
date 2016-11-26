package com.crudManager.controllers;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @RequestMapping(value ="/" , method = RequestMethod.GET)
    String welcome(){
        return "index";
    }

    @RequestMapping(value ="/" , method = RequestMethod.POST)
    String addTask(@RequestParam("task") String task, Model model){
        model.addAttribute("task",task);
        System.out.println(task);
        return "index";
    }
}
