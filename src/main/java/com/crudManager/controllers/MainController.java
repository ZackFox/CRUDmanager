package com.crudManager.controllers;

import com.crudManager.service.TaskService;
import com.crudManager.domain.UserTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {

    @Autowired
    TaskService taskService;

    @RequestMapping(value ="/list" , method = RequestMethod.GET)
    String welcome(Model model){
        UserTask task = new UserTask();
        model.addAttribute("task",task);
        model.addAttribute("tasklist",taskService.getTaskList());
        return "list";
    }

    @RequestMapping(value ="list/add" , method = RequestMethod.POST)
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
        return "redirect:/list";
    }

    @RequestMapping(value ="list/update/{id}")
    String update(@PathVariable("id")int id,Model model){
        UserTask task = taskService.findTask(id);
        model.addAttribute("task",task);
        model.addAttribute("tasklist",taskService.getTaskList());
        return "list";
    }

    @RequestMapping(value ="list/remove/{id}", method = RequestMethod.GET)
    String delete(@PathVariable("id")int id){
        taskService.deleteTask(id);
        return "redirect:/list";
    }
}
