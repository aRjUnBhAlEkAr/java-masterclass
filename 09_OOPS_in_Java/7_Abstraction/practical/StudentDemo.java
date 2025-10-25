package student;

import java.util.Scanner;

class Student{
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    };

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String toString(){
        return "ID " + id + "\tName: " + name + "\tAge: " + age;
    }
};

class StudentDemo{
    static Scanner in;

    

    public static void main(String[] args){
        in = new Scanner(System.in);
        int count = 1;
        Student student[] = new Student[100];
        StudentDemo studentoperation = new StudentDemo();
        int choice = 0;
        while(true){
            System.out.print("1 - Add Student\n2 - Update Student\n3 - Find Student\n4 - Remove Student\n5 - Exit\nEnter your Choice: ");
            choice = in.nextInt();

            switch(choice){
                case 1: studentoperation.addStudent(student);    
                        count++;
                        break;

                case 2: System.out.print("Enter Student ID: "); 
                        studentoperation.updateStudent(in.nextInt(), student);
                        break;

                case 3: System.out.print("Enter Student ID: ");
                        studentoperation.findStudent(in.nextInt(), student);
                        break;

                case 4: System.out.println("Enter Student ID: ");
                        studentoperation.removeStudent(in.nextInt(), student);
                        break;
                
                case 5: System.exit(0);
            }
        }
    }
};