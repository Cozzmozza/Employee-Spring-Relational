package com.employee.lab.demo.repositories;

import com.employee.lab.demo.models.Employee;
import com.employee.lab.demo.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
