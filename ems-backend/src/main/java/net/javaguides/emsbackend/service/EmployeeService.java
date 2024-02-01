package net.javaguides.emsbackend.service;

import net.javaguides.emsbackend.dto.EmployeeDto;
import net.javaguides.emsbackend.entity.Employee;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmplolyeeById(Long employeeId);

   List<EmployeeDto> getAllEmployees();

   EmployeeDto updateEmployee(Long employeeId,EmployeeDto updatedEmployee);

   EmployeeDto deleteEmployee(Long employeeId);
}
