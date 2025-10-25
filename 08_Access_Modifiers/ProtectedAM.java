package protectedam;

public class ProtectedAM{
    protected String name;
    protected int roll_no;
    protected double marks;

    protected void getProperties(String name, int roll_no, double marks){
        this.name = name;
        this.roll_no = roll_no;
        this.marks = marks;
    }

    protected void printProperties(){
        System.out.println("Name: " + name + "\nRoll No: " + roll_no + "\nMarks: " + marks);
    }
};