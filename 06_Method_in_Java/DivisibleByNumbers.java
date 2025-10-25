package method;

public class DivisibleByNumbers{
    public void checkDivisible(int num){
        if(num%3 == 0 && num%5 == 0){
            System.out.println("Number is divisible by 3 & 5");
        }
        else{
            System.out.println("Number is not divisible by 3 & 5");
        }
    }
};