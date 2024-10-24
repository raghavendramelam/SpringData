package com.raghava.service;

import org.springframework.stereotype.Component;

import com.raghava.entity.CustomerDetails;

@Component
public interface CustService {
 
	public CustomerDetails GetCustomerBYId(Integer id);
	
	public String RegisterCustomers(Iterable<CustomerDetails> cd);
}
