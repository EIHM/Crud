package com.tm.serviceimpl;

import java.util.List;

import com.tm.dao.EmployeeDao;
import com.tm.model.Employee;
import com.tm.service.Empservice;

public class Empserviceimpl implements Empservice {

	private EmployeeDao employeedao;
	
	public void setEmployeedao(EmployeeDao employeedao) {
		this.employeedao = employeedao;   
	}

	public Empserviceimpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List getemplists() {
		
		return employeedao.getemplist();
	}

	@Override
	public void delemps(Integer id) {
		
		employeedao.delemp(id);
	}

	@Override
	public void addemps(Employee emp) {
		
		employeedao.addemp(emp);
		
	}

	@Override
	public List getemp(Integer id) {
		// TODO Auto-generated method stub
		return employeedao.getemp(id);
	}

	@Override
	public void updateempt(Employee emp) {
		
		employeedao.updateempt(emp);
		
	}

}
