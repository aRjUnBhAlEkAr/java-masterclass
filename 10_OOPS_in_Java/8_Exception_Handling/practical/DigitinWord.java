package practice;

import java.util.Scanner;

public class DigitinWord{
    public void seperateDigit(int num){
        int number = num;
        int remain = 0;
        int count = 0;

        while(number != 0){
            remain = number%10;
            number/=10;
            count++;
        }

        int array[] = new int[count];
        number = num;
        int indexW = 0;
        while(number != 0){
            remain = number%10;
            array[indexW++] = remain;
            number/=10;
        }

        for(int index = array.length-1; index >= 0; index--){
            System.out.print(printWord(array[index]) + " ");
        }
    }

    public String printWord(int num){
        if(num == 1){
            return "One";
        }
        else if(num == 2){
            return "Two";
        }
        else if(num == 3){
            return "Three";
        }
        else if(num == 4){
            return "Four";
        }
        else if(num == 5){
            return "Five";
        }
        else if(num == 6){
            return "Six";
        }
        else if(num == 7){
            return "Seven";
        }
        else if(num == 8){
            return "Eight";
        }
        else if(num == 9){
            return "Nine";
        }
        else{
            return "Zero";
        }
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        DigitinWord object = new DigitinWord();
        System.out.print("Enter a number: ");
        object.seperateDigit(in.nextInt());
    }
};