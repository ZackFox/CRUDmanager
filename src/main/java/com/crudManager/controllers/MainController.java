package com.crudManager.controllers;


import com.crudManager.dao.TaskDao;
import com.crudManager.domain.UserTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    TaskDao taskDao;

    @RequestMapping(value ="/" , method = RequestMethod.GET)
    String welcome( Model model){
        model.addAttribute("tasklist",taskDao.getTaskList());
        return "index";
    }

    @RequestMapping(value ="/" , method = RequestMethod.POST)
    String addTask(@RequestParam("task-text")String text){

        UserTask task = new UserTask();

//        Calendar cal = Calendar.getInstance();
        task.setDate(new Date());
        task.setText(text);
        taskDao.createTask(task);

        return "redirect:/";
    }
}
