package com.raghava.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.raghava.entity.CustomerDetails;

public interface CustRepository extends PagingAndSortingRepository<CustomerDetails,Integer> {

}
