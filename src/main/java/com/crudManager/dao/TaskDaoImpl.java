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
        List<UserTask> results = entityManager.createQuery("SELECT с FROM UserTask с").getResultList();;
        return results;
    }

    public void updateTask(UserTask task) {
        entityManager.merge(task);
    }

    public void deleteTask(int id) {
        entityManager.remove(entityManager.find(UserTask.class,id));
    }
}
