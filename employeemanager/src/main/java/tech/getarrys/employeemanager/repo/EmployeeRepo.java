package tech.getarrys.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarrys.employeemanager.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);

    Employee findEmployeeById(Long id);
}
