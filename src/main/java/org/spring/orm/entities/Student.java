package org.spring.orm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name="student_details")
public class Student
{
    @Id
    @Column(name="student_id")
    private int StudentId;
    @Column(name="student_name")
    private String StudentName;
    @Column(name="student_city")
    private String StudentCity;

    public Student()
    {
        super();
    }

    public Student(int studentId, String studentName, String studentCity) {
        super();
        this.StudentId = studentId;
        this.StudentName = studentName;
        this.StudentCity = studentCity;
    }

    public int getStudentId() {
        return this.StudentId;
    }

    public void setStudentId(int studentId) {
        this.StudentId = studentId;
    }

    public String getStudentName() {
        return this.StudentName;
    }

    public void setStudentName(String studentName) {
        this.StudentName = studentName;
    }

    public String getStudentCity() {
        return this.StudentCity;
    }

    public void setStudentCity(String studentCity) {
        this.StudentCity = studentCity;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentId=" + this.StudentId +
                ", StudentName='" + this.StudentName + '\'' +
                ", StudentCity='" + this.StudentCity + '\'' +
                '}';
    }
}
