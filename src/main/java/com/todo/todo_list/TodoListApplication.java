package com.todo.todo_list;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.todo.todo_list.Entity.todo;
import com.todo.todo_list.Repository.todoRepo;

@SpringBootApplication
public class TodoListApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TodoListApplication.class, args);
	}

	@Autowired
	private todoRepo todoRepo;
	
	@Override
	public void run(String... args) throws Exception {
		// todo todo1 = new todo(1, "study", "success");
		// todoRepo.save(todo1);
		// todo todo2 = new todo(2, "eating", "failed");
		// todoRepo.save(todo2);
		// todo todo3 = new todo(3, "sleep", "success");
		// todoRepo.save(todo3);

		// this.todoRepo.saveAll(List.of(todo1, todo2, todo3));
	}

}
