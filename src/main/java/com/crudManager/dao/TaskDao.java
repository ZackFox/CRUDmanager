package com.crudManager.dao;

import com.crudManager.domain.UserTask;

import java.util.List;

public interface TaskDao {
    void createTask(UserTask task);
    UserTask findTask(int id);
    List<UserTask> getTaskList();
    void updateTask(UserTask task);
    void deleteTask(int id);
}
