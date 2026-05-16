package Final;
import java.util.ArrayList;


/**
 * Write a description of class MultiplayerGame here.
 *
 * @author (Nicole Abadir)
 * @version (a version number or a date)
 */
public class MultiplayerGame extends Game
{
    // instance variables - replace the example below with your own
     private int maxPlayers;
     private ArrayList<String> players;
     private ArrayList<String> games;

    /**
     * Constructor for objects of class MultiplayerGame
     */
        public MultiplayerGame(int id,String title, Genre genre, gamePlatForm gamePlatForm, AgeRating ageRating, int maxPlayers)
    {
        // initialise instance variables
        super(id, title, genre, ageRating, gamePlatForm);
        this.maxPlayers = maxPlayers;
        players = new ArrayList<>();
        games = new ArrayList<>();
    }
    
    public String getGameType() {
        return "Multiplayer Game";
    }
    
    public void addGames(){
        games.add("PUBG");
        games.add("Call Of Duty");
        games.add("FIFA");
        games.add("Bingo");
    }
    
    public boolean containsPlayer(String playerName) {
        return players.contains(playerName);
    }
    
    public void addPlayer(String playerName) {
       if(isFull()) {
           System.out.println("Maximum number of players reached.");
       }

       else if(players.contains(playerName)) {
           System.out.println("Player already exists.");
       }

       else {
           players.add(playerName);
           System.out.println(playerName + " joined the game.");
       }
    }
    
    public void listAllPlayers(){
        for ( String player : players){
            System.out.println(player);
        }
    }
    
    public boolean isFull() {
        return players.size() >= maxPlayers;
    }
    
    public int getCurrentPlayerCount() {
        return players.size();
    }
    
    public boolean canPlay() {
       return players.size() >= 2;
    }
    
    public void startMatch() {
        if(canPlay()) {
            System.out.println("Match starting...");
        }

        else {
            System.out.println("Not enough players.");
        }
    }
    
    public void removePlayer(String playerName) {
        if(players.remove(playerName)) {
            System.out.println(playerName + " left the game.");
        }
         else {
            System.out.println("Player not found.");
        }
    }
    
    public void kickPlayer(String playerName) {
        if(players.remove(playerName)) {
            System.out.println(playerName + " was kicked.");
        }

        else {
            System.out.println("Player not found.");
        }
    }
    
    public void clearPlayers() {
     players.clear();
    }
    
    public void startGame() {
     System.out.println("Starting multiplayer game: " + getTitle());
    }
    
    public String printDetails() {
     return super.printDetails() + ", Max Players: " + maxPlayers + ", Current Players: " + players.size();
    }
    
    public String toString(){
     return super.toString() + "/ Max Players:" + maxPlayers + "/ Current Players :" + players.size();
    }
}