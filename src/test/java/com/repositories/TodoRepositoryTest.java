package com.repositories;

import com.entities.Todo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@RunWith(SpringRunner.class)
public class TodoRepositoryTest {
    @Autowired
    TodoRepository todoRepository;

    @Test
    public void check_todo_count() {

        assertEquals(3, todoRepository.count());
    }

    @Test
    public void check_todo_findAll() {

        Iterable<Todo> allTodos = todoRepository.findAll();

        assertEquals(3, todoRepository.count());
    }

    @Test
    public void findOne() {
        Optional<Todo> todo = todoRepository.findById(101L);
        assertEquals("Todo Desc 1", todo.get().getDescription());
    }

    @Test
    public void exists() {
        assertFalse(todoRepository.existsById(105L));
        assertTrue(todoRepository.existsById(101L));
    }
}
