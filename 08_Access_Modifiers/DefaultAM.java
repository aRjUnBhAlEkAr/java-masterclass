package defaultam;

class DefaultAM{
    String name;
    int roll_no;
    double marks;

    void getProperties(String name, int roll_no, double marks){
        this.name = name;
        this.roll_no = roll_no;
        this.marks = marks;
    }

    void printProperties(){
        System.out.println("Name: " + name + "\nRoll No: " + roll_no + "\nMarks: " + marks);
    }

    public static void main(String[] arsg){
        DefaultAM object = new DefaultAM();

        object.getProperties("Krishna Vasudev Yadav", 187037, 98.95);
        object.printProperties();
    }
};