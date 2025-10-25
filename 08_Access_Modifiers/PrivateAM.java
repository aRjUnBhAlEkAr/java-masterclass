package privateam;

class PrivateAM{
    private String name;
    private int roll_no;
    private double marks;
    
    private void getProperties(String name, int roll_no, double marks){
        this.name = name;
        this.roll_no = roll_no;
        this.marks = marks;
    }

    private void printProperties(){
        System.out.println("Name: " + name + "\nRoll No: " + roll_no + "\nMarks: " + marks);
    }

    public static void main(String[] args){
        PrivateAM object = new PrivateAM();

        object.getProperties("Krishna Vasudev Yadav", 21, 99.99);

        object.printProperties();
    }
};