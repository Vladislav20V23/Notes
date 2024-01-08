package com.notes.detail.spring.rest.controller;

import com.notes.detail.spring.rest.entity.Employee;
import com.notes.detail.spring.rest.exception_handling.EmployeeIncorrectData;
import com.notes.detail.spring.rest.exception_handling.NoSuchEmployeeException;
import com.notes.detail.spring.rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RESTController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees(){

        List<Employee> allEmployees = employeeService.getAllEmployees();

        return  allEmployees;
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id){

        Employee employee = employeeService.getEmployee(id);

        if(employee==null) {
            throw new NoSuchEmployeeException("Работника с таким id = " + id + " нет в базе!");
        }
        return  employee;
    }



}
