package com.raghava.entity;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Component
@Entity
@Data
@AllArgsConstructor
//@NoArgsConstructor
@RequiredArgsConstructor
@Lazy
public class CustomerDetails {
    @Column
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer custid;
    
    @Column(name="CUSTNAME",length=20)
    @NonNull
    private String custname;
    
    @Column(name="CUSTLOC",length=20)
    @NonNull
    private String custloc;
    
    @Column(name="BILLAMT")
    @NonNull
    private Float billamt;
    
    public CustomerDetails() {
    	System.out.println("------------------");
    	System.out.println(" Constructor from entity class"+this.getClass());
    }
}
