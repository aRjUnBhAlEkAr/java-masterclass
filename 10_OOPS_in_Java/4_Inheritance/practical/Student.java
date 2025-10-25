package student;

import person.Person;

public class Student extends Person{
    int id;
    String department;
    double marks;

    public void acceptData(int id, String name, String department, double marks){
        this.id = id;
        this.name = name;
        this.department = department;
        this.marks = marks;
    }

    public void showData(){
        System.out.println("ID: " + id + "\nName: " + name + "\nDepartment: " + department + "\nAddress: "+ city +", "+district+", " + state + "\nMarks: " + marks);
    }
};