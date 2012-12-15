package br.com.qualifiers.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SpringConfig {
	
	private static AnnotationConfigApplicationContext applicationContext;
	
	static {
		applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.scan("br.com.qualifiers");
	}
	
	public static ApplicationContext getSpringContext(){
		return applicationContext;
	}

}
