package com.raghava.service;

import org.springframework.data.domain.Page;

import com.raghava.entity.CustomerDetails;

public interface CustService {
	
	public Iterable<CustomerDetails> getallCustomersbysorting(boolean ascordr,String...properties);
	public Page<CustomerDetails> getallcustomersbypages(int size1,int size2);
	public Page<CustomerDetails> getallcustomersbypagesbysorting(int size1,int size2,boolean asc,String...propertie);
}
