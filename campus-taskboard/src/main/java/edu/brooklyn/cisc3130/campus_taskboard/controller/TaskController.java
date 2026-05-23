package edu.brooklyn.cisc3130.campus_taskboard.controller;

import edu.brooklyn.cisc3130.campus_taskboard.model.Task;
import edu.brooklyn.cisc3130.campus_taskboard.service.TaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public ResponseEntity<List<Task>> getAllTasks() {
        return ResponseEntity.ok(taskService.getAllTasks());
    }

    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody Task task) {
        Task created = taskService.createTask(task);
        return ResponseEntity.ok(created);
    }

    @GetMapping("/completed")
    public ResponseEntity<List<Task>> getCompletedTasks() {
        List<Task> tasks = taskService.getCompletedTasks();
        return ResponseEntity.ok(tasks);
    }

    @GetMapping("/incomplete")
    public ResponseEntity<List<Task>> getIncompleteTasks() {
        List<Task> tasks = taskService.getIncompleteTasks();
        return ResponseEntity.ok(tasks);
    }

    @GetMapping("/priority/{priority}")
    public ResponseEntity<List<Task>> getTasksByPriority(@PathVariable String priority) {
        try {
            Task.Priority priorityEnum = Task.Priority.valueOf(priority.toUpperCase());
            List<Task> tasks = taskService.getTasksByPriority(priorityEnum);
            return ResponseEntity.ok(tasks);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/search")
    public ResponseEntity<List<Task>> searchTasks(@RequestParam String keyword) {
        List<Task> tasks = taskService.searchTasks(keyword);
        return ResponseEntity.ok(tasks);
    }

    @GetMapping("/paginated")
    public ResponseEntity<Page<Task>> getTasksPaginated(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy) {

        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        Page<Task> tasks = taskService.getAllTasks(pageable);
        return ResponseEntity.ok(tasks);
    }
}
