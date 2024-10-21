package com.raghava.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.raghava.entity.CustomerDetails;
import com.raghava.service.CustServiceImpl;

@Component
public class TestRunner implements CommandLineRunner {
    
	@Autowired
	private CustServiceImpl  cs;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		try {
	    	CustomerDetails cd= new CustomerDetails();
	    	cd.setBillamt(20000.00F);
	    	cd.setCustloc("Hyderabad");
	    	cd.setCustname("Raghava");
	    String resultmsg=	cs.registercustomer(cd);
	    System.out.println(resultmsg);
	    }catch(Exception e) {
	    	e.printStackTrace();
	    }
	}

}
