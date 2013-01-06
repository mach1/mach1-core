package com.ttu.mach1.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.ttu.mach1.dao.GenericDao;

@Transactional
public class GenericDaoHibernateImpl<T, PK extends Serializable> implements
		GenericDao<T, PK> {

	@Autowired
	private SessionFactory sessionFactory;
	private Class<T> type;

	public GenericDaoHibernateImpl(Class<T> type) {
		this.type = type;
	}

	public Session currentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	@SuppressWarnings("unchecked")
	public PK create(T t) {
		return (PK) currentSession().save(t);
	}

	@Override
	@SuppressWarnings("unchecked")
	public T find(PK id) {
		return (T) currentSession().get(type, id);
	}

	@Override
	public void update(T t) {
		currentSession().update(t);
	}

	@Override
	public void delete(T t) {
		currentSession().delete(t);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		return (List<T>) currentSession().createCriteria(type).list();
	}

}
