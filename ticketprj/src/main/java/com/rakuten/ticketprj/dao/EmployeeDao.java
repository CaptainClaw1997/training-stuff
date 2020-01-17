package com.rakuten.ticketprj.dao;

import java.util.List;

import com.rakuten.ticketprj.entity.Employee;

public interface EmployeeDao {
	void addEmployee(Employee e);
	Employee findEmployee(int empID);
	List<Employee> showEmployees();
}
