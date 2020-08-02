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
        Shape s = (Shape)context.getBean("triangle");
        s.draw();
        System.out.println("message from properties is -> "+context.getMessage("abc_msg", null,"\"MESSAGE NOT FOUND\"",null));
    }
}
