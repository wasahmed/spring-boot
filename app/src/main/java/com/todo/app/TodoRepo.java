package com.todo.app;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepo extends CrudRepository<Todo, Integer>{
    @Query("FROM Todo order by id ")
    List<Todo> printAll();



}
