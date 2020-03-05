package com.cts.service;

import java.util.List;

import com.cts.entity.Employee;


public interface EmployeeService {
    void add(Employee person);
    List<Employee> listPersons();
}
