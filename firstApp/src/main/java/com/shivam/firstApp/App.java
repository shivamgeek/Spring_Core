package com.shivam.firstApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//ApplicationContext ac = new ClassPathXmlApplicationContext("spring_data.xml");
    	ApplicationContext ac = new AnnotationConfigApplicationContext(AnnotationConfigFile.class);
        Car c = (Car) ac.getBean(Lamborghini.class);
        c.driveCar();
   
    }
}
