package com.tw.apistackbase.controller;

//GET       /companies    #获取公司列表
//GET       /companies/1  #获取某个特定的公司
//GET       /companies/1/employees  # 获取某个公司下的所有员工
//GET       /companies?page=1&pageSize=5  #分页查询 ，如果page等于1，
//			pageSize等于5，它将公司列表中的数据从索引0返回到索引4。
//POST      /companies    #添加一个公司
//PUT       /companies/1  #更新一个公司的基本信息
//DELETE    /companies/1  # 删除某个特定的公司

public class CompanyAPI {
	private String companyName ;
	private int employeesNumber ;
	public CompanyAPI(String companyName,int employeesNumber) {
		this.companyName = companyName ;
		this.employeesNumber = employeesNumber ;
	}
}
