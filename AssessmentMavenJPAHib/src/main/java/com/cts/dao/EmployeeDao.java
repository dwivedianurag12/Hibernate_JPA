package com.cts.dao;

import java.util.List;


import com.cts.entity.Employee;

public interface EmployeeDao {
   void add(Employee employe);
   List<Employee> listEmployee();
}
