package Final;


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

    /**
     * Constructor for objects of class SinglePlayerGame
     */
   public SinglePlayerGame(int id, String title, Genre genre, Platform  platform, AgeRating ageRating, boolean storyMode)
    {
        // initialise instance variables
        super(id, title, genre, ageRating, platform);
        this.storyMode = storyMode;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void startSolo(){
        System.out.println("Starting single-player game : " + getTitle());
   }
    
        public String toString(){
        return super.toString() + "/ Story Mode:" + storyMode;
   }
}