package com.in28minutes.springboot.myfirstwebapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos;
    private static int todoCounter = 0;

    static {
        todos = new ArrayList<>();
        todos.add(
                new Todo(++todoCounter, "Vegas", "Learn AWS",
                        LocalDate.now().plusYears(1), false));

        todos.add(
                new Todo(++todoCounter, "Vegas", "Learn DevOps",
                        LocalDate.now().plusYears(2), false));

        todos.add(
                new Todo(++todoCounter, "Vegas", "Learn Full Stack Development",
                        LocalDate.now().plusYears(3), false));
    }

    public List<Todo> findByUsername(String username) {
        return todos;
    }

    public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
        Todo todo = new Todo(++todoCounter, username, description, targetDate, done);
        todos.add(todo);
    }
}
