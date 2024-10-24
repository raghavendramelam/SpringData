package com.raghava.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.raghava.entity.CustomerDetails;
import com.raghava.service.CustServiceImpl;

@Component
public class TestRunner implements CommandLineRunner {

    @Autowired
    private CustServiceImpl cs;

    @Override
    public void run(String... args) throws Exception {
        try {
            // Registering a new customer
            String result = cs.RegisterCustomers(List.of(new CustomerDetails( "parmesh", "chennai", 45000.0F)));
            System.out.println(result);  // Log the result
        } catch (Exception e) {
            e.printStackTrace();  // Print stack trace for debugging
        }
    }

    // Constructor to log when the runner is instantiated
    public TestRunner() {
        System.out.println("Runner class constructor");
    }
}