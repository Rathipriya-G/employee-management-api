
package com.rathipriya.employee_management_api.service;

import com.rathipriya.employee_management_api.entity.Employee;
import com.rathipriya.employee_management_api.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Optional<Employee> updateEmployee(Long id, Employee updatedEmployee) {
        return employeeRepository.findById(id).map(employee -> {
            employee.setName(updatedEmployee.getName());
            employee.setEmail(updatedEmployee.getEmail());
            return employeeRepository.save(employee);
        });
    }

    public boolean deleteEmployee(Long id) {
        if (!employeeRepository.existsById(id)) {
            return false;
        }

        employeeRepository.deleteById(id);
        return true;
    }

    public List<Employee> searchEmployeesByName(String name) {
        return employeeRepository.searchByName(name);
    }
}

