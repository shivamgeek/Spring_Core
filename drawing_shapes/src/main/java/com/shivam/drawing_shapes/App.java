package com.shivam.drawing_shapes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_data.xml");
        Shape s = (Shape)context.getBean("triangle_alias");
        Shape s1 = (Shape)context.getBean("triangle_alias");
        System.out.println(s+" \n"+s1);
        s.draw();
    }
}
