package com.shivam.drawing_shapes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_data.xml");
        Shape s = (Shape)context.getBean("triangle_bean_id");
        s.draw();
    }
}