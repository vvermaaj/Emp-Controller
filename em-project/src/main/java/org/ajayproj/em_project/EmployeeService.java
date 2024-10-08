package org.ajayproj.em_project;

import java.util.List;

public interface EmployeeService {
    String creatEmployee(Employee employee);

    List<Employee> readEmployees();

    boolean deleteEmployee(Long id);

    String UpdateEmployee(Long id, Employee employee);

    Employee readEmployee(Long id);

}
