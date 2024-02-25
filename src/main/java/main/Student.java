package main;

public class Student implements PrintInfo
{
    public String name;
    public String id;

    public void printInfo(int n) {
        System.out.println(n+") "+id + " " + name);
    }

    public Student(String name, String id)
    {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
}

