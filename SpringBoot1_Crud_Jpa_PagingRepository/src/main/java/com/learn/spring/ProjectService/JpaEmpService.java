package com.learn.spring.ProjectService;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.learn.spring.Entities.EmployeeEntity;

public interface JpaEmpService {

	
	EmployeeEntity saveEmployee(EmployeeEntity entity) throws Exception;
	
	List<EmployeeEntity> getAll();
	
	EmployeeEntity getById(Integer id);
	
	EmployeeEntity updateEmp(EmployeeEntity emp);
	
	String deleteById(Integer id);
	
	public Page<EmployeeEntity> getPageOfResults(int pageNum,int entriesPerPage,String sortField);

}
