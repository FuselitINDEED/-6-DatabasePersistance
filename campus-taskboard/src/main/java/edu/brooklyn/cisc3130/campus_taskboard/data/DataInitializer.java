package edu.brooklyn.cisc3130.campus_taskboard.data;

import edu.brooklyn.cisc3130.campus_taskboard.model.Task;
import edu.brooklyn.cisc3130.campus_taskboard.repository.TaskRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {
    
    private final TaskRepository taskRepository;
    
    public DataInitializer(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    
    @Override
    public void run(String... args) {
        if (taskRepository.count() == 0) {
            taskRepository.save(new Task(
                null, "Complete Homework 6", 
                "Finish Spring Data JPA assignment", 
                false, Task.Priority.HIGH, null, null));
            
            taskRepository.save(new Task(
                null, "Study for Midterm", 
                "Review chapters 1-5", 
                false, Task.Priority.HIGH, null, null));
            
            taskRepository.save(new Task(
                null, "Buy groceries", 
                "Milk, eggs, bread", 
                true, Task.Priority.LOW, null, null));

            taskRepository.save(new Task(
                null, "Clean the apartment",
                "Vacuum, mop floors, take out trash",
                false, Task.Priority.MEDIUM, null, null));

            taskRepository.save(new Task(
                null, "Prepare presentation",
                "Slides for Software Engineering class",
                false, Task.Priority.HIGH, null, null));

            taskRepository.save(new Task(
                null, "Go to the gym",
                "Leg day workout",
                true, Task.Priority.MEDIUM, null, null));

            taskRepository.save(new Task(
                null, "Pay utility bills",
                "Electricity, water, internet",
                false, Task.Priority.HIGH, null, null));

            taskRepository.save(new Task(
                null, "Call parents",
                "Weekly check‑in call",
                true, Task.Priority.LOW, null, null));

            taskRepository.save(new Task(
                null, "Read a book",
                "Continue reading 'Clean Code'",
                false, Task.Priority.MEDIUM, null, null));

            taskRepository.save(new Task(
                null, "Organize desk",
                "Sort papers and clean workspace",
                false, Task.Priority.LOW, null, null));

            taskRepository.save(new Task(
                null, "Plan weekend trip",
                "Look up places to visit and book tickets",
                false, Task.Priority.MEDIUM, null, null));

            taskRepository.save(new Task(
                null, "Refactor project code",
                "Improve structure and remove duplicates",
                false, Task.Priority.HIGH, null, null));
        }
    }
}