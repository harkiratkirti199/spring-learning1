package io.pragra.learning.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.pragra.learning.OfficeAddress;

@Configuration
public class OfficeConfig {
	private OfficeAddress add;
	private String address="Pragra";
	
	@Bean
	public OfficeAddress officeaddress() {
		add=new OfficeAddress();
		add.setOfficeName(address);
		
		return add;
	}

}
