package com.tm.serviceimpl;

import java.util.List;

import com.tm.dao.DepDao;
import com.tm.service.Depservice;

public class Depserviceimpl implements Depservice {
	
	private DepDao depdao;
	
	public void setDepdao(DepDao depdao) {
		this.depdao = depdao;
	}

	public Depserviceimpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List getdeplists() {
		// TODO Auto-generated method stub
		return depdao.getdeplist();
	}

}
