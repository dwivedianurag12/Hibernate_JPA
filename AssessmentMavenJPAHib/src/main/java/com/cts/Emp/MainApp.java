package com.cts.Emp;

import java.sql.SQLException;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.config.AppConfig;
import com.cts.entity.Employee;
import com.cts.service.EmployeeService;

public class MainApp {
	public static void main(String[] args) throws SQLException {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		EmployeeService employeeService = context.getBean(EmployeeService.class);

		employeeService.add(new Employee("amar", "nath", "amar@example.com"));
		employeeService.add(new Employee("David", "Miller", "david.miller@example.com"));
		employeeService.add(new Employee("Manoj", "Tiwari", "manojtiwari@example.com"));
		employeeService.add(new Employee("Steeve", "Smith", "steeve.smith@example.com"));

		List<Employee> persons = employeeService.listPersons();
		for (Employee person : persons) {
			System.out.println("Id = " + person.getId());
			System.out.println("First Name = " + person.getFirstName());
			System.out.println("Last Name = " + person.getLastName());
			System.out.println("Email = " + person.getEmail());
			System.out.println();
		}

		context.close();
	}
}
