package com.codeblox.ProjectManagementMonolithic.service;

import com.codeblox.ProjectManagementMonolithic.dao.TaskRepository;
import com.codeblox.ProjectManagementMonolithic.domain.Task;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TaskServiceImpl implements ITaskService{

    private TaskRepository taskRepository;

    @Override
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public List<Task> getTasks() {
        return taskRepository.findAll();
    }
}
