package com.raghava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
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
	public String deleteallcustomersbyId(Iterable<Integer> list) {
		// TODO Auto-generated method stub
	List<CustomerDetails> ls =	cr.findAllById(list);
	long count =ls.size();
		cr.deleteAllByIdInBatch(list);
		
		return "Number of customers Deleted are"+count;
	}
	@Override
	public List<CustomerDetails> searchcustdetailsbycust(CustomerDetails cd, boolean asc, String... properties) {
		// TODO Auto-generated method stub
		Example<CustomerDetails> exm =Example.of(cd);
		Sort sort=Sort.by(asc?Direction.ASC:Direction.DESC,properties);
		List<CustomerDetails> ls = cr.findAll(exm, sort);
		return ls;
	}
	@Override
	public CustomerDetails getcustomerreferenceById(int id) {
		// TODO Auto-generated method stub
		
	CustomerDetails cd=	cr.getReferenceById(id);
	
		return cd;
	}

}
