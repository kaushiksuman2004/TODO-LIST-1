package com.todo.todo_list.Service;

import java.util.List;

import com.todo.todo_list.Entity.todo;

public interface todoService {
    public List<todo> allTodos();
    public todo saveTodo(todo todo);
    public todo getTodoById(long id);
    public todo editTodo(todo todo);
    public void deleteTodo(todo todo);
    public void deleteTodoById(Long id);
}
