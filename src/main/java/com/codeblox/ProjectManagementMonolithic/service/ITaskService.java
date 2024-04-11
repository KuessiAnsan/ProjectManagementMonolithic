package com.codeblox.ProjectManagementMonolithic.service;

import com.codeblox.ProjectManagementMonolithic.domain.Task;

import java.util.List;

public interface ITaskService {
    Task createTask(Task task);

    List<Task> getTasks();
}
