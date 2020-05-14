package com.hk.herokudemo.repository;

import com.hk.herokudemo.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
