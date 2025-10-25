package studentmanagement;

import java.util.Scanner;

public class StudentMain{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Student student[] = new Student[10];
        StudentOperations studentoperation = new StudentOperations();
        
        int choice;
        while(true){
            System.out.print("1 - Add Student\n2 - Update Student\n3 - Find Student\n4 - Remove Student\n5 - Exit\nEnter your Choice: ");
            choice = in.nextInt();

            switch(choice){
                case 1: studentoperation.insertStudent(student); 
                        break;

                case 2: System.out.print("Enter Student ID: "); 
                        studentoperation.updateStudent(in.nextInt(), student);
                        break;

                case 3: System.out.print("Enter Student ID: ");
                        studentoperation.findStudent(in.nextInt(), student);
                        break;

                case 4: System.out.print("Enter Student ID: ");
                        studentoperation.removeStudent(in.nextInt(), student);
                        break;
                
                case 5: System.exit(0);
            }
        }
    }
};