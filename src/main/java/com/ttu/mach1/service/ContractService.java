package com.ttu.mach1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ttu.mach1.dao.ContractDao;
import com.ttu.mach1.model.Contract;

@Service("contractService")
@Transactional
public class ContractService {
	@Autowired
	private ContractDao contractDao;

	public Contract createContract(Contract contract) {
		contractDao.create(contract);
		return contract;
	}

	public Contract updateContract(Contract contract) {
		contractDao.update(contract);
		return contract;
	}

	public Contract findCustomer(Long id) {
		return contractDao.find(id);
	}

	public List<Contract> findAll() {
		return contractDao.findAll();
	}

	public List<Contract> findCustomerContracts(Long customerId) {
		return contractDao.findContractsByCustomerId(customerId);
	}
}
