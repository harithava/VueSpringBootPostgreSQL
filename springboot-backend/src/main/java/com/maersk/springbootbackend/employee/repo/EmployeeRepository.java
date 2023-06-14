package com.maersk.springbootbackend.employee.repo;

import com.maersk.springbootbackend.employee.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {}