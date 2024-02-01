package net.javaguides.emsbackend.controller;


import lombok.AllArgsConstructor;
import net.javaguides.emsbackend.dto.EmployeeDto;
import net.javaguides.emsbackend.entity.Employee;
import net.javaguides.emsbackend.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@AllArgsConstructor
@RequestMapping("/api/employees")

public class EmployeeController
{
    private EmployeeService employeeService;

    //build Add Employee rest API
    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto){
        EmployeeDto savedEmployee = employeeService.createEmployee(employeeDto);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }
    // build Get Employee Rest API
    @GetMapping("{id}")
    public  ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable("id") Long employeeId){
        EmployeeDto employeeDto = employeeService.getEmplolyeeById(employeeId);
        return ResponseEntity.ok(employeeDto);
    }
    // Build Get All Employee Rest API
    @GetMapping
    public ResponseEntity<List<EmployeeDto>> getAllEmployees(){
        List<EmployeeDto> employees =employeeService.getAllEmployees();
        return ResponseEntity.ok(employees);
    }
    // Build Update Employee Rest Api
    @PutMapping("{id}")
    public ResponseEntity<EmployeeDto> updateEmployee(@PathVariable("id") Long employeeId,
                                                      @RequestBody EmployeeDto updatedEmplloyee)
    {
        EmployeeDto employeeDto=employeeService.updateEmployee(employeeId,updatedEmplloyee);
       return ResponseEntity.ok(employeeDto);
    }
    // build delete employee rest api
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id")Long employeeId){
        employeeService.deleteEmployee(employeeId);
        return ResponseEntity.ok("Employee deleted successfully");
    }
}
