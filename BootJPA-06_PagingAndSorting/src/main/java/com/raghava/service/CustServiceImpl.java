package com.raghava.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.raghava.entity.CustomerDetails;
import com.raghava.repository.CustRepository;
@Service("custservice")
public class CustServiceImpl implements CustService {
    
	@Autowired
	private CustRepository cr;
	@Override
	public Iterable<CustomerDetails> getallCustomersbysorting(boolean ascordr, String... properties) {
		// TODO Auto-generated method stub
		Sort sort=Sort.by(ascordr?Direction.ASC:Direction.DESC, properties);
	return	cr.findAll(sort);
		
		
	}
	@Override
	public Page<CustomerDetails> getallcustomersbypages(int size1, int size2) {
		Pageable page= PageRequest.of(size1, size2);
	Page<CustomerDetails> p=	cr.findAll(page);
	 p.forEach(System.out::println);
	 return p;
		
	}
	@Override
	public Page<CustomerDetails> getallcustomersbypagesbysorting(int size1, int size2, boolean asc,
			String... properties) {
		Sort sort =Sort.by(asc?Direction.ASC:Direction.DESC,properties);
		Pageable page =PageRequest.of(size1, size2, sort);
	Page<CustomerDetails> p1 =	cr.findAll(page);
	System.out.println(page.isPaged());
	System.out.println(page.getPageSize());
	p1.forEach(System.out::println);
		return p1;
	}

}
