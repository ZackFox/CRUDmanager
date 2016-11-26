package com.crudManager.dao;

import com.crudManager.domain.UserTask;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class TaskDaoImpl implements TaskDao  {

    @PersistenceContext
    private EntityManager entityManager;

    public void createTask(UserTask task) {
       entityManager.persist(task);
    }

    public List<UserTask> getTaskList() {
        return entityManager.createQuery("SELECT u FROM myTasks u").getResultList();
    }

    public void updateTask(UserTask task) {
        entityManager.merge(task);
    }

    public void deleteTask(int id) {
        entityManager.remove(entityManager.find(UserTask.class,id));
    }
}
