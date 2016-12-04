package com.crudManager.service;

import com.crudManager.domain.UserTask;

import java.util.List;

public interface TaskService {
    void createTask(UserTask task);
    UserTask findTask(int id);
    List<UserTask> getTaskList();
    void updateTask(int id);
    void deleteTask(int id);
}
