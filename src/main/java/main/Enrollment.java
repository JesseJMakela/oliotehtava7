package main;

public class Enrollment {
    public int grade;
    
    private Student name;

    public Enrollment(Student name)
    {
        this.name = name;
    }
    public void grade(int grade)
    {
        this.grade = -1;
    }
    public Student getStudent()
    {
    return name;  
    }
}   
