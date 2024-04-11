package com.codeblox.ProjectManagementMonolithic.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_entity")
public class User extends BaseEntity{

    @OneToMany(mappedBy = "assignee")
    private Set<Task> tasks;

    private String email;
}
