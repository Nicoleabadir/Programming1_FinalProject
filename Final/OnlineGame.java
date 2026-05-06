package Final;


/**
 * Write a description of class OnlineGame here.
 *
 * @author (Nicole Abadir)
 * @version (a version number or a date)
 */
public class OnlineGame extends Game
{
    // instance variables - replace the example below with your own
    private boolean requiresInternet;

    /**
     * Constructor for objects of class OnlineGame
     */
    public OnlineGame(int id, String title, Genre genre, gamePlatForm gamePlatForm, AgeRating ageRating)
    {
        // initialise instance variables
        super(id, title, genre, ageRating, gamePlatForm);
        requiresInternet = true;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void startOnline()
    {
        // put your code here
        System.out.println("Starting online games:" + getTitle());
    }
    
    public String toString(){
        return super.toString() + "/ Requires Internet:" + requiresInternet;
    }
}