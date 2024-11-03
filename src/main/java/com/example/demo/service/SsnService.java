package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.SSN;
import com.example.demo.repo.SsnRepository;
@Service
public class SsnService {
	 @Autowired
	    private SsnRepository ssnRepository;

	    public String getCityBySsn(String ssn) {
	    SSN city =ssnRepository.findBySsn(ssn).
	    		 orElseThrow(()->new RuntimeException("city not found for SSN:" +ssn));
	    return city.getCity();
	}
}