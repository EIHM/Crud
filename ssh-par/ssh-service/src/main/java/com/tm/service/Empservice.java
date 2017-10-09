package com.tm.service;

import java.util.List;

import com.tm.model.Employee;

public interface Empservice {

	List getemplists();
	
	void delemps(Integer id);
	
	void addemps(Employee emp);
	
	List getemp(Integer id);
	
	void updateempt(Employee emp);
}
