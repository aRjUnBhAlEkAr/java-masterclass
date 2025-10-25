// Package declaration
package student;

// Definition of class StudentMain.
public class StudentMain{
    public static void main(String[] args){
        // Creating object of class StudentOperations so we can access the methods of StudentOperations class.
        StudentOperations object = new StudentOperations();
        // Definition of the Student Class object array.
        Student[] student = new Student[3];

        // Calling the acceptData() method.
        object.acceptData(student);

        // Printing the data in the object before sorting.
        System.out.println("Before Sorting Data: ");
        object.showData(student);

        // calling the sortStudent() method.
        object.sortStudent(student);
        
        // Printing the data in the object after soring.
        System.out.println("After Sorting Data: ");
        object.showData(student);
    }
};