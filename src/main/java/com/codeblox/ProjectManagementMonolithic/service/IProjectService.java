package com.codeblox.ProjectManagementMonolithic.service;

import com.codeblox.ProjectManagementMonolithic.domain.Project;

import java.util.List;

public interface IProjectService {
    Project createProject(Project task);

    List<Project> getProjects();
}
