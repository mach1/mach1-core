package com.ttu.mach1.controller;

import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
import org.springframework.web.bind.annotation.ResponseBody;
import com.ttu.mach1.model.Customer;
import com.ttu.mach1.model.CustomerAddress;
import com.ttu.mach1.service.CustomerService;

@Controller
public class CustomerController {

	private static final Logger logger = LoggerFactory
			.getLogger(CustomerController.class);

	@Autowired
	private CustomerService customerService;

	@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = "/customers/customer", method = RequestMethod.POST)
	public @ResponseBody
	Customer postCustomer(@RequestBody Customer customer, Locale locale,
			Model model) {
		logger.info("/customers POST request");
		logger.info(customer.toString());
		return customerService.createCustomer(customer);
	}

	@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = "/customers/customer/{id}", method = RequestMethod.GET)
	public @ResponseBody
	Customer getCustomer(@PathVariable Long id, Locale locale, Model model) {
		logger.info("/customers/" + id + " GET request");
		return customerService.findCustomer(id);
	}

	@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = "/customers/customer/{id}", method = RequestMethod.PUT)
	public @ResponseBody
	Customer updateCustomer(@RequestBody Customer customer,
			@PathVariable Long id, Locale locale, Model model) {
		logger.info("/customers PUT request");
		logger.info(customer.toString());
		return customerService.updateCustomer(customer);
	}

	@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = "/customers", method = RequestMethod.GET)
	public @ResponseBody
	List<Customer> getCustomer(HttpServletRequest request,
			HttpServletResponse response, Locale locale, Model model) {
		logger.info("/customers GET request");
		return customerService.findAll();
	}
}
