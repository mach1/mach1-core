package com.ttu.mach1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ttu.mach1.dao.CustomerAddressDao;
import com.ttu.mach1.model.CustomerAddress;

@Service("addressService")
@Transactional
public class CustomerAddressService {

	@Autowired
	private CustomerAddressDao customerAddressDao;

	public List<CustomerAddress> findCustomerAddresses(Long customerId) {
		return customerAddressDao.findAddressesByCustomerId(customerId);
	}
}
