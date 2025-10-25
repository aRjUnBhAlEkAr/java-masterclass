// package declaration
package student;

// importing necessary libraries for input
import java.util.Scanner;

// Definition of "StudentOperations" class.
public class StudentOperations{
    // Declaration of instance object of Scanner class.
    Scanner in = null;

    // Definition of acceptData() method which accepts the data from the user.
    public void acceptData(Student student[]){
        // Instantiation of the Scanner class.
        in = new Scanner(System.in);

        System.out.println(" *** Acception Student Details *** ");
        // Declaration of local variable which will store values.
        int id = 0;
        String name = null;
        String department = null;
        double cgpa = 0;

        // Definition of the for-loop for accepting the value accoring to the size of array.
        for(int index = 0; index < student.length; index++){
            System.out.println("Enter " + (index+1) + " Student Details: ");
            System.out.print("ID : ");
            id = in.nextInt();
            
            System.out.print("Name : ");
            name = in.next();
            
            System.out.print("Department : ");
            department = in.next();
            
            System.out.print("CGPA : ");
            cgpa = in.nextDouble();

            // Calling the parameterized constructor of class Student()
            student[index] = new Student(id, name, department, cgpa);
        }
        // closing the resorces.
        in.close();
    }

    // Definition of the showData() method which will print all the object and their corresponding data.
    public void showData(Student student[]){
        for(int index = 0; index < student.length; index++){
            System.out.println(student[index]);
        }
    }

    // Using BubbleSort method for the sorting the object based on their student id.
    public void sortStudent(Student student[]){
        // Declaration of Temparary object for holding the object.
        Student temp_object = null;

        // Definition of the outer for-loop.
        for(int index = 0; index < student.length; index++){
            // Definition of the inner for-loop.
            for(int ptr = index+1; ptr < student.length; ptr++){
                if(student[index].getId() > student[ptr].getId()){
                    temp_object = student[index];
                    student[index] = student[ptr];
                    student[ptr] = temp_object;
                }
            }
        }
    }
};