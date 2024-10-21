package com.raghava.service;

import org.springframework.stereotype.Component;

import com.raghava.entity.CustomerDetails;

@Component
public interface CustService {
 
	public String registercustomer(CustomerDetails cd);
}
