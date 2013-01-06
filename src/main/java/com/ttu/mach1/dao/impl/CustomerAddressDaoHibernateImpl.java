package com.ttu.mach1.dao.impl;

import java.util.List;

import org.hibernate.criterion.Restrictions;

import com.ttu.mach1.dao.CustomerAddressDao;
import com.ttu.mach1.model.CustomerAddress;

public class CustomerAddressDaoHibernateImpl extends
		GenericDaoHibernateImpl<CustomerAddress, Long> implements
		CustomerAddressDao {

	public CustomerAddressDaoHibernateImpl() {
		super(CustomerAddress.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CustomerAddress> findAddressesByCustomerId(Long customerId) {
		return (List<CustomerAddress>) currentSession()
				.createCriteria(CustomerAddress.class)
				.add(Restrictions.eq("customer", customerId)).list();
	}
}