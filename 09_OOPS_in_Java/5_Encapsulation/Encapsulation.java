package encapsulation;

import java.util.Scanner;

class EncapsulationClass{
    // Declaration of Instance variable as an Private so it become an Encapsulated Class.
    private String name;
    private int roll;
    private double marks;
    private String department;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getRoll(){
        return roll;
    }

    public void setRoll(int roll){
        this.roll = roll;
    }

    public double getMarks(){
        return marks;
    }

    public void setMarks(double marks){
        this.marks = marks;
    }

    public String getDepartment(){
        return department;
    }

    public void setDepartment(String department){
        this.department = department;
    }
};


class Encapsulation{
    public static void main(String[] args){
        EncapsulationClass object = new EncapsulationClass();
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        object.setName(in.nextLine());
        System.out.print("Enter Student Department: ");
        object.setDepartment(in.nextLine());
        System.out.print("Enter Student Roll: ");
        object.setRoll(in.nextInt());
        System.out.print("Enter Student Marks: ");
        object.setMarks(in.nextDouble());

        System.out.println("\nStudent Name: " + object.getName());
        System.out.println("Student Roll: " + object.getRoll());
        System.out.println("Student Department: " + object.getDepartment());
        System.out.println("Student Marks: " + object.getMarks());

        in.close();
    }
};