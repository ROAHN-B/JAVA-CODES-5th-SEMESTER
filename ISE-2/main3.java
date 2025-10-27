interface playable{
    void plays();
}

interface Tournament{
    void tournamentStart();
    void tournamentStop();
}

class Cricket implements playable, Tournament{

    public void plays(){
        System.out.println("Plays Cricket..... ");
    }


    public void tournamentStart(){
        System.out.print("Tournament starts at 12:00 pm ");
    }


    public void tournamentStop(){
        System.out.println("Tournament stops at 3:00 pm ");
    }

}

class Football implements playable, Tournament{
    
    public void plays(){
        System.out.println("Plays Football..... ");
    }


    public void tournamentStart(){
        System.out.print("Tournament starts at 3:30 pm ");
    }


    public void tournamentStop(){
        System.out.println("Tournament stops at 6:30 pm ");
    }

}

public class main3{
    public static void main(String[] arg){
        Cricket c1 = new Cricket();
        Football f1 = new Football();

        c1.plays();
        c1.tournamentStart();
        c1.tournamentStop();

        f1.plays();
        f1.tournamentStart();
        f1.tournamentStop();
    }
}


