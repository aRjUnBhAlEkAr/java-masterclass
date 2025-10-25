package method;

public class FibonacciSeries{
    public void fibonacciSeries(){
        int sum = 0;
        int num1 = 0;
        int num2 = 1;
        System.out.print(num1 + " " + num2);
        for(int i = 0; i < 10; i++){
            sum = num1 + num2;
            System.out.print(" " + sum);
            num1 = num2;
            num2 = sum;     
        }
    }
};