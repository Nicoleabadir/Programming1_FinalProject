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
    public void startGame() {
        System.out.println("Connecting to server...");
        System.out.println("Starting online game: " + getTitle());
    }
    
    public boolean requiresInternet() {
        return requiresInternet;
    }
    
    public void connectToServer() {
        if(requiresInternet) {
            System.out.println("Connecting to online servers...");
        }
    }
    
    public boolean canPlay() {
        return requiresInternet;
    }
    
    public String printDetails() {
        return super.printDetails() + ", Requires Internet: " + requiresInternet;
    }
    
    public void playWithFriends() {
        System.out.println("Playing online with friends in " + getTitle());
    }
    
    public void checkServerStatus() {
        System.out.println("Servers are online.");
    }
    
    public String getGameType() {
        return "Online Game";
    }
    
    public void disconnect() {
        System.out.println(getTitle() + " has disconnected from the server.");
    }
    
    public String toString(){
        return super.toString() + "/ Requires Internet:" + requiresInternet;
    }
}