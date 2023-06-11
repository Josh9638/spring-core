package com.example.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextExample {

	public static void main(String[] args) {
		// Usar esta forma para obtener beans, en vez de BeanFactory
		// El archivo spring.xml debe ser colocado en el classpath del proyecto (/src/main/java)
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
		
		// Solicitamos al framework el bean auto 
		Car carro = (Car)factory.getBean("auto");
		carro.drive();
	}

}
