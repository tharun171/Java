package com.learn.spring.ProjectDao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.spring.Entities.EmployeeEntity;

public interface JpaRepoDao extends JpaRepository<EmployeeEntity,Integer>
{

}