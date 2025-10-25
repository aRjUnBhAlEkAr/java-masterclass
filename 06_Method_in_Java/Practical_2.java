package method;


public class Practical_2{
    public static void main(String[] args){
        java.util.Scanner in = new java.util.Scanner(System.in);

        System.out.print("Enter a value: ");
        int input = in.nextInt();

        // Creating object of the class
        EvenOrNot obj = new EvenOrNot();

        obj.checkEvenOrOdd(input);

        // releasing the resources.
        in.close();
    }
};