package Final;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class GameTest.
 *
 * @author  (Nicole Abadir)
 * @version (a version number or a date)
 */
public class GameTest
{
    /**
     * Default constructor for test class GameTest
     */
    public GameTest()
    {
    }
    
    public void testSetRating() {
        Game game = new Game(34567, "FIFA", Genre.SPORTS, AgeRating.KIDS, Platform.PS5);
        game.setRating(8);

        System.out.println(game.getRating()); // expected: 8
    }
    
    public void testEquals() {
        Game game1 = new Game(34567, "FIFA", Genre.SPORTS, AgeRating.KIDS, Platform.PS5);
        Game game2 = new Game(34567, "FIFA", Genre.SPORTS, AgeRating.KIDS, Platform.PS5);

        System.out.println(game1.equals(game2)); // expected: true
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}