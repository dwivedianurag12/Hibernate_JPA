package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.dao.EmployeeDao;

import com.cts.entity.Employee;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	private EmployeeDao userDao;

	@Transactional

	public void add(Employee person) {
		userDao.add(person);
	}

	@Transactional(readOnly = true)
	public List<Employee> listPersons() {
		return userDao.listEmployee();
	}

}
