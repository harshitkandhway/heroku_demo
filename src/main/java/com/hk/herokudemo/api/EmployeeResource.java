package com.hk.herokudemo.api;

import com.hk.herokudemo.domain.Employee;
import com.hk.herokudemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class EmployeeResource {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public String sayHello() {
        return "Hello World!";
    }

    @PostMapping
    public ResponseEntity<Employee> createEmploee(@RequestBody Employee employee){
        Employee saved = employeeService.create(employee);
        return ResponseEntity.status(HttpStatus.OK).body(saved);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") int id) {
        Optional<Employee> byId = employeeService.findById(id);
        if (byId.isPresent())
            return ResponseEntity.ok(byId.get());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
