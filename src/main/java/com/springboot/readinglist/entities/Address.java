package com.springboot.readinglist.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "address")
public class Address implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String firstName;
	private String lastName;
	private String addressLine;
	private String city;
	private String state;
	private Long postCode;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddressLine() {
		return this.addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Long getPostCode() {
		return this.postCode;
	}

	public void setPostCode(Long postCode) {
		this.postCode = postCode;
	}

	@Override
	public String toString() {
		return "Address [id=" + this.id + ", firstName=" + this.firstName + ", lastName=" + this.lastName
				+ ", addressLine=" + this.addressLine + ", city=" + this.city + ", state=" + this.state + ", postCode="
				+ this.postCode + "]";
	}
}
