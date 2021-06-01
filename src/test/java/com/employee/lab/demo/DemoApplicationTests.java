package com.employee.lab.demo;

import com.employee.lab.demo.models.Department;
import com.employee.lab.demo.models.Employee;
import com.employee.lab.demo.models.Project;
import com.employee.lab.demo.repositories.DepartmentRepository;
import com.employee.lab.demo.repositories.EmployeeRepository;
import com.employee.lab.demo.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void createEmployeeAndDepartment(){
		Department department = new Department("IT");
		departmentRepository.save(department);

		Employee robertha = new Employee("Robertha", 2323, department);
		employeeRepository.save(robertha);
	}

	@Test
	public void addEmployeesAndObjects(){
		Department department = new Department("finance");
		departmentRepository.save(department);

		Department department2 = new Department("HR");
		departmentRepository.save(department2);

		Employee steve = new Employee("Steve", 29353, department);
		employeeRepository.save(steve);

		Employee emily = new Employee("Emily", 9999, department2);
		employeeRepository.save(emily);

		Project project = new Project("Project Zeus", 42);
		projectRepository.save(project);

		Project project2 = new Project("Project Alpha", 10);
		projectRepository.save(project2);

		project.addEmployee(steve);
		projectRepository.save(project);

		project.addEmployee(emily);
		projectRepository.save(project);

		project2.addEmployee(emily);
		projectRepository.save(project2);

	}

}
