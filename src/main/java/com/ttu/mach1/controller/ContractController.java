package com.ttu.mach1.controller;

import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ttu.mach1.model.Contract;
import com.ttu.mach1.model.CustomerAddress;
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
}
