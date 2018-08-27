package com.netmind.dao;

import java.util.List;

import org.hibernate.HibernateException;

public interface IDao<T> {
	
	public T add(T model) throws HibernateException;
	
	public T modify(T model) throws HibernateException;
	
	public List<T> getAll() throws HibernateException;
	
	public T getById(int id) throws HibernateException;
	
	public int remove(int id) throws HibernateException;

}
