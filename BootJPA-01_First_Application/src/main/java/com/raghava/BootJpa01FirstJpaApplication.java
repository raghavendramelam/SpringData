package com.raghava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.raghava.entity.CustomerDetails;
import com.raghava.service.CustServiceImpl;

@SpringBootApplication
public class BootJpa01FirstJpaApplication {

	public static void main(String[] args) {
		
	ApplicationContext ctx=	SpringApplication.run(BootJpa01FirstJpaApplication.class, args);
	
CustServiceImpl csl=	ctx.getBean(CustServiceImpl.class);

    try {
    	CustomerDetails cd= new CustomerDetails();
    	cd.setBillamt(20000.00F);
    	cd.setCustloc("Hyderabad");
    	cd.setCustname("Raghava");
    String resultmsg=	csl.registercustomer(cd);
    System.out.println(resultmsg);
    }catch(Exception e) {
    	e.printStackTrace();
    }
    
	}

}
