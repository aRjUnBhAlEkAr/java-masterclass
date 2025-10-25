package student;

import student.Student;

public class StudentTest{
    public static void main(String[] args){
        Student s = new Student();
        s.getProperties("Arjun", 22, 2278, "Java", "C++", "C", "Python", "Rust");
        s.printProperties();
    }
};