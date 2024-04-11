package com.codeblox.ProjectManagementMonolithic.controller;

import com.codeblox.ProjectManagementMonolithic.domain.Project;
import com.codeblox.ProjectManagementMonolithic.service.ProjectServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("projects")
@AllArgsConstructor
public class ProjectController {

    private ProjectServiceImpl projectService;

    @PostMapping
    public ResponseEntity<Project> createProject(@RequestBody Project task){
        Project createdProject = projectService.createProject(task);
        return new ResponseEntity<>(createdProject, OK);
    }

    @GetMapping
    public ResponseEntity<List<Project>> getProjects(){
        List<Project> foundProjects = projectService.getProjects();
        return new ResponseEntity<>(foundProjects, OK);
    }
}
