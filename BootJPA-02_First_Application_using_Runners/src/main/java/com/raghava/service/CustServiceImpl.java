package com.raghava.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raghava.entity.CustomerDetails;
import com.raghava.repository.CustRepository;

@Service
public class CustServiceImpl implements CustService {
    
	@Autowired
	public CustRepository cr;
	@Override
	public String registercustomer(CustomerDetails cd) {
		// TODO Auto-generated method stub
CustomerDetails	cd1=cr.save(cd);
		System.out.println("CustomerDetails "+cd1);
		return "Record Inserted having ID Value"+cd1.getCustid();
	}

}
