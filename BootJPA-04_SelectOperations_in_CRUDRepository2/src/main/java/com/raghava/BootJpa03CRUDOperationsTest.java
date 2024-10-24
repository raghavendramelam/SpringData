package com.raghava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.raghava.repository.CustRepository;
import com.raghava.service.CustServiceImpl;

@SpringBootApplication
public class BootJpa03CRUDOperationsTest {
	@Autowired
	private CustServiceImpl  cs;

	public static void main(String[] args) {
		
		SpringApplication.run(BootJpa03CRUDOperationsTest.class, args);
	}
	    
		@Bean
		CommandLineRunner runner(CustRepository repository) {
		    return args -> {
 System.out.println(  cs.GetCustomerBYId(1));
		   
		    };
		  } 

    
    
	}


