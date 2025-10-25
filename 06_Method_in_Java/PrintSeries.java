package method;

public class PrintSeries{
    public static void printEven(){
        System.out.println("Printing Even: ");
        for(int i = 1; i <= 10; i++){
            if(i%2==0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void printCube(){
        System.out.println("Printing Cube: ");
        for(int i = 30; i >= 10; i--){
            System.out.print((i*i*i) + " ");
        }
        System.out.println();
    }
};