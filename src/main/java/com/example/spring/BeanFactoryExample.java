package com.example.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.PathResource;

public class BeanFactoryExample 
{
    public static void main( String[] args )
    {
    	// Clase XmlBeanFactory obsoleta, pero con fines de aprendizaje se recrea cómo se usaba antes el IoC
        BeanFactory factory = new XmlBeanFactory(new PathResource("spring.xml"));
        
        // Solicitamos al framework el bean auto 
        Car carro = (Car) factory.getBean("auto");
        carro.drive();
    }
}
