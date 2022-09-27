package com.application.service;

import java.util.List;

import com.application.exception.ResourceNotFoundException;
import com.application.model.Employee;


public interface EmployeeService {

	 Employee addEmployee(Employee employee);
	 List<Employee> getEmployee();
	 Employee getEmployeeById(String employeeId) throws ResourceNotFoundException;
	 Employee updateEmployee(Employee employee) throws ResourceNotFoundException;
	 void deleteEmployeeById(String employeeId) throws ResourceNotFoundException;
	 List<Employee> sortEmployeeBySalary();
}
