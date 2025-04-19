package com.academy.demo.controller;

import com.academy.demo.model.entity.Employee;
import com.academy.demo.service.EmployeeService;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping(value = "/employees")
    public List<Employee> getEmployee() {
        return employeeService.findAll();
    }
}
