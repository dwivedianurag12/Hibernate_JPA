package com.cts.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.cts.entity.Employee;

@Repository
public class EmployeeDaoImp implements EmployeeDao {

	@PersistenceContext
	private EntityManager em;

	public void add(Employee employee) {
		em.persist(employee);
	}

	public List<Employee> listEmployee() {
		CriteriaQuery<Employee> criteriaQuery = em.getCriteriaBuilder().createQuery(Employee.class);
		@SuppressWarnings("unused")
		Root<Employee> root = criteriaQuery.from(Employee.class);
		return em.createQuery(criteriaQuery).getResultList();
	}

}
