package com.raghava.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Component
@Entity
@Data
public class CustomerDetails {
    @Column
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer custid;
    
    @Column(name="CUSTNAME",length=20)
    private String custname;
    
    @Column(name="CUSTLOC",length=20)
    private String custloc;
    
    @Column(name="BILLAMT")
    private Float billamt;
}
