package Final;
import java.util.*;


/**
 * Décrivez votre classe Game ici.
 *
<<<<<<< HEAD
 * @author (Nicole Abadir)
=======
 * @author (Pamjot et Nicole)
>>>>>>> 690d2de20da9de20ae7bccefb26e9c45765e8e34
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
<<<<<<< HEAD
    
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
=======

    public String toString(){
>>>>>>> 690d2de20da9de20ae7bccefb26e9c45765e8e34
        return ("ID: " +id+ ", Title: " +title+ ", Genre: " +genre+ ", Plat Form: " +platform+ ", Age Rating: " +ageRating+ ", Rating: " +rating);
    }
}
