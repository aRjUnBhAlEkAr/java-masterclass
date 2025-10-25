package privateam;

class PrivateMain{

    // None of the data member and member function accessible in the this "PrivateMain" class.
    public static void main(String[] args){
        PrivateAM object = new PrivateAM();

        /* Following code will show Error.
            PrivateMain.java:12: error: printProperties() has private access in PrivateAM
            object.printProperties();
        */
        // object.name = "Arjun";

        // object.printProperties(); 
    }
};