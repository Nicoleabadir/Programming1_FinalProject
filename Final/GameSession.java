package Final;
import java.util.*;


/**
 * Décrivez votre classe GameSession ici.
 *
 * @author (Pamjot et Nicole)
 * @version (un numéro de version ou une date)
 */
public class GameSession
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private Game game;
    private int duration;
    private ArrayList<String> players;
    private long startTime;
    private long endTime;
    private String sessionType;   // "SOLO", "ONLINE", "MULTIPLAYER"
    private ArrayList<String> comments;

    /**
     * Constructeur d'objets de classe GameSession
     */
    public GameSession(Game game, String sessionType)
    {
        // initialisation des variables d'instance
        this.game = game;
        this.sessionType = sessionType;
        this.players = new ArrayList<>();
        this.comments = new ArrayList<>();

    }
    public void addPlayer(String name) {
        players.add(name);
    }       

    public void startSession() {
        startTime = System.currentTimeMillis();
        System.out.println("Starting session for " + game.getTitle());
    } 
    public void endSession() {
        endTime = System.currentTimeMillis();
        long duration = (endTime - startTime) / 1000; // seconds
        System.out.println("Session ended. Duration: " + duration + " seconds.");
    }
    public void addComment(String comment) {
        comments.add(comment);
    }
    public void printSessionReport() {
        System.out.println("========== SESSION REPORT ==========");
        System.out.println("Game: " + game.getTitle());
        System.out.println("Type: " + sessionType);

        if (!players.isEmpty()) {
            System.out.println("Players:");
            for (String p : players) {
                System.out.println(" - " + p);
            }
        }

        long duration = (endTime - startTime) / 1000;
        System.out.println("Duration: " + duration + " seconds");

        if (!comments.isEmpty()) {
            System.out.println("Comments:");
            for (String c : comments) {
                System.out.println(" - " + c);
            }
        }
    
        System.out.println("====================================");
    }

     public String toString() {
        return "Game: " + game.getTitle() + ", Duration: " + duration + " minutes";
    }
}
