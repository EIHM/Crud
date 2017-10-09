package com.tm.daoimpl;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tm.dao.DepDao;

@Transactional(isolation=Isolation.REPEATABLE_READ,propagation=Propagation.REQUIRED)
public class DepDaoimpl implements DepDao {
	
	private SessionFactory sf;
	

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	public DepDaoimpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List getdeplist() {
		
		Session session = sf.getCurrentSession();
		
		String hql="from Department";
		List list = session.createQuery(hql).list();
		System.out.println(list.toString());
		
		return list;
	}

}
