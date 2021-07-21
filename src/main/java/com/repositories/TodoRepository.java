package com.repositories;

import com.entities.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
//    Iterable<Todo> findAll();
//
//    long count();
}
