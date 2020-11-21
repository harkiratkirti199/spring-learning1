package io.pragra.learning;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class HomeAddress implements IAddress {

	private String streetName;
	private int streetAddress;
	private String city;
	private String country;

	public HomeAddress(String streetName, int streetAddress, String city, String country) {

		this.streetName = streetName;
		this.streetAddress = streetAddress;
		this.city = city;
		this.country = country;
	}

	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return toString();
	}

	@Override
	public String toString() {
		return "HomeAddress [streetName=" + streetName + ", streetAddress=" + streetAddress + ", city=" + city
				+ ", country=" + country + "]";
	}

	@PostConstruct
	public void init() {
		System.out.println("*************INIT METHOD CALLED************");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("*************DESTROY METHOD CALLED************");
	}

}
