package com.todo.todo_list.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todo.todo_list.Entity.todo;

@Repository
public interface todoRepo extends JpaRepository<todo, Long>{
    
}
