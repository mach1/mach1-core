package com.ttu.mach1.dao.impl;

import java.util.List;

import org.hibernate.criterion.Restrictions;

import com.ttu.mach1.dao.ContractDao;
import com.ttu.mach1.model.Contract;

public class ContractDaoHibernateImpl extends
		GenericDaoHibernateImpl<Contract, Long> implements ContractDao {

	public ContractDaoHibernateImpl() {
		super(Contract.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Contract> findContractsByCustomerId(Long customerId) {
		return (List<Contract>) currentSession().createCriteria(Contract.class)
				.add(Restrictions.eq("customer", customerId)).list();
	}
}
