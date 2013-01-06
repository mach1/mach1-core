package com.ttu.mach1.dao;

import java.util.List;

import com.ttu.mach1.model.CustomerAddress;

public interface CustomerAddressDao extends GenericDao<CustomerAddress, Long> {

	List<CustomerAddress> findAddressesByCustomerId(Long customerId);
}
