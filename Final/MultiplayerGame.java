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

    /**
     * Constructor for objects of class MultiplayerGame
     */
        public MultiplayerGame(int id,String title, Genre genre, gamePlatForm gamePlatForm, AgeRating ageRating, int maxPlayers)
    {
        // initialise instance variables
        super(id, title, genre, ageRating, gamePlatForm);
        this.maxPlayers = maxPlayers;
        players = new ArrayList<>();
    }
    
    public void addPlayer(String playerName){
        if (players.size() < maxPlayers){
            players.add(playerName);
        } else{
            System.out.println("Maximum number of players reached.");
        }
    }
    
    public void listAllPlayers(){
        for ( String player : players){
            System.out.println(player);
        }
    }
    
    public void startMultiplyer(){
        System.out.println("Starting multiplyer game; " + getTitle());
    }
    
    public String toString(){
        return super.toString() + "/ Max Players:" + maxPlayers + "/ Current Players :" + players.size();
    }
}