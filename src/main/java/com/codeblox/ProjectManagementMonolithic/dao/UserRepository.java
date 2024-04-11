package com.codeblox.ProjectManagementMonolithic.dao;

import com.codeblox.ProjectManagementMonolithic.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
