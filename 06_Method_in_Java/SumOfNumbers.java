package method;

public class SumOfNumbers{
    public void printSumOfNumbers(){
        int sum = 0;
        for(int i = 1; i <= 10; i++){
            sum+=i;
        }
        System.out.println("Sum is " + sum);
    }
};