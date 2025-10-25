package method;

public class Palindrom{
    public void checkPalindrom(int num){
        int input = num;
        int result = 0;
        int remain = 0;

        while(input!=0){
            remain = input%10;
            result = (result * 10) + remain;
            input = input/10;
        }

        if(result == num){
            System.out.println("Number is palindrom");
        }
        else{
            System.out.println("Number is not palindrom");
        }
    }
};