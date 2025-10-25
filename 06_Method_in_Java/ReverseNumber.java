package method;

public class ReverseNumber{
    public void reverseNumber(int num){
        int remain = 0;
        int result = 0;

        while(num!=0){
            remain = num%10;
            result = result*10+remain;
            num/=10;
        }

        System.out.println("Reverse number is " + result);
    }
};