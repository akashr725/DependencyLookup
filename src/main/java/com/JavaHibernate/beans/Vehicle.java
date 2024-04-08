package com.JavaHibernate.beans;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class Vehicle {
	
	public Vehicle() {

		System.out.println("Vehicle Constractor..................");
		
	}
	
	public void Entertainment() {
		
		System.out.println("Music on...............");
	}
	
	public void Horn() {
		
		System.out.println("Blow Horn...............");
		
	}
	
	public void Travel(String src, String dest) {
		
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		
		reader.loadBeanDefinitions("applicationContext.xml");
		
	    Engine engine	=factory.getBean("beanEngine", Engine.class);
	    
	    engine.Start();
	    
	    System.out.println("Your journey Start from "+ src);
	    
	    System.out.println("Happy Journey To Everyone!.................");
	    
	    System.out.println("You have reached your destination "+ dest);
	    
	    engine.Stop();
	    
	    
	}

}
