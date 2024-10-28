package com.raghava.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.raghava.service.CustServiceImpl;
@Component
public class TestRunner implements CommandLineRunner {
@Autowired
private CustServiceImpl csi;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	//	csi.getallCustomersbysorting(true, "custloc","custname","custid").forEach(System.out::println);;
	//	csi.getallcustomersbypages(1, 3);
		
//	csi.getallcustomersbypages(2, 3).forEach(System.out::println);
		
		csi.getallcustomersbypagesbysorting(1, 3, true, "custname","custloc");

	}

}
