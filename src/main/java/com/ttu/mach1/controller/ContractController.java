package com.ttu.mach1.controller;

import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ttu.mach1.model.Contract;
import com.ttu.mach1.service.ContractService;

@Controller
public class ContractController {
	private static final Logger logger = LoggerFactory
			.getLogger(ContractController.class);

	@Autowired
	private ContractService contractService;

	@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = "/contracts", method = RequestMethod.GET)
	public @ResponseBody
	List<Contract> getCustomercontracts(@RequestParam Long customerId,
			Locale locale, Model model) {
		List<Contract> contracts = contractService
				.findCustomerContracts(customerId);
		return contracts;
	}

	@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = "/contracts", method = RequestMethod.POST)
	public @ResponseBody
	Contract postContract(@RequestBody Contract contract, Locale locale,
			Model model) {
		return contractService.createContract(contract);
	}

	@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = "/contracts/{id}", method = RequestMethod.PUT)
	public @ResponseBody
	Contract updateContract(@RequestBody Contract contract,
			@PathVariable Long id, Locale locale, Model model) {
		return contractService.updateContract(contract);
	}

	@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = "/contracts/{id}", method = RequestMethod.GET)
	public @ResponseBody
	Contract getCustomer(@PathVariable Long id, Locale locale, Model model) {
		return contractService.find(id);
	}
}
