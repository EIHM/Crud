package com.tm.model;

public class Department {
	
	private Integer deptid;
	private String deptname;
	

	public Department() {
		// TODO Auto-generated constructor stub
	}


	public Integer getDeptid() {
		return deptid;
	}


	public void setDeptid(Integer deptid) {
		this.deptid = deptid;
	}


	public String getDeptname() {
		return deptname;
	}


	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}


	@Override
	public String toString() {
		return "Department [dept_id=" + deptid + ", dept_name=" + deptname
				+ "]";
	}
	
	

}
