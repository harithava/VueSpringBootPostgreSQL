package com.maersk.springbootbackend;

import com.maersk.springbootbackend.employee.domain.Employee;
import com.maersk.springbootbackend.employee.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
//		Employee employee1 = Employee.builder()
//				.firstName("fn1")
//				.lastName("ln1")
//				.email("mail1@mail.com")
//				.id(0).build();
//
//		Employee employee2 = Employee.builder()
//				.firstName("fn2")
//				.lastName("ln2")
//				.email("mail2@mail.com")
//				.id(0).build();
//
//		Employee employee3 = Employee.builder()
//				.firstName("fn3")
//				.lastName("ln3")
//				.email("mail3@mail.com")
//				.id(0).build();
//
//		employeeRepository.save(employee1);
//		employeeRepository.save(employee2);
//		employeeRepository.save(employee3);
	}

}
