package org.example.exceptionsrestapi.repository;

import org.example.exceptionsrestapi.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
