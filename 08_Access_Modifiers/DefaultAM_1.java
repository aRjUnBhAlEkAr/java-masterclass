package defaultam.secondpack;

import defaultam.DefaultAM;
/*
error: DefaultAM is not public in defaultam; cannot be accessed from outside package
import defaultam.DefaultAM;
*/


class DefaultAM_1 extends DefaultAM{
/*
    error: DefaultAM is not public in defaultam; cannot be accessed from outside package
    class DefaultAM_1 extends DefaultAM
*/
    public static void main(String[] args){
        // DefaultAM_1 object = new DefaultAM_1();

        // object.getProperties("Karan Bhalekar", 9865, 90.65);
        // object.printProperties();

    }
}