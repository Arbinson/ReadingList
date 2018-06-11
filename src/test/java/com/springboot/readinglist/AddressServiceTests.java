package com.springboot.readinglist;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.springboot.readinglist.entities.Address;
import com.springboot.readinglist.services.AddressService;

@RunWith(SpringJUnit4ClassRunner.class)
public class AddressServiceTests {

	@Autowired
	private AddressService addressService;

	@Test
	public void testService() {
		Address address = addressService.findByLastName("Sheman");
		assertEquals("P", address.getFirstName());
		assertEquals("Sherman", address.getLastName());
		assertEquals("42 Wallaby Way", address.getAddressLine());
		assertEquals("Sydney", address.getCity());
		assertEquals("New South Wales", address.getState());
		assertEquals("2000", address.getPostCode());
	}
}
