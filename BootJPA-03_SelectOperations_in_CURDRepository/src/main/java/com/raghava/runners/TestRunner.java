package com.raghava.runners;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.raghava.entity.CustomerDetails;
import com.raghava.service.CustServiceImpl;

@Component
public class TestRunner implements CommandLineRunner {
    
	@Autowired
	private CustServiceImpl  cs;
	
	
	private CustomerDetails cd;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		try {
	   	
	    	
	    String resultmsg=	cs.CheckCustomer(cd);
	    System.out.println(resultmsg);
	    
	    System.out.println("-------------");
	  Iterable<CustomerDetails> list=  cs.GetAllCustomerDetails(cd);
	  
	      System.out.println("------");
	      Arrays.asList(list).stream().forEach(System.out::println);
	      
	      System.out.println("---------");
	      
	Iterable<CustomerDetails>  list1  =  cs.GetAllCustomersById(cd);
	
	Arrays.asList(list1).stream().forEach(System.out::println);
	    }catch(Exception e) {
	    	e.printStackTrace();
	    }
	}

}
