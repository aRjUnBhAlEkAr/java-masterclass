package student;

public class Student{
    private int id;
    private String name;
    private int rollno;

    public Student(int id, String name, int rollno){
        this.id = id;
        this.name = name;
        this.rollno = rollno;
    }

    public Student(){

    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String toString(){
        return "Student[id:" + id + ", name:" + name + ", rollno:" + rollno + "]";
    }
};