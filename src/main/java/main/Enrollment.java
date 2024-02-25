package main;

public class Enrollment {
    public int grade;
    private Student name;

    public Enrollment(Student name)
    {
        this.name = name;
        this.grade = -1;
    }
    public void setGrade(int grade)
    {
        this.grade = grade;
    }
    public Student getStudent()
    {
    return name;  
    }   
    public int getGrade()
    {
        return grade;
    }

}
