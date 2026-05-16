package Final;
import java.util.ArrayList;


/**
 * Write a description of class SinglePlayerGame here.
 *
 * @author (Nicole Abadir)
 * @version (a version number or a date)
 */
public class SinglePlayerGame extends Game
{
    // instance variables - replace the example below with your own
    private boolean storyMode;
    private ArrayList<String> games;

    /**
     * Constructor for objects of class SinglePlayerGame
     */
   public SinglePlayerGame(int id, String title, Genre genre, gamePlatForm  gamePlatForm, AgeRating ageRating, boolean storyMode)
    {
        // initialise instance variables
        super(id, title, genre, ageRating, gamePlatForm);
        this.storyMode = storyMode;
        games = new ArrayList<>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void startGame() {
       System.out.println("Starting single-player game: " + getTitle());
   }
   
   public void addGames(){
       games.add("Minecraft");
       games.add("Candy Crush");
       games.add("AE Mysteries");
   }
   
   public void listAllGames(){
       for (String game : games){
           System.out.println(game);
       }
   }
   
   public String getGameType() {
       return "Single Player Game";
   }  
   
   public boolean canPlay() {
       return true;
   }
   
   public void restartGame() {
       System.out.println(getTitle() + " has restarted from the beginning.");
   }
   
   public void pauseGame() {
       System.out.println(getTitle() + " is paused.");
   }
   
   public void setStoryMode(boolean storyMode) {
       this.storyMode = storyMode;
   }
   
   public boolean hasStoryMode() {
       return storyMode;
   }
   
   public void loadProgress() {
       System.out.println("Loading saved progress for " + getTitle());
   }
   
   public void saveProgress() {
       System.out.println("Progress saved for " + getTitle());
   }
   
   public String printDetails() {
       return super.printDetails() + ", Story Mode: " + storyMode;
   }
    
    public String toString(){
       return super.toString() + "/ Story Mode:" + storyMode;
   }
}