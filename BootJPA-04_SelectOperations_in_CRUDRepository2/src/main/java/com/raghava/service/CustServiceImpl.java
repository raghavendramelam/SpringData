package com.raghava.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raghava.entity.CustomerDetails;
import com.raghava.repository.CustRepository;

@Service
public class CustServiceImpl implements CustService {
    
	@Autowired
	public CustRepository cr;

	@Override
	public CustomerDetails GetCustomerBYId(Integer id) {
/*	Optional<CustomerDetails> op =	cr.findById(id);
	if(op.isPresent()) {
		return op.get();
	}
	else {
		throw new IllegalArgumentException(" Record not found");
	}
	*/
		
		
		return cr.findById(id).orElseThrow(()-> new IllegalArgumentException(" Record not found"));
	}

	
	@Override
	public String RegisterCustomers(Iterable<CustomerDetails> cd) {
	    // Save all the customer details
	    Iterable<CustomerDetails> savedCustomers = cr.saveAll(cd);

	    // Collect the customer IDs into a list
	    List<Integer> customerIds = new ArrayList<>();
	    savedCustomers.forEach(customer -> customerIds.add(customer.getCustid()));

	    return "The records inserted have the ID values: " + customerIds.toString();
	}
	
	
	
	
	}


