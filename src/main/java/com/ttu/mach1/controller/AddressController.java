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

import com.ttu.mach1.model.CustomerAddress;
import com.ttu.mach1.service.CustomerAddressService;

@Controller
public class AddressController {

	private static final Logger logger = LoggerFactory
			.getLogger(AddressController.class);

	@Autowired
	private CustomerAddressService customerAddressService;

	@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = "/addresses", method = RequestMethod.GET)
	public @ResponseBody
	List<CustomerAddress> getCustomerAddresses(@RequestParam Long customerId,
			Locale locale, Model model) {
		List<CustomerAddress> addresses = customerAddressService
				.findCustomerAddresses(customerId);
		System.out.println(addresses);
		return addresses;
	}
}