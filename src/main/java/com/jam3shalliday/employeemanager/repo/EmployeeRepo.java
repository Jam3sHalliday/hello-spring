package com.jam3shalliday.employeemanager.repo;

import com.jam3shalliday.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);

    Optional<Employee>  findEmployeeById(Long id);

}
