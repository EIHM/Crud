package com.tm.action;

import java.util.Iterator;
import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.tm.model.Department;
import com.tm.model.Employee;
import com.tm.service.Depservice;
import com.tm.service.Empservice;

public class EmpAction extends ActionSupport implements ModelDriven<Employee>{
	
	private Employee employee=new Employee();
	
	private Empservice empservice;
	private Depservice depservice;
	
	

	public void setDepservice(Depservice depservice) {
		this.depservice = depservice;
	}


	public void setEmpservice(Empservice empservice) {
		this.empservice = empservice;
	}


	public EmpAction() {
		// TODO Auto-generated constructor stub
	}
	
	public String getlist(){
			List lists = empservice.getemplists();
			
			
			ActionContext.getContext().put("lists",lists);
		
		
		return "list";
	}
	
	public String getdept(){
		List<Department> listd=depservice.getdeplists();
		
		ActionContext.getContext().put("listd",listd);
		
		return "add";
	}
	
	public void delemp(){
		
		
		empservice.delemps(employee.getId());
    }
	
	public String addemp(){
		
		employee.setCreatetime("2017-10-5");
		empservice.addemps(employee);
		
		return "tolist";
		
	}
	
	public String updateemp(){
        List<Department> listd=depservice.getdeplists();
		
		ActionContext.getContext().put("listd",listd);
		
		
		
		List list=empservice.getemp(employee.getId());
		Iterator<Object[]> it=list.iterator();
		while(it.hasNext()){
			Object[] ob = it.next();
			
			Department dep=(Department)ob[0];
			Employee emp=(Employee)ob[1];

			ActionContext.getContext().getValueStack().push(dep);
			ActionContext.getContext().getValueStack().push(emp);
		}
		
		return "update";
	}
	
   public String updateempt(){
		
		employee.setCreatetime("2017-10-5");
		System.out.println(employee);
		empservice.updateempt(employee);
		
		return "tolist";
		
	}


	@Override
	public Employee getModel() {
		// TODO Auto-generated method stub
		return employee;
	}
	

}
