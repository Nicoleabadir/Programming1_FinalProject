package Final;
import java.util.*;


/**
 * Décrivez votre classe Game ici.
 *
 * @author (Nicole Abadir)
 * @version (un numéro de version ou une date)
 */
public class Game
{
    private int id;
    private String title;
    private Genre genre;
    private AgeRating ageRating;
    private Platform platform;
    private double rating;

    /**
     * Constructeur d'objets de classe Game
     */
    
    public Game(int id, String title, Genre genre, AgeRating ageRating, Platform platform)
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
    
    public Platform getPlatform(){
        return platform;
    }
    
    public double getRating() {
        return rating;
    }

    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Game)){
            return false;
        }

        Game other = (Game) obj;
        return this.title.equals(other.title);
    }
    
    public void setRating(int rating) {
        if (rating >= 0 && rating <= 10) {
            this.rating = rating;
        }
    }
    
    public String printDetail(){
        return ("ID: " +id+ ", Title: " +title+ ", Genre: " +genre+ ", Plat Form: " +platform+ ", Age Rating: " +ageRating+ ", Rating: " +rating);
    }
}
