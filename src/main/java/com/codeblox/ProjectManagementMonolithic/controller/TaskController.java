package com.codeblox.ProjectManagementMonolithic.controller;

import com.codeblox.ProjectManagementMonolithic.domain.Task;
import com.codeblox.ProjectManagementMonolithic.service.TaskServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("tasks")
@AllArgsConstructor
public class TaskController {

    private TaskServiceImpl taskService;

    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody Task task){
        Task createdTask = taskService.createTask(task);
        return new ResponseEntity<>(createdTask, OK);
    }

    @GetMapping
    public ResponseEntity<List<Task>> getTasks(){
        List<Task> foundTasks = taskService.getTasks();
        return new ResponseEntity<>(foundTasks, OK);
    }
}
