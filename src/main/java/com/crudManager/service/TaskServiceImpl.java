package com.crudManager.service;

import com.crudManager.dao.TaskDao;
import com.crudManager.domain.UserTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Service
@Transactional
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskDao taskDao;

    @Transactional
    public void createTask(UserTask task) {
       taskDao.createTask(task);
    }

    @Transactional
    public UserTask findTask(int id) {
        return taskDao.findTask(id);
    }

    @Transactional
    public List<UserTask> getTaskList() {
        return taskDao.getTaskList();
    }

    @Transactional
    public void updateTask(UserTask task) {
        taskDao.updateTask(task);
    }
    public void deleteTask(int id) {
        taskDao.deleteTask(id);
    }
}
