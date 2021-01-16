package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext contxt =new ClassPathXmlApplicationContext("config.xml");
        
        StudentDao studentDao=contxt.getBean("StudentDao",StudentDao.class);
        
        Student student = new Student(123,"Sumitt here","Jind");
        
        int r =studentDao.insert(student);
        
        System.out.println("done "+ r);
        
    }
}
