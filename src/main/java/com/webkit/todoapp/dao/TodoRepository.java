package com.webkit.todoapp.dao;

import com.webkit.todoapp.entity.Todo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost4200")
public interface TodoRepository extends JpaRepository<Todo, Long> {
    Page<Todo> addTodo(Todo todo, Pageable pageable);
    Page<Todo> findTodoById(Long id, Pageable pageable);
    Page<Todo> deleteTodoById(Long id, Pageable pageable);
}
