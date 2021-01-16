package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext contxt = new ClassPathXmlApplicationContext("com/springcore/config.xml");
        
        /**
         * two methods to get object of beans one need typecasting other dont
         */
       // Student student1=(Student)contxt.getBean("Student1");
        Student student1=contxt.getBean("Student1",Student.class);
        
        /**
         * if bean scope is prototype then only multiple objects can be formed
         */
        Student student2=contxt.getBean("Student1",Student.class);
        
      /**
       * we can also set values from here if we do not define calues in xml file
       */
          student1.setStudentId(23);
        student1.setStudentName("sumit");
        student1.setStudentAddress("delhi");
        student2.setStudentId(233);
        student2.setStudentName("sumitt");
        student2.setStudentAddress("delhit");
        System.out.println(student1);
        System.out.println(student2);
    }
}
