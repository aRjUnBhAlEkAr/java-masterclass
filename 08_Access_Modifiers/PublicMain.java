package publicam;

import java.util.Scanner;

public class PublicMain{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PublicAM object = new PublicAM();
        
        System.out.println("Printing intialized values: ");
        object.printProperties();

        System.out.println("\nEnter following values: ");
        System.out.print("Name: ");
        String name = in.nextLine();

        System.out.print("Roll No: ");
        int roll_no = in.nextInt();

        System.out.print("Marks: ");
        double marks = in.nextDouble();

        object.getProperties(name, roll_no, marks);
        object.printProperties();
    }
};