package com.example.springtransational.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmployeeRequest {

  private String name;
  private String email;
  private String departmentName;

}
