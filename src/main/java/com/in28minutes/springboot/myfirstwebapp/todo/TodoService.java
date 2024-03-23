package com.in28minutes.springboot.myfirstwebapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos;

    static {
        todos = new ArrayList<>();
        todos.add(
                new Todo(1, "Vegas", "Learn AWS",
                        LocalDate.now().plusYears(1), false));

        todos.add(
                new Todo(2, "Vegas", "Learn DevOps",
                        LocalDate.now().plusYears(2), false));

        todos.add(
                new Todo(3, "Vegas", "Learn Full Stack Development",
                        LocalDate.now().plusYears(3), false));
    }

    public List<Todo> findByUsername(String username) {
        return todos;
    }
}
