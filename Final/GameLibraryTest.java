package Final;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class GameLibraryTest.
 *
 * @author  (Nicole Abadir)
 * @version (a version number or a date)
 */
public class GameLibraryTest
{
    /**
     * Default constructor for test class GameLibraryTest
     */
    public GameLibraryTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void testAddGame() {
        GameLibrary library = new GameLibrary();
        Game game = new Game(12345, "Minecraft", Genre.ACTION, AgeRating.KIDS, Platform.PC);

        library.addGame(game);

        System.out.println(library.getNumberOfGames());
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void testTopRatedGame() {
        GameLibrary library = new GameLibrary();

        Game game1 = new Game(34567, "FIFA", Genre.SPORTS, AgeRating.KIDS, Platform.PS5);
        Game game2 = new Game(12345, "Minecraft", Genre.ACTION, AgeRating.KIDS, Platform.PC);

        game1.setRating(6);
        game2.setRating(9);

        library.addGame(game1);
        library.addGame(game2);

        System.out.println(library.getTopRatedGame());
    }
}