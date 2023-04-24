package com.example.springtransational.controller;

import com.example.springtransational.request.EmployeeRequest;
import com.example.springtransational.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

  @Autowired
  private EmployeeService employeeService;

  @PostMapping("/employee")
  public String saveEmployee(@RequestBody EmployeeRequest employeeRequest){
    return employeeService.saveEmployee(employeeRequest);
  }
}
