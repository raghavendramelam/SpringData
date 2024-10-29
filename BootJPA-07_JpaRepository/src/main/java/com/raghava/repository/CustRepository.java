package com.raghava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raghava.entity.CustomerDetails;

public interface CustRepository extends JpaRepository<CustomerDetails,Integer> {

}
