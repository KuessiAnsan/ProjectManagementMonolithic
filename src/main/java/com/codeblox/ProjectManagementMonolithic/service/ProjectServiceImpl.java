package com.codeblox.ProjectManagementMonolithic.service;

import com.codeblox.ProjectManagementMonolithic.dao.ProjectRepository;
import com.codeblox.ProjectManagementMonolithic.domain.Project;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProjectServiceImpl implements IProjectService{

    private ProjectRepository projectRepository;

    @Override
    public Project createProject(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public List<Project> getProjects() {
        return projectRepository.findAll();
    }
}
