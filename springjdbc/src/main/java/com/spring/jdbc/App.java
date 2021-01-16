package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
       
       /**
        * this is the general way but we will do it using dao below
        */
    /*   JdbcTemplate template=context.getBean("jdbcTemplate",JdbcTemplate.class);
       
       //insert query
       
       String query = "insert into student(id,name,city)values(?,?,?)";
       
       //fire query
       
       int result = template.update(query,123,"Sumit","Jind");
       System.out.println("number of records inserted.."+ result);*/
       
       /**
        * Using dao //this is the proper way to follow
        */
       /**
        * Inserting data
        */
       StudentDao studentDao = context.getBean("StudentDaoImpl",StudentDao.class);
       
      /* Student st = new Student();
       st.setId(666);
       st.setName("john");
       st.setCity("Lucknow");
       
       int result = studentDao.insert(st);
       System.out.println("number of records inserted..."+ result);*/
       
       /**
        * UPDATE Data
        */
      /* Student st = new Student();
       st.setId(666);
       st.setName("rajkumar");
       st.setCity("Lucknow");
       int result = studentDao.change(st);
       System.out.println("number of records updated..."+ result);*/
       
       /**
        * DELETE Data
        */
    /*   int result = studentDao.delete(666);
       System.out.println("Number of records deleted..."+result);*/
       
       /**
        * SELECT Single object
        */
   /*   Student st= studentDao.getStudent(123);
      System.out.println(st);*/
       
       /**
        * SELECT Multiple object
        */
       List<Student> students = studentDao.getAllStudents();
       
       for(Student st : students) {
    	   System.out.println(st);
       }
       
    }
}
