package br.com.qualifiers.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SpringConfig {
	
	private static ClassPathXmlApplicationContext applicationContext;
	
	static {
		applicationContext = new ClassPathXmlApplicationContext();
	}
	
	public static ApplicationContext getSpringContext(){
		return applicationContext;
	}

}
