package org.ajayproj.em_project;

import org.springframework.data.jpa.repository.JpaRepository;

@Reposistory
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

}
