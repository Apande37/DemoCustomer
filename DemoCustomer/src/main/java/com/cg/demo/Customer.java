package com.cg.demo;
public class Customer {
	
	private String firstName;
	private String lastName;
	private Address adress;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Address getAdress() {
		return adress;
	}
	public void setAdress(Address adress) {
		this.adress = adress;
	}
	public Customer(String firstName, String lastName, Address adress) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", adress=" + adress + "]";
	}
	
	

}
