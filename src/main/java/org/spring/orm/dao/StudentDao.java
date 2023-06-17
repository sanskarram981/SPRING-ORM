package org.spring.orm.dao;

import org.spring.orm.entities.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;

import javax.persistence.Transient;
import javax.transaction.Transactional;
import java.util.List;

public class StudentDao
{
    private HibernateTemplate hibernateTemplate;

    public StudentDao()
    {
        super();
    }

    public StudentDao(HibernateTemplate hiker)
    {
        super();
        this.hibernateTemplate = hiker;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public HibernateTemplate getHibernateTemplate() {
        return this.hibernateTemplate;
    }

    @Transactional
    public int insert(Student student)
    {
        Integer result = (Integer) this.hibernateTemplate.save(student);
        return result;
    }
    @Transactional
    public void update(Student student)
    {
        this.hibernateTemplate.update(student);
    }

    @Transactional
    public void delete(int studentId)
    {
        Student student = this.hibernateTemplate.get(Student.class,studentId);
        this.hibernateTemplate.delete(student);
    }

    public Student select(int studentId)
    {
        Student student = this.hibernateTemplate.get(Student.class,studentId);
        return student;
    }

    public List<Student> selectAll()
    {
        List<Student> students = this.hibernateTemplate.loadAll(Student.class);
        return students;
    }
}
