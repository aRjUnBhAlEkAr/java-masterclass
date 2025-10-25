/*
    Date: 14-03-2025
    Title: BufferReader Class in Java
    - BufferReader is a Class in java which used to read the data inserted on the command prompt.

*/

// package declaration
package inputs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Definition of the class
public class BufferReaderClass{
    public static void main(String[] args) throws IOException{
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        System.out.print("Enter any value: ");
        int num = Integer.parseInt(bf.readLine());

        System.out.println("Value is " + num);
    }
};