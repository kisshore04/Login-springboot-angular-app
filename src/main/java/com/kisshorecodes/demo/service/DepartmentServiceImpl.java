package com.kisshorecodes.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kisshorecodes.demo.entity.Department;
import com.kisshorecodes.demo.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Override
	public Department saveDepartment(Department department) {
		
		return departmentRepository.save(department);
	}
	
	public List<Department> fetchDepartment() {
		return departmentRepository.findAll();
	}
}
