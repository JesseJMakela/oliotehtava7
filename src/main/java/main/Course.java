package main;

import java.util.ArrayList;

public class Course implements PrintInfo
{
    private int maxnumberOfStunedts;
    private String name;
    private String id;
    private ArrayList<Enrollment> enrollments;

    public void printInfo(int n) {
        System.out.println(n + ") "+id + " " + name);
    }
    public Course(String name, String id, int maxnumberOfStunedts)
    {
        this.name = name;
        this.id = id;
        this.maxnumberOfStunedts = maxnumberOfStunedts;
        this.enrollments = new ArrayList<>();
    }
    public void addenrollment(Student student){
        Enrollment enrollment = new Enrollment(student);
        enrollments.add(enrollment);
    }

    public void listEnrolled() 
    {
        System.out.println(id + " " + name);
        for (Enrollment enrollment : enrollments) {
            System.out.println(enrollment.getStudent().getId() +" "+ enrollment.getStudent().getName() + ", arvosana: " + enrollment.grade);
        }
    }
}