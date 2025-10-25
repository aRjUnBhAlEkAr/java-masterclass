package studentmanagement;

import java.util.Scanner;

public class StudentOperations{
    Scanner in = new Scanner(System.in);
    private int count = 0;

    public void insertStudent(Student student[]){
        System.out.print("Len: "+ student.length + "\nStudent ID: ");
        int id = in.nextInt();

        if(findIndex(id, student) == -1){
            System.out.print("Student Name: ");
            String name = in.nextLine();
            name = in.nextLine();

            System.out.print("Student Age: ");
            int age = in.nextInt();

            student[count] = new Student(id, name, age);
            count++;
            System.out.println("Record Inserted Successfully!\n");
        }
        else{
            System.out.println("Recored already exist!");
        }
    }

    public void updateStudent(int id, Student student[]){
        int index = findIndex(id, student);
        if(index == -1){
            System.out.println("Record not present!");
        }
        else{
            System.out.print("Student Name: ");
            student[index].setName(in.next());

            System.out.print("Student Age: ");
            student[index].setAge(in.nextInt());
        }
    }

    public void findStudent(int id, Student student[]){
        int index = findIndex(id, student);
        if(index == -1){
            System.out.println("Record not Present!");
        }
        else{
            System.out.println(student[index].toString() + "\n");
        }
    }

    public void removeStudent(int id, Student student[]){
        int index = findIndex(id, student);
        if(index != -1){
            while(index < count){
                student[index] = student[index+1];
                index++;
            }
            count--;
            System.out.println("Record removed!\n");
        }
        else{
            System.out.println("Record not present!\n");
        }
    }

    public int findIndex(int id, Student student[]){
        int index;

        for(index = 0; index < count; index++){
            if(student[index].getId() == id){
                return index;
            }
        }
        return -1;
    }
};