package com.bridgeit.SpringDemo.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.bridgeit.SpringDemo.Interface.Language;
import com.bridgeit.SpringDemo.InterfaceImplementation.Java;

@Configuration
@ComponentScan("com.bridgeit.SpringDemo.Bean")
public class AppConfig {
	
	@Bean(name="Language")
	public Language getLanguage(){
		return new Java();
	}

}
