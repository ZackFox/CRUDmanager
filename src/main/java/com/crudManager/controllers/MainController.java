package com.crudManager.controllers;


import com.crudManager.service.TaskService;
import com.crudManager.domain.UserTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import java.util.Date;

@Controller
public class MainController {

    @Autowired
    TaskService taskService;

    @RequestMapping(value ="/" , method = RequestMethod.GET)
    String welcome( Model model){
        model.addAttribute("tasklist",taskService.getTaskList());
        return "index";
    }

    @RequestMapping(value ="/" , method = RequestMethod.POST)
    String addTask(@RequestParam("task-text")String text){

        UserTask task = new UserTask();
        task.setDate(new Date());
        task.setText(text);

        taskService.createTask(task);
        return "redirect:/";
    }

    @RequestMapping(value ="/update/{id}", method = RequestMethod.GET)
    String update(@PathVariable("id")int id,@RequestParam("newText")String newText){
        UserTask task = new UserTask();
        task.setText(newText);

        taskService.updateTask(task);
        return "redirect:/";
    }

    @RequestMapping(value ="/remove/{id}", method = RequestMethod.GET)
    String delete(@PathVariable("id")int id){
        taskService.deleteTask(id);
        return "redirect:/";
    }
}
