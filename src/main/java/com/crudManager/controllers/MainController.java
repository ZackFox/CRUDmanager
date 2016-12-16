package com.crudManager.controllers;


import com.crudManager.service.TaskService;
import com.crudManager.domain.UserTask;
import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class MainController {

    @Autowired
    TaskService taskService;

    @RequestMapping(value ="/" , method = RequestMethod.GET)
    String welcome(Model model){
        UserTask task = new UserTask();
        model.addAttribute("task",task);
        model.addAttribute("tasklist",taskService.getTaskList());
        return "index";
    }

    @RequestMapping(value ="/add" , method = RequestMethod.POST)
    String addTask(@RequestParam("taskId")String id,
                   @RequestParam("taskText")String text,
                   @RequestParam("taskDate")String date,
                   @RequestParam("taskTime")String time){

        UserTask task = new UserTask();
        task.setText(text);
        task.setDate(task.concateDate(date,time));

        int parseId = Integer.parseInt(id);
        if(parseId==0){
            taskService.createTask(task);}
        else{
            task.setId(parseId);
            taskService.updateTask(task);
        }
        return "redirect:/";
    }

    @RequestMapping(value ="/update/{id}")
    String update(@PathVariable("id")int id,Model model){
        UserTask task = taskService.findTask(id);
        model.addAttribute("task",task);
        model.addAttribute("tasklist",taskService.getTaskList());
        return "index";
    }

    @RequestMapping(value ="/remove/{id}", method = RequestMethod.GET)
    String delete(@PathVariable("id")int id){
        taskService.deleteTask(id);
        return "redirect:/";
    }
}
