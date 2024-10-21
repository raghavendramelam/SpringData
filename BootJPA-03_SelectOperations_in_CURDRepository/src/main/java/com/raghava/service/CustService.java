package com.raghava.service;

import org.springframework.stereotype.Component;

import com.raghava.entity.CustomerDetails;

@Component
public interface CustService {
 
	public String CheckCustomer(CustomerDetails cd);
	
	public Iterable<CustomerDetails> GetAllCustomerDetails(CustomerDetails cd);
	
	public Iterable<CustomerDetails> GetAllCustomersById(CustomerDetails cd);
}
