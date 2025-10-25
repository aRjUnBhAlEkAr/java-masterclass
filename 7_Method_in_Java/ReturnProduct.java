package method;

public class ReturnProduct{
    public int returnProduct(){
        int product = 1;
        for(int i = 1; i <= 10; i++){
            product*=i;
        }
        return product;
    }
};