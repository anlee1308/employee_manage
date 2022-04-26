package com.example.demo.controller;

import com.example.demo.model.EmployeeModel;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    EmployeeService employeeService;
//CRUD api
    //create employee
    @PostMapping()
    public ResponseEntity<EmployeeModel> saveEmployee(@RequestBody EmployeeModel employee){
        return new ResponseEntity<EmployeeModel>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
    }
    //get all employee
    @GetMapping(value = "/list")
    public List<EmployeeModel> getAllEmployees(){
        return employeeService.getAllEmployees();
    }
    //update employee
    @PutMapping("{id}")
    public ResponseEntity<EmployeeModel> updateEmployee(@PathVariable("id") long id
            ,@RequestBody EmployeeModel employee){
        return new ResponseEntity<EmployeeModel>(employeeService.updateEmployee(employee, id), HttpStatus.OK);
    }
    //delete employee
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") long id){

        // delete employee from DB
        employeeService.deleteEmployee(id);

        return new ResponseEntity<String>("Employee deleted successfully!.", HttpStatus.OK);
    }
    //get one employee
    @GetMapping(value = "{id}")
    public ResponseEntity<EmployeeModel> findEmployeeById(@PathVariable ("id") long employeeId){
//        return employeeService.getEmployeeById(employeeId);
        System.out.println(employeeId);
        return new ResponseEntity<EmployeeModel>(employeeService.getEmployeeById(employeeId), HttpStatus.OK);
    }
}
