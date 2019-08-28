package com.tw.apistackbase.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/companies")
public class  Company {
	List<CompanyAPI> companies = new ArrayList<CompanyAPI>();
    @GetMapping(path = "/")
    @ResponseStatus(HttpStatus.OK)
    public List<CompanyAPI> getCompanies() {

    return  companies ;
    }
    
    @PostMapping(path = "/insert")
    @ResponseStatus(HttpStatus.CREATED)
    public List<CompanyAPI> postEmployees(@RequestBody CompanyAPI employee) {
    	companies.add(employee);
    	return companies;
    }
    @RequestMapping(path = "/{id}")
//    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<CompanyAPI> getEmployee (@PathVariable String id){
    	for(CompanyAPI employee  : companies) {
    		if(companies.get(i).companyId == id)
    			return ResponseEntity.ok(employee);
    	}
		return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
    
    @PutMapping(path = "/{id}")
    public ResponseEntity<CompanyAPI> updateEmployee (@PathVariable String id,CompanyAPI employee){
    		for(int i=0;i<companies.size();i++) {
    			if(companies.get(i).companyId == id ) {
    				companies.set(i, employee);
    			}
        			return  ResponseEntity.ok(employee);
    		}
		return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
//    
    @DeleteMapping(path = "/{id}")
//  @ResponseStatus(HttpStatus.CREATED)
  public void deleteEmployee (@PathVariable String id){
    	for(int i=0;i<companies.size();i++) {
	  		if(companies.get(i).companyId == id)
	  			companies.remove(companies);
  	}
   }
}
