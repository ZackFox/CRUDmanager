package com.crudManager.dao;

import com.crudManager.domain.UserTask;

import java.util.List;

public interface TaskDao {
    void createTask(UserTask task);
    UserTask findTask(int id);
    List<UserTask> getTaskList();
    void updateTask(int id);
    void deleteTask(int id);
}
