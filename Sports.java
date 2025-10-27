import java.util.ArrayList;

interface Playable {
    void startPlay();
    void stopPlay();
}

interface Tournament {
    void registerTeam(String teamName);
    void displayPrizePool();
}

class Cricket implements Playable, Tournament {
    private ArrayList<String> teams = new ArrayList<>();
    
    @Override
    public void startPlay() {
        System.out.println("The Cricket match is starting! (First ball)");
    }

    @Override
    public void stopPlay() {
        System.out.println("The Cricket match has ended. (Stumps)");
    }

    @Override
    public void registerTeam(String teamName) {
        this.teams.add(teamName);
        System.out.println("[Cricket] Team '" + teamName + "' has been registered.");
    }

    @Override
    public void displayPrizePool() {
        System.out.println("[Cricket] The tournament prize is $1,000,000.");
    }
}

class Football implements Playable, Tournament {
    private ArrayList<String> teams = new ArrayList<>();
    
    @Override
    public void startPlay() {
        System.out.println("The Football match is kicking off! (Whistle blows)");
    }

    @Override
    public void stopPlay() {
        System.out.println("The Football match is over. (Full-time)");
    }

    @Override
    public void registerTeam(String teamName) {
        this.teams.add(teamName);
        System.out.println("[Football] Club '" + teamName + "' has been registered.");
    }

    @Override
    public void displayPrizePool() {
        System.out.println("[Football] The tournament prize is $5,000,000.");
    }
}

public class Sports {
    public static void main(String[] args) {
        
        System.out.println("--- Testing Cricket ---");
        Cricket game1 = new Cricket();
        game1.startPlay();
        game1.registerTeam("India");
        game1.displayPrizePool();
        game1.stopPlay();

        System.out.println("\n--- Testing Football ---");
        Football game2 = new Football();
        game2.startPlay();
        game2.registerTeam("Brazil");
        game2.displayPrizePool();
        game2.stopPlay();
        
        System.out.println("\n--- Demonstrating Polymorphism with Interfaces ---");
        
        Playable playableGame = new Cricket();
        playableGame.startPlay();
        playableGame.stopPlay();
        
        Tournament footballTournament = new Football();
        footballTournament.registerTeam("Real Madrid");
        footballTournament.displayPrizePool();
    }
}
