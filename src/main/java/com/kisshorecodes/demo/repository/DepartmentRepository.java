package com.kisshorecodes.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kisshorecodes.demo.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
