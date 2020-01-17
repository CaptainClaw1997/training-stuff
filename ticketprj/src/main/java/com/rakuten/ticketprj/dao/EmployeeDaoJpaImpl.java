package com.rakuten.ticketprj.dao;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.rakuten.ticketprj.entity.Employee;

@Entity
public class EmployeeDaoJpaImpl implements EmployeeDao{
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void addEmployee(Employee e) {
		em.persist(e);
	}
	
	@Override
	public Employee findEmployee(int empID) {
		return em.find(Employee.class, empID);
	}
	
	@Override
	public List<Employee> showEmployees(){
		String jpql = "from Employee";
		TypedQuery<Employee> query = em.createQuery(jpql, Employee.class);
		return query.getResultList();
	}
}
