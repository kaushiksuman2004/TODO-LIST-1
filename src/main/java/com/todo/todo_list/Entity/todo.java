package com.todo.todo_list.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "todo_list")
public class todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="work", nullable=false)
    private String work;
    @Column(name="status", nullable=false)
    private String status;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getWork() {
        return work;
    }
    public void setWork(String work) {
        this.work = work;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public todo(long id, String work, String status) {
        this.id = id;
        this.work = work;
        this.status = status;
    }
    public todo() {
    }
    
    @Override
    public String toString() {
        return "todo [id=" + id + ", work=" + work + ", status=" + status + "]";
    }

    
}
