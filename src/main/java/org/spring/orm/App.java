package org.spring.orm;

import org.spring.orm.dao.StudentDao;
import org.spring.orm.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Student st1 = new Student(1,"Shivam Sahu","Gurgaon");
        Student st2 = new Student(2,"Shivam Sunderam","Ranchi");
        Student st3 = new Student(3,"Shashi Kumar","Bengaluru");
        Student st4 = new Student(4,"Sagen Baskey","Bokaro");

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao = (StudentDao) context.getBean("studentdao",StudentDao.class);
        System.out.println(studentDao);

        int result = studentDao.insert(st4);
        System.out.println("Insertion done "+result);
        System.out.println(studentDao.select(3));
        System.out.println(studentDao.selectAll());
        studentDao.update(new Student(3,"Shashi Kumar","Barhi"));
        System.out.println(studentDao.selectAll());
        studentDao.delete(1);
        System.out.println(studentDao.selectAll());

    }
}
