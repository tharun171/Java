package com.learn.spring.ProjectDao;

import org.springframework.data.repository.CrudRepository;

import com.learn.spring.Entities.EmployeeEntity;

public interface CrudRepoDao extends CrudRepository<EmployeeEntity,Integer>{

}