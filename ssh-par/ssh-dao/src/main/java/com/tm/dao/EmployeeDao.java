package com.tm.dao;

import java.util.List;

import com.tm.model.Employee;

public interface EmployeeDao {
	
	List getemplist();
	
	void delemp(Integer id);
	
	void addemp(Employee emp);
	
	List getemp(Integer id);
	
	void updateempt(Employee emp);

}
