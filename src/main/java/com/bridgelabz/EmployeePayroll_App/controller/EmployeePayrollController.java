package com.bridgelabz.EmployeePayroll_App.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    // GET - simple check
    @GetMapping("/")
    public String getAll() {
        return "Employee Payroll App - GET call successful";
    }

    // GET by ID
    @GetMapping("/get/{id}")
    public String getEmployee(@PathVariable int id) {
        return "Employee details for ID: " + id;
    }

    // POST
    @PostMapping("/create")
    public String createEmployee(@RequestBody String employeeData) {
        return "Created Employee: " + employeeData;
    }

    // PUT
    @PutMapping("/update")
    public String updateEmployee(@RequestBody String employeeData) {
        return "Updated Employee: " + employeeData;
    }

    // DELETE
    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id) {
        return "Deleted Employee with ID: " + id;
    }
}