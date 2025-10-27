class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}

class Voting{
    public void registervoter(int age) throws InvalidAgeException{
        if (age <18){
            throw new InvalidAgeException("Age is below 18 can't vote");
        }
        else{
            System.out.println("Ready for voting");
        }
    }
}

public class VoteRegistration{
    public static void main(String [] args){
        try {
            Voting V1 = new Voting();
            V1.registervoter(12);
        }
        catch(InvalidAgeException e){
            System.out.println("Error: "+e.getMessage());
        }

        try {
            Voting V1 = new Voting();
            V1.registervoter(21);
        }
        catch(InvalidAgeException e){
            System.out.println("Error: "+e.getMessage());
        }


    }
}