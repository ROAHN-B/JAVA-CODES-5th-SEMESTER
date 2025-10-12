import java.util.*;

class MinorAgeException extends Exception{
    public MinorAgeException(String message){
        super (message);
    }

}

public class VotingMachine{
    public void castVote(int age) throws MinorAgeException{
        if (age < 18){
            throw new MinorAgeException("Not valid age for voting!!"); 
        }
        else{
            System.out.println("Ready for voting!!");
        }
    }

    public  static void main(String [] args){
        VotingMachine v1 = new VotingMachine();

        try {
            v1.castVote(20);
        }
        catch (MinorAgeException e){
            System.out.println("AgE exception : " + e.getMessage());
        }

         try {
            v1.castVote(16);
        }
        catch (MinorAgeException e){
            System.out.println("Age exception : " + e.getMessage());
        }
    }
}