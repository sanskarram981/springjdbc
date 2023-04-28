package com.springjdbc;

import com.springjdbc.dao.StudentDao;
import com.springjdbc.dao.StudentDaoImpl;
import com.springjdbc.entities.student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDao dao = (StudentDao)context.getBean("studentdao",StudentDao.class);
        student st = new student(6,"bhavani bs","bengaluru,karnataka");
        int records = dao.delete(6);
        System.out.println("number of records deleted : "+records);
    }
}
