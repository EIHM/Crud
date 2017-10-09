package com.tm.daoimpl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tm.dao.EmployeeDao;
import com.tm.model.Employee;

@Transactional(isolation=Isolation.REPEATABLE_READ,propagation=Propagation.REQUIRED)
public class EmployeeDaoimpl implements EmployeeDao {

	private SessionFactory sf;
	
	

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	public EmployeeDaoimpl() {
		
	}

	@Override
	public List getemplist() {
		Session session = sf.getCurrentSession();
		String sql="SELECT department.*,employee.* FROM department inner JOIN employee ON department.dept_id=employee.dept_id";
		List list = session.createSQLQuery(sql)
				   .addEntity("department","com.tm.model.Department")
		           .addEntity("employee","com.tm.model.Employee").list();
		
		 
		return list;
	}
	
	public List getemp(Integer id){
		
		Session session = sf.getCurrentSession();
		String sql="SELECT department.*,employee.* FROM department inner JOIN employee ON department.dept_id=employee.dept_id where id=?";
		            List list=session.createSQLQuery(sql)
				   .addEntity("department","com.tm.model.Department")
		           .addEntity("employee","com.tm.model.Employee").setInteger(0,id).list();
		
		            
		            return list;
		
		
	}

	@Override
	public void delemp(Integer id) {
		System.out.println(id+"---");
		Session session=sf.getCurrentSession();
		String hql="Delete FROM Employee Where id=?";
		Query query = session.createQuery(hql);
		query.setInteger(0,id);
		query.executeUpdate();
		
		
	}

	@Override
	public void addemp(Employee emp) {

		Session session=sf.getCurrentSession();
		
		session.save(emp);
		 
		
	}

	
	public void updateempt(Employee emp) {
		
		Session session=sf.getCurrentSession();
		
		
		
		Employee employee = session.get(Employee.class,emp.getId());
		employee.setDeptid(emp.getDeptid());
		employee.setEmail(emp.getEmail());
		
		employee.setBirth(emp.getBirth());
		System.out.println("====="+employee);
		
		
		
	}

	

}
