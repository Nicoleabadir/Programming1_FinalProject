package Final;


/**
 * Décrivez votre classe Game ici.
 *
 * @author (votre nom)
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
    
    public String printDetail(){
        return ("ID: " +id+ ", Title: " +title+ ", Genre: " +genre+ ", Plat Form: " +platform+ ", Age Rating: " +ageRating+ ", Rating: " +rating);
    }
}
