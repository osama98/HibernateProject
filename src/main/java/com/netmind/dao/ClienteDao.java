package com.netmind.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ClienteDao implements IDao<Cliente>{
	Session session = null;
	
	public Cliente add(Cliente cliente) throws HibernateException{
		Transaction trns = null;
		session = HibernateUtil.getSessionFactory().openSession();
		
		try {
			trns = session.beginTransaction();
			session.save(cliente);
			session.getTransaction().commit();
		} catch(HibernateException ex) {
			if(trns != null) {
				trns.rollback();
			}
			ex.printStackTrace();
			throw ex;
		} finally {
			session.flush();
			session.close();
		}
		return cliente;
	}

	public Cliente modify(Cliente model) throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Cliente> getAll() throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}

	public Cliente getById(int id) throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}

	public int remove(int id) throws HibernateException {
		// TODO Auto-generated method stub
		return 0;
	}

}
