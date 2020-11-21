package io.pragra.learning;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Person {
	private String name;
	private int age;
	private IAddress address;
	private List hobbies;
	
	
	public Person(String name, int age, IAddress address, List hobbies) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.hobbies = hobbies;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public IAddress getAddress() {
		return address;
	}
	public void setAddress(IAddress address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + ", hobbies=" + hobbies + "]";
	}
	
	
	

}
