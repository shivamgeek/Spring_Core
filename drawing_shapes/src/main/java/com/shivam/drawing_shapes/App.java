package com.shivam.drawing_shapes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring_data.xml");
        context.registerShutdownHook();
        Shape s = (Shape)context.getBean("circle_bean_id");
        s.draw();
    }
}
