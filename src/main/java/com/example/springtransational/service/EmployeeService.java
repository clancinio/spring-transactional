package com.example.springtransational.service;

import com.example.springtransational.entity.Department;
import com.example.springtransational.entity.Employee;
import com.example.springtransational.repository.DepartmentRepository;
import com.example.springtransational.repository.EmployeeRepository;
import com.example.springtransational.request.EmployeeRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService {

  @Autowired
  private EmployeeRepository employeeRepository;
  @Autowired
  private DepartmentRepository departmentRepository;

  @Transactional
  public String saveEmployee(EmployeeRequest employeeRequest){

    Department department = Department.builder()
        .departmentName(employeeRequest.getDepartmentName())
        .departmentCode(employeeRequest.getDepartmentName())
        .build();

    long id = departmentRepository.save(department).getId();

    // Throw IllegalArgumentException
    Employee employee = null;

    employeeRepository.save(employee);
    // The Department entry will be rolled back because this entry fails
    return "Employee is saved with id: " + employee.getId();
  }
}
