package method;

public class PrimeNumber{
    public void checkPrimeOrNot(int num){
        int flag = 0;

        for(int i = 2; i <= num; i++){
            if(num%i==0){
                flag++;
            }
        }

        if(flag != 1){
            System.out.println("Number is Not Prime");
        }
        else{
            System.out.println("Number is Prime");
        }
    };
};