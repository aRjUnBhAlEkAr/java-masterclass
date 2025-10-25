package student;

public class StudentMain{
    public static void main(String[] args){
        StudentOperations object = new StudentOperations();

        Student s[] = new Student[3];
        object.acceptData(s);
        object.showData(s);       
    }
}