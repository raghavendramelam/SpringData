package com.raghava.runners;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.raghava.entity.CustomerDetails;
import com.raghava.service.CustServiceImpl;
@Component
public class TestRunner implements CommandLineRunner {
@Autowired
private CustServiceImpl csi;
	@Override
	public void run(String... args) throws Exception {
	
System.out.println(		csi.deleteallcustomersbyId(Arrays.asList(1,null)));
	CustomerDetails cd = new CustomerDetails();
		cd.setCustloc("Hyderabad");
	
	List<CustomerDetails> list=	csi.searchcustdetailsbycust(cd, true, "custname");
		System.out.println(list.size());
		
	CustomerDetails cd1 =	csi.getcustomerreferenceById(5);
	System.out.println(cd1.getCustname());
	
	}

}
