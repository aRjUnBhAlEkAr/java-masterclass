package practice;

interface Printer{
    void print();
    abstract void printDetails();
};

class TextPrinter implements Printer{
    @Override
    public void print(){

    }

    @Override
    public void printDetails(){
        System.out.println("Text Printer");
    }
};

class ImagePrinter implements Printer{
    @Override
    public void print(){

    }

    @Override
    public void printDetails(){
        System.out.println("Image Printers");
    }
};

public class PrinterDemo{
    public static void main(String[] args){
        TextPrinter textprinter = new TextPrinter();
        textprinter.printDetails();

        ImagePrinter imageprinter = new ImagePrinter();
        imageprinter.printDetails();
    }
};