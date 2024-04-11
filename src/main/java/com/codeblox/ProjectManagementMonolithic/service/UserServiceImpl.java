package com.codeblox.ProjectManagementMonolithic.service;

import com.codeblox.ProjectManagementMonolithic.dao.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements IUserService{

    private UserRepository userRepository;
}
