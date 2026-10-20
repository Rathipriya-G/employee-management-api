
package com.rathipriya.employee_management_api.repository;

import com.rathipriya.employee_management_api.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}

