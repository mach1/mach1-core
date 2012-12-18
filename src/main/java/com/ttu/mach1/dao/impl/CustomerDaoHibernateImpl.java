package com.ttu.mach1.dao.impl;

import org.springframework.stereotype.Component;

import com.ttu.mach1.dao.CustomerDao;
import com.ttu.mach1.model.Customer;

//@Component("customerDaoHibenateImpl")
public class CustomerDaoHibernateImpl extends
		GenericDaoHibernateImpl<Customer, Long> implements CustomerDao {

	public CustomerDaoHibernateImpl() {
		super(Customer.class);
	}
}
