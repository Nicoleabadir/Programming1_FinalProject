package Final;
import java.util.*;


/**
 * Décrivez votre classe Game ici.
 *
 * @author (Pamjot et Nicole)
 * @version (un numéro de version ou une date)
 */
public class Game
{
    private int id;
    private String title;
    private Genre genre;
    private AgeRating ageRating;
    private PlatForm platform;
    private double rating;

    /**
     * Constructeur d'objets de classe Game
     */
    
    public Game(int id, String title, Genre genre, AgeRating ageRating, PlatForm platform)
    {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.platform = platform;
        this.ageRating = ageRating;
        this.rating = 0; 
        
    }
    
    public Genre getGenre(){
        return genre;
    }
    
    public int getId(){
        return id;
    }
    
    public String getTitle(){
        return title;
    }
    
    public AgeRating getAgeRating(){
        return ageRating;
    }
    
    public PlatForm getPlatform(){
        return platform;
    }
    
    public double getRating() {
        return rating;
    }

    public String toString(){
        return ("ID: " +id+ ", Title: " +title+ ", Genre: " +genre+ ", Plat Form: " +platform+ ", Age Rating: " +ageRating+ ", Rating: " +rating);
    }
}
