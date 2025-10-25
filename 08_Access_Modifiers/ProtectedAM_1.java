package protectedam.secondpack;

import protectedam.ProtectedAM;

// Declaration of the Sub-Class where we will access the Properties of the super-class. 
class ProtectedAM_1 extends ProtectedAM{
    public static void main(String[] args){
        ProtectedAM_1 object = new ProtectedAM_1();

        object.getProperties("Anjani Sut Hanuman", 1525, 99.99);
        object.printProperties();
    }
};