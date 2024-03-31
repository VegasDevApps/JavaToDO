package com.in28minutes.springboot.myfirstwebapp.todo;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class TodoService {
    private static List<Todo> todos;
    private static int todoCounter = 0;

    static {
        todos = new ArrayList<>();
        todos.add(
                new Todo(++todoCounter, "Vegas", "Learn AWS 1",
                        LocalDate.now().plusYears(1), false));

        todos.add(
                new Todo(++todoCounter, "Vegas", "Learn DevOps 1",
                        LocalDate.now().plusYears(2), false));

        todos.add(
                new Todo(++todoCounter, "Vegas", "Learn Full Stack Development 1",
                        LocalDate.now().plusYears(3), false));
    }

    public List<Todo> findByUsername(String username) {
        Predicate<Todo> predicate = todo -> todo.getUsername().equalsIgnoreCase(username);
        return todos.stream().filter(predicate).toList();
    }

    public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
        Todo todo = new Todo(++todoCounter, username, description, targetDate, done);
        todos.add(todo);
    }

    public void deleteById(int id) {
        Predicate<Todo> predicate = todo -> todo.getId() == id;
        todos.removeIf(predicate);
    }

    public Todo finById(int id) {
        Predicate<Todo> predicate = todo -> todo.getId() == id;
        return  todos.stream().filter(predicate).findFirst().get();
    }

    public void updateTodo(@Valid Todo todo) {
        deleteById(todo.getId());
        todos.add(todo);
    }
}
