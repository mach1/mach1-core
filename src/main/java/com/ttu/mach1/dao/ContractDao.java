package com.ttu.mach1.dao;

import java.util.List;

import com.ttu.mach1.model.Contract;

public interface ContractDao extends GenericDao<Contract, Long> {
	List<Contract> findContractsByCustomerId(Long customerId);
}
