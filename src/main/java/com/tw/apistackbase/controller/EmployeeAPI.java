package com.tw.apistackbase.controller;
//GET /employees #获取员工名单
//GET / employees / 1＃获得某个特定员工
//GET / employees?page=1＆pageSize=5  #分页查询，page等于1，pageSize等于5
//GET /employees?gender=male #查询所有男性员工
//POST / employees＃添加一名员工
//PUT / employees / 1 #update一名员工
//DELETE / employees / 1 #delete一名员工

public class EmployeeAPI {
	private String id ;
	private String name ;
	private String gender ;
	private int age ;
	private double salary;
	public EmployeeAPI(String id,String name,int age,String gender,double salary) {
		this.id = id ;
		this.name = name;
		this.age = age ;
		this.gender = gender ;
		this.salary = salary ;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	
}
