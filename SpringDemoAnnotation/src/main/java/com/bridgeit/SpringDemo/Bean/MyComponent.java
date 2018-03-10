package com.bridgeit.SpringDemo.Bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {
	
	@Autowired
	private MyRepository myRepository;
	
	public void showAppInfo(){
		System.out.println("App NAme:"+myRepository.getAppName());
		System.out.println("DAte an time:"+myRepository.getSystemDateTime());
	}
}
