package com.todo.todo_list.ServiceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.todo_list.Entity.todo;
import com.todo.todo_list.Repository.todoRepo;
import com.todo.todo_list.Service.todoService;

@Service
public class todoServiceImpl implements todoService{

    @Autowired
    private todoRepo todoRepo;

    public todoServiceImpl(com.todo.todo_list.Repository.todoRepo todoRepo) {
        this.todoRepo = todoRepo;
    }

    @Override
    public List<todo> allTodos() {
        return this.todoRepo.findAll();
    }

    @Override
    public todo saveTodo(todo todo) {
        return this.todoRepo.save(todo);
    }

    @Override
    public todo getTodoById(long id) {
        return this.todoRepo.findById(id).get();
    }

    @Override
    public todo editTodo(todo todo) {
        return this.todoRepo.save(todo);
    }

    @Override
    public void deleteTodo(todo todo) {
        this.todoRepo.delete(todo);
    }

    @Override
    public void deleteTodoById(Long id) {
        this.todoRepo.deleteById(id);
    }

}
