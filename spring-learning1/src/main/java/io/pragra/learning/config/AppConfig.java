package io.pragra.learning.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.pragra.learning.HomeAddress;

@Configuration
public class AppConfig {
	
	@Bean
	public HomeAddress homeaddress(){
		return new HomeAddress("mathew",200,"waterloo","CA");
		
		
	}
	
	@Bean
	public HomeAddress homeaddress2(){
		return new HomeAddress("marshall",200,"waterloo","CA");
		
		
	}
	
	@Bean
	public HomeAddress homeaddress3(){
		return new HomeAddress("marshall",200,"waterloo","CA");
		
		
	}
	

}
