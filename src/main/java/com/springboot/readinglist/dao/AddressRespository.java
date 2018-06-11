package com.springboot.readinglist.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.readinglist.entities.Address;

@Repository
public interface AddressRespository extends JpaRepository<Address, Integer>{

   Address findByLastName(String lastName);
}
