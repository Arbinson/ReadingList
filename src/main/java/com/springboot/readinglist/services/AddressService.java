package com.springboot.readinglist.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.readinglist.dao.AddressRespository;
import com.springboot.readinglist.entities.Address;

@Service
public class AddressService {

	@Autowired
	private AddressRespository addressRespository; 
	
	public Address findByLastName(String lastName) {

		return addressRespository.findByLastName(lastName);
	}

}
