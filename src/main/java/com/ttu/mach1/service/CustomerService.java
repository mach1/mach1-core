package com.ttu.mach1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ttu.mach1.dao.CustomerDao;
import com.ttu.mach1.model.Customer;

@Service("customerService")
@Transactional
public class CustomerService {

	@Autowired
	private CustomerDao customerDao;

	public Customer createCustomer(Customer customer) {
		customerDao.create(customer);
		return customer;
	}

	public Customer findCustomer(Long id) {
		return customerDao.find(id);
	}
}