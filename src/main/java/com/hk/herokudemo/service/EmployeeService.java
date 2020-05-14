package com.hk.herokudemo.service;

import com.hk.herokudemo.domain.Employee;
import com.hk.herokudemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Optional<Employee> findById(int id){
        return employeeRepository.findById(id);
    }

    public Employee create(Employee employee) {
        return employeeRepository.save(employee);
    }
}
