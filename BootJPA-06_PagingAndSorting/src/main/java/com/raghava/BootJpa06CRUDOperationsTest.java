package com.raghava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootJpa06CRUDOperationsTest {
	@Autowired
//	private CustServiceImpl  cs;

	public static void main(String[] args) {
		
		SpringApplication.run(BootJpa06CRUDOperationsTest.class, args);
	}
	    
	/*	@Bean
		CommandLineRunner runner(CustRepository repository) {
		    return args -> {
 System.out.println(  cs.GetCustomerBYId(1));
		   
		    };
		  } 

    */
    
	}


