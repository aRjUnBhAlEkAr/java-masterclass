package student;

public class StudentDemo extends Student{
    public static void main(String[] args){
        StudentDemo object = new StudentDemo();
        object.acceptData(123, "Arjun", "CSE", 85.47);
        object.showData();
    }
};