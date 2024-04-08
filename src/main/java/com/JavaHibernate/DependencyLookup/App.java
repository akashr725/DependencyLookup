package com.JavaHibernate.DependencyLookup;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import com.JavaHibernate.beans.Vehicle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		
		reader.loadBeanDefinitions("applicationContext.xml");
		
		Vehicle vehicle	=factory.getBean("beanVehicle", Vehicle.class);
		
		vehicle.Horn();
		vehicle.Entertainment();
		vehicle.Travel("Kolkata", "Delhi");
    }
}
