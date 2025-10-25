package practice;

public class CountOfDigit{
    public void seperateDigit(int num){
        int number = num;
        int result = 0;
        int remain = 0;
        int count = 0;

        while(number != 0){
            count++;
            remain = number%10;
            result = result * 10 + remain;
            number/=10;
        }

        number = result;
        
        while(number != 0){
            remain = number % 10;
            power(remain, count);
            number/=10;
        }

    }

    public void power(int digit, int power){
        int result = digit;
        System.out.print(digit + "^"+ power + "=" + digit);
        for(int num = 1; num < power; num++){
            System.out.print("*" + digit);
        }
        System.out.println();
    }

    public static void main(String[] args){
        CountOfDigit object = new CountOfDigit();
        object.seperateDigit(4715);
    }
};