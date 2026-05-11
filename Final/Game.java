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
    private gamePlatForm gamePlatForm;
    private double rating;

    /**
     * Constructeur d'objets de classe Game
     */
    
    public Game(int id, String title, Genre genre, AgeRating ageRating, gamePlatForm gamePlatForm)
    {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.gamePlatForm = gamePlatForm;
        this.ageRating = ageRating;
        this.rating = 0; 
        
    }
    
    public Genre getGenre(){
        return genre;
    }
    
    public boolean matchesGenre(Genre genre) { 
        return this.genre == genre;
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
    
    public boolean matchesAgeRating(AgeRating ageRating) {
        return this.ageRating == ageRating;
    }
    
    public gamePlatForm getgamePlatForm(){
        return gamePlatForm;
    }
    
    public boolean matchesPlatform(gamePlatForm platform) {
        return this.gamePlatForm == platform;
    }
    
    public boolean canPlay() {
        return true;
    }
    
    public double getRating() {
        return rating;
    }
    
    public boolean isTopRated() { 
        return rating >= 8;
    }
    
    public String getGameType() {
        return "General Game";
    }
    
    public void startGame() {
        System.out.println("Starting " + title + "...");
    }
    
    public boolean hasSameTitle(String title) {
        return this.title.equalsIgnoreCase(title);
    }
    
    public String getShortDescription() {
        return id + " - " + title + " (" + getGameType() + ")";
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
    
    public void setRating(double rating) {
        if (rating >= 0 && rating <= 10) {
            this.rating = rating;
        } else {
            System.out.println("Invalid rating. Rating must be between 0 and 10.");
        }
    }
    
    public String printDetails(){
        return ("ID: " +id+ ", Title: " +title+ ", Genre: " +genre+ ", Plat Form: " +gamePlatForm+ ", Age Rating: " +ageRating+ ", Rating: " +rating);
    }
    
    public String toString() {
        return title + " | " + genre + " | " + gamePlatForm + " | Rating: " + rating;
    }  
}
