package student;

import java.util.Scanner;

public class StudentOperations{
    Scanner in = null;

    public void acceptData(Student s[]){
        in = new Scanner(System.in);
        int id = 0;
        String name = null;
        int rollno = 0;

        for(int index = 0; index < s.length; index++){
            System.out.print("Enter Student ID: ");
            id = in.nextInt();

            System.out.print("Enter Student Name: ");
            name = in.next();

            System.out.print("Enter Student Roll No: ");
            rollno = in.nextInt();

            s[index] = new Student(id, name, rollno);
        }
    }

    public void showData(Student s[]){
        for(int index = 0; index < s.length; index++){
            System.out.println(s[index]);
        }
    }
};