package com.tw.apistackbase.controller;

 
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

 
@RestController
@RequestMapping("/")

public class Employeee {

//	String id,String name,int age,String gender,int salary
	 List<EmployeeAPI> employees = new ArrayList<EmployeeAPI>(); 
	{
		  employees.add(new EmployeeAPI("01", "alibaba1",20, "male", 2000));
		  employees.add(new EmployeeAPI("02", "alibaba2",22, "female", 1000));
	}
	
	//获取雇员列表
    @GetMapping(path = "/employees")
    @ResponseStatus(HttpStatus.OK)
    public List<EmployeeAPI> getAll() {
        return employees;
    }
    
    
    //获取某个雇员
    @GetMapping(path = "/employees/{id}")
    public ResponseEntity<EmployeeAPI> getOneEmployee (@PathVariable String id) {
       for(EmployeeAPI e : employees) {
    	   if(e.getId()==id) {
    		   return ResponseEntity.ok(e);
    	   }
       }
       return ResponseEntity.notFound().build();
    }
    
    //添加一个雇员
  	@PostMapping(path ="/employees")
  	@ResponseStatus(HttpStatus.CREATED)
  	public EmployeeAPI creatEmployee(@RequestBody EmployeeAPI employee) {
  		employees.add(employee);
  			return employee;
  	}
  	
 
}
