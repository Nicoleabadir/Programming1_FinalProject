package Final;
import java.util.*;


/**
 * Décrivez votre classe RatingLibrary ici.
 *
 * @author (Pamjot)
 * @version (un numéro de version ou une date)
 */
public class RatingLibrary
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private Game game;
    private GameLibrary gameLibrary;
    private HashMap<Integer, ArrayList<Integer>> ratings;
    private HashMap<Integer, ArrayList<String>> comments;
    /**
     * Constructeur d'objets de classe RatingLibrary
     */
    public RatingLibrary(GameLibrary gameLibrary)
    {
        // initialisation des variables d'instance
        this.gameLibrary = gameLibrary;
        ratings = new HashMap<>();
        comments = new HashMap<>();
    }
    public void rateGame(int gameId, int rating) {
        Game g = gameLibrary.getGameById(gameId);
    
        if (g == null) {
            System.out.println("Game not found.");
            return;
        }
    
        if (rating < 0 || rating > 10) {
            System.out.println("Rating must be between 0 and 10.");
            return;
        }
    
        ratings.putIfAbsent(gameId, new ArrayList<>());
        ratings.get(gameId).add(rating);
    }
    public void addComment(int gameId, String comment) {
        Game g = gameLibrary.getGameById(gameId);

        if (g == null) {
            System.out.println("Game not found.");
            return;
        }

        comments.putIfAbsent(gameId, new ArrayList<>());
        comments.get(gameId).add(comment);
    }   
        public double getAverageRating(int gameId) {
        if (!ratings.containsKey(gameId)) {
            return -1; // no ratings
        }
    
        ArrayList<Integer> list = ratings.get(gameId);
    
        int sum = 0;
        for (int r : list) {
            sum += r;
        }

        return (double) sum / list.size();
    }
    public void printOfficialRating(int gameId) {
        if (!ratings.containsKey(gameId)) {
            System.out.println("No ratings yet.");
            return;
        }

        ArrayList<Integer> list = ratings.get(gameId);
    
        if (list.size() < 10) {
            System.out.println("Not enough ratings (" + list.size() + "/10).");
            return;
        }

        double avg = getAverageRating(gameId);
        System.out.println("Official Rating: " + avg + "/10");
    }
    public void printComments(int gameId) {
        if (!comments.containsKey(gameId)) {
            System.out.println("No comments yet.");
            return;
        }

        for (String c : comments.get(gameId)) {
            System.out.println("- " + c);
        }
    }

    
    
    
    
    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */

}
