package com.tm.model;

import java.util.Date;

public class Employee {
	
	private Integer id;
	private String lastname;
	private String email;
	private Date birth;
	private String createtime;
	private Integer deptid;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

	public Integer getDeptid() {
		return deptid;
	}

	public void setDeptid(Integer deptid) {
		this.deptid = deptid;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", lastname=" + lastname + ", email="
				+ email + ", birth=" + birth + ", createtime=" + createtime
				+ ", deptid=" + deptid + "]";
	}
	
	

}
