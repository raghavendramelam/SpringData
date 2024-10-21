package com.raghava.repository;

import org.springframework.data.repository.CrudRepository;
import com.raghava.entity.CustomerDetails;

public interface CustRepository extends CrudRepository<CustomerDetails, Integer> {

}
