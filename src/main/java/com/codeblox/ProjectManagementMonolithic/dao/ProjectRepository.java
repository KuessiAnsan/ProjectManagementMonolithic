package com.codeblox.ProjectManagementMonolithic.dao;

import com.codeblox.ProjectManagementMonolithic.domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
