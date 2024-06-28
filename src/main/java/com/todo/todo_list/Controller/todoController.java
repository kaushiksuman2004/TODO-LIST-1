package com.todo.todo_list.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.todo.todo_list.Entity.todo;
import com.todo.todo_list.Service.todoService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;






@Controller
public class todoController {

    @Autowired
    private todoService todoService;

    public todoController(todoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/todo-list")
    public String getAllData(Model model) {
        model.addAttribute("todo", todoService.allTodos());
        return "todo_list";
    }
    
    @GetMapping("/todo/add")
    public String addData(Model model) {
        model.addAttribute("todo", new todo());
        return "todo_add";
    }

    @PostMapping("/todo-list")
    public String saveData(@ModelAttribute("todo") todo todo) {
        this.todoService.saveTodo(todo);
        return "redirect:/todo-list";
    }
    
    @GetMapping("/todo/edit/{id}")
    public String editData(@PathVariable Long id, Model model) {
        model.addAttribute("todo", todoService.getTodoById(id));
        return "todo_edit";
    }
    
    @PostMapping("/todo/{id}")
    public String updateTodo(@PathVariable Long id, @ModelAttribute("todo") todo todo, Model model) {
        this.todoService.editTodo(todo);
        return "redirect:/todo-list";
    }
    
    @GetMapping("/todo/delete/{id}")
    public String deleteTodo(@PathVariable Long id) {
        todoService.deleteTodo(todoService.getTodoById(id));
        return "redirect:/todo-list";
    }
    
}
