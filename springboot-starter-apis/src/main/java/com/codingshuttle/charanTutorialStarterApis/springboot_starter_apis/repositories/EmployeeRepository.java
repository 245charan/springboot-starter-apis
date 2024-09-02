package com.codingshuttle.charanTutorialStarterApis.springboot_starter_apis.repositories;

import com.codingshuttle.charanTutorialStarterApis.springboot_starter_apis.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
}
