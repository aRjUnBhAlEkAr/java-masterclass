package customexception;

import java.lang.Exception;
import java.util.Scanner;

class InvalidAgeForVotingException extends Exception{
    public InvalidAgeForVotingException(String message){
        super(message);
    }
};

public class CheckEligibility{
    public void checkEligiblity(int age) throws InvalidAgeForVotingException{
        if(age < 18){
            throw new InvalidAgeForVotingException("Not Eligible for voting.");
        }
        else{
            System.out.println("Eligible for voting.");
        }
    }

    public static void main(String[] args) throws InvalidAgeForVotingException{
        Scanner in = new Scanner(System.in);
        CheckEligibility object = new CheckEligibility();
        System.out.print("Enter Age of Person: ");
        object.checkEligiblity(in.nextInt());
    }
};