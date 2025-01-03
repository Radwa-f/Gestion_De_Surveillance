package com.example.demo.repository;

import com.example.demo.model.Departement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DepartementRepository extends JpaRepository<Departement, Long> {
    Optional<Departement> findByDepartmentName(String departmentName);
}
