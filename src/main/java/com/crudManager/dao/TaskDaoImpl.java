package com.crudManager.dao;

import com.crudManager.domain.UserTask;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TaskDaoImpl implements TaskDao  {

    @PersistenceContext
    private EntityManager entityManager;

    public void createTask(UserTask task) {
       entityManager.persist(task);
    }

    public UserTask findTask(int id) {
        return entityManager.find(UserTask.class,id);
    }

    public List<UserTask> getTaskList() {
        TypedQuery<UserTask> query = entityManager.createQuery("SELECT c FROM UserTask c", UserTask.class);
        List<UserTask> results = query.getResultList();
        return results;
    }

    public void updateTask(int id) {
        entityManager.merge(entityManager.find(UserTask.class,id));
    }

    public void deleteTask(int id) {
        entityManager.remove(entityManager.find(UserTask.class,id));
    }
}
