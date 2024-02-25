package main;

import java.util.ArrayList;

public class Gifu
{
    public ArrayList<Course> courses = new ArrayList<Course>();
    public ArrayList<Student> students = new ArrayList<Student>();

    public void addCourse(String name, String id, int maxnumberOfStunedts)
    {
        Course course = new Course(name, id, maxnumberOfStunedts);
        courses.add(course);
    }
    public void addStudent(String name, String id)
    {
        Student student = new Student(name, id);
        students.add(student);
    }
 
    public void listCourses()
    {
        int n = 0;
        for (Course course : courses)
        {   
            course.printInfo(n);
            n++;
        }
    }
    public void listStudents()
    {
        int n = 0;
        for (Student student : students)
        {
            student.printInfo(n);
            n++;
        }
    }
    public void listEnrolled()
    {
        for (Course course : courses)
        {
            course.listEnrolled();
        }
    }
}