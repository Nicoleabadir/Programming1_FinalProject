package Final;


/**
 * Décrivez votre classe GameSession ici.
 *
<<<<<<< HEAD
 * @author (Pamjot Singh Pannu)
=======
 * @author (Pamjot)
>>>>>>> 690d2de20da9de20ae7bccefb26e9c45765e8e34
 * @version (un numéro de version ou une date)
 */
public class GameSession
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private Game game;
    private int duration;

    /**
     * Constructeur d'objets de classe GameSession
     */
    public GameSession(Game game, int duration)
    {
        // initialisation des variables d'instance
        this.game = game;
        this.duration = duration;

    }
    
    public void startSession() {
        System.out.println("Starting session for " + game.getTitle());
    } 
    
     public String toString() {
        return "Game: " + game.getTitle() + ", Duration: " + duration + " minutes";
    }
}
