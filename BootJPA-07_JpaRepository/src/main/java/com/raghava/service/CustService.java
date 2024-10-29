package com.raghava.service;

import java.util.List;

import com.raghava.entity.CustomerDetails;

public interface CustService {

	
	public String deleteallcustomersbyId(Iterable<Integer> list);
	
	public List<CustomerDetails> searchcustdetailsbycust(CustomerDetails cd,boolean asc,String...properties);
	
	public CustomerDetails getcustomerreferenceById(int id);
}
