package com.application.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.application.model.Employee;



public interface EmployeeRepository extends MongoRepository<Employee, String> {

}
