package com.learn.spring.WebControllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.learn.spring.Entities.EmployeeEntity;
import com.learn.spring.ProjectService.CrudRepoService;

//http://localhost:9090/crudEmp

//@RestController = @Controller + @ResponseBody
@Controller
@ResponseBody //converts java to json (our java output to json)
public class CrudRepoController {
	
	@Autowired
	private CrudRepoService crudRepoSer;
	
	private Logger log = LoggerFactory.getLogger(CrudRepoController.class);
	
	//it is case-sensitive in postman even caps and smalls
	@PostMapping("/crudEmp")
	public EmployeeEntity saveEmp(@RequestBody EmployeeEntity emp)
	{
		System.out.println("inside crud repo controller");
		return crudRepoSer.saveEmployee(emp);
		
	}
	
	//GET method
		@GetMapping("/crudEmp")
		public List<EmployeeEntity> getAll()
		{
			log.info("get all employees ->");
			List<EmployeeEntity> list = crudRepoSer.getAll();
			for(EmployeeEntity entity:list)
			{
				System.out.println(entity);
			}
			return list;
		}
		
		//GET by id
		@GetMapping("/crudEmp/{id}")
		public EmployeeEntity getById(@PathVariable("id") Integer id)
		{
			log.info("get all employees ->");
			EmployeeEntity entity = crudRepoSer.getById(id);
			System.out.println(entity);
			return entity;
		}
		
		//Update
		@PutMapping("/crudEmp/{id}")
		public EmployeeEntity updateEmp(@RequestBody EmployeeEntity emp)
		{
			EmployeeEntity updatedEntity= crudRepoSer.updateEmp(emp);
			System.out.println(updatedEntity);
			return updatedEntity;
		}
		
		
		//Delete
		@DeleteMapping("/crudEmp/{id}")
		public String delete(@PathVariable("id") Integer id)
		{
			String res = crudRepoSer.deleteById(id);
			System.out.println(res);
			return res;
		}
		
		

}