package publicam;

public class PublicAM{
    public String name = "Arjun";
    public int roll_no = 187037;
    public double marks = 85.47;

    public void getProperties(String name, int roll_no, double marks){
        this.name = name;
        this.roll_no = roll_no;
        this.marks = marks;
    }

    public void printProperties(){
        System.out.println("Name: " + name + "\nRoll No: " + roll_no + "\nMarks: " + marks);
    }
};