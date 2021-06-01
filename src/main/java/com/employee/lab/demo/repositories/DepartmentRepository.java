package com.employee.lab.demo.repositories;

import com.employee.lab.demo.models.Department;
import com.employee.lab.demo.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
