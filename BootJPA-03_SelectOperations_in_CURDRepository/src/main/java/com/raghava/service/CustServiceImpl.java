package com.raghava.service;

import java.util.ArrayList;
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
	public String CheckCustomer(CustomerDetails cd) {
		// TODO Auto-generated method stub
  Boolean b =      cr.existsById(39);
		
		return (b?"Yes The customer with the given ID exists":"No the Customer with given ID does not exists");
	}
	@Override
	public Iterable<CustomerDetails> GetAllCustomerDetails(CustomerDetails cd) {
		// TODO Auto-generated method stub
		
	
		return cr.findAll();
	}
	@Override
	public Iterable<CustomerDetails> GetAllCustomersById(CustomerDetails cd) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(5);
		return cr.findAllById(list);
	}

}
