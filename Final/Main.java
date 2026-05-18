package Final;
import java.util.Scanner;
import java.util.ArrayList;


/**
 * Write a description of class Main here.
 *
 * @author (Nicole Abadir)
 * @version (a version number or a date)
 */
public class Main
{
    private static Scanner input = new Scanner(System.in);
    private static GameLibrary gameLibrary = new GameLibrary();
    static ArrayList<Game> games = new ArrayList<>();

    public static void main(String[] args)
    {
        int choice = -1;
        printWelcomeMessage();

        while (choice != 0)
        {
            displayMenu();
            System.out.println("Enter your choice: ");
            choice = input.nextInt();


            switch (choice)
            {
                case 1:
                    showAllGames();
                    break;
                case 2:
                    showSinglePlayerGames();
                    break;
                case 3:
                    showOnlineGames();
                    break;
                case 4:
                    showMultiplayerGames();
                    break;
                case 5:
                    showGameDetails();
                    break;
                case 6:
                    showRatings();
                    break;
                case 7:
                    startGameSession();
                    break;
                case 8:
                    showLibraryStatistics();
                    break;
                case 9:
                    searchForGame();
                    break;
                case 10:
                    viewFavoriteGames();
                    break;

                case 11:
                    viewRecentlyPlayedGames();
                    break;

                case 12:
                    showGameCategories(games);
                    break;

                case 13:
                    viewUserProfile();
                    break;

                case 14:
                    viewSettings();
                    break;

                case 15:
                    viewHelpAndSupport();
                    break;

                case 16:
                    viewLeaderboard();
                    break;

                case 17:
                    viewAdminPanel();
                    break;

                case 18:
                    viewProjectInformation();
                    break;
                case 19:
                    addNewGame();
                    break;
                case 20:
                    showAllGames(games);
                    break;

                case 0:
                    System.out.println("Thank you for using the Game Library System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a number from 0 to 9.");
            }

            pause();
        }

        input.close();
    }

    public static void printWelcomeMessage()
    {
        System.out.println("=======================================");
        System.out.println("        WELCOME TO GAME LIBRARY        ");
        System.out.println("=======================================");
        System.out.println("This program organizes games by type,");
        System.out.println("ratings, details, and game sessions.");
        System.out.println();
    }

    public static void displayMenu()
    {
        System.out.println(" USER OPTIONS");
        System.out.println("------------------------------------------------------");
        System.out.println("1.  View all games");
        System.out.println("2.  View single player games");
        System.out.println("3.  View online games");
        System.out.println("4.  View multiplayer games");
        System.out.println("5.  View game details");
        System.out.println("6.  View ratings");
        System.out.println("7.  Start a game session");

        System.out.println();

        System.out.println(" LIBRARY FEATURES");
        System.out.println("------------------------------------------------------");
        System.out.println("8.  View library statistics");
        System.out.println("9.  Search for a game");
        System.out.println("10. View favorite games");
        System.out.println("11. View recently played games");
        System.out.println("12. View game categories");

        System.out.println();

        System.out.println(" SYSTEM SETTINGS");
        System.out.println("------------------------------------------------------");
        System.out.println("13. User profile");
        System.out.println("14. Settings");
        System.out.println("15. Help and support");
        System.out.println("16. Leaderboard");
        System.out.println("17. Admin panel");
        
        System.out.println(" PROJECT INFORMATION");
        System.out.println("------------------------------------------------------");
        System.out.println("18. About this project");

        System.out.println("19. Add a new game");
        System.out.println();
        
        System.out.println("20. Show all games");

        System.out.println();

        System.out.println("0. Exit");

        System.out.println("======================================================");
    }

    public static int getUserChoice()
    {
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
        input.nextLine();
        return choice;
    }
    
    public static void showGameCategories(ArrayList<Game> games) {
        System.out.println("\n--- Game Categories ---");

        for (Game game : games) {
        System.out.println(game.getTitle() + " - " + game.getCategory());
        }
    }
    
    public static void viewFavoriteGames()
    {
    System.out.println("Showing favorite games...");
    }

     public static void viewRecentlyPlayedGames()
    {
    System.out.println("Showing recently played games...");
    }

    public static void viewGameCategories()
    {
    System.out.println("Showing game categories...");
    }

    public static void viewUserProfile()
    {
    System.out.println("Showing user profile...");
    }

    public static void viewSettings()
    {
    System.out.println("Opening settings...");
    }

    public static void viewHelpAndSupport()
    {
    System.out.println("Help and support:");
    System.out.println("Choose an option from the menu by typing its number.");
    }

    public static void viewLeaderboard()
    {
    System.out.println("Showing leaderboard...");
    }

    public static void viewAdminPanel()
    {
    System.out.println("Opening admin panel...");
    }
    
    public static void searchForGame()
    {
    System.out.println("Searching for a game...");
    }

    public static void viewProjectInformation()
    {
      System.out.println("Project Information:");
      System.out.println("This program is a game library system.");
    }

    public static void showAllGames()
    {
        System.out.println("ALL GAMES");
        System.out.println("---------------------------------------");
        System.out.println("1. Minecraft - Sandbox / Adventure");
        System.out.println("2. Fortnite - Online / Battle Royale");
        System.out.println("3. The Sims - Simulation");
        System.out.println("4. Mario Kart - Racing / Multiplayer");
        System.out.println("5. Roblox - Online / Creative");
    }

    public static void showSinglePlayerGames()
    {
        System.out.println("SINGLE PLAYER GAMES");
        System.out.println("---------------------------------------");
        System.out.println("- The Sims");
        System.out.println("- Minecraft Survival Mode");
        System.out.println("- Zelda");
        System.out.println("These games can be played by one player.");
    }

    public static void showOnlineGames()
    {
        System.out.println("ONLINE GAMES");
        System.out.println("---------------------------------------");
        System.out.println("- Fortnite");
        System.out.println("- Roblox");
        System.out.println("- Valorant");
        System.out.println("These games require an internet connection.");
    }

    public static void showMultiplayerGames()
    {
        System.out.println("MULTIPLAYER GAMES");
        System.out.println("---------------------------------------");
        System.out.println("- Mario Kart");
        System.out.println("- Among Us");
        System.out.println("- Minecraft Multiplayer");
        System.out.println("- PUBG");
        System.out.println("- Call Of Duty");
        System.out.println("These games allow more than one player.");
    }
    
    public static void addNewGame() {
            System.out.println("ADD NEW GAME");
        System.out.println("---------------------------------------");

        input.nextLine(); // clear buffer

        System.out.print("Enter game title: ");
        String title = input.nextLine();

        System.out.println("Choose Genre:");
        for (Genre g : Genre.values()) {
            System.out.println("- " + g);
        }
        System.out.print("Enter genre: ");
        Genre genre = Genre.valueOf(input.nextLine().toUpperCase());

        System.out.println("Choose Age Rating:");
        for (AgeRating a : AgeRating.values()) {
            System.out.println("- " + a);
        }
        System.out.print("Enter age rating: ");
        AgeRating ageRating = AgeRating.valueOf(input.nextLine().toUpperCase());
    
            System.out.println("Choose Platform:");
        for (gamePlatForm p : gamePlatForm.values()) {
        System.out.println("- " + p);
        }
        System.out.print("Enter platform: ");
        gamePlatForm platform = gamePlatForm.valueOf(input.nextLine().toUpperCase());
    
        // Add the game to the library
        gameLibrary.addGames(title, genre, ageRating, platform);
        Game newGame = new Game(games.size() + 1, title, genre, ageRating, platform);
        games.add(newGame);

        System.out.println("Games in list: " + games.size());
    
        System.out.println("Game added successfully!");
    }

    public static void showGameDetails()
    {
        System.out.println("GAME DETAILS");
        System.out.println("---------------------------------------");
        System.out.println("Each game in this system can have:");
        System.out.println("- A title");
        System.out.println("- A genre");
        System.out.println("- A platform");
        System.out.println("- A price");
        System.out.println("- A rating");
        System.out.println("- A game type");
    }

    public static void showRatings()
    {
        System.out.println("GAME RATINGS");
        System.out.println("---------------------------------------");
        System.out.println("Minecraft: 5/5");
        System.out.println("Fortnite: 4/5");
        System.out.println("The Sims: 4/5");
        System.out.println("Mario Kart: 5/5");
        System.out.println("Roblox: 4/5");
    }

    public static void startGameSession()
    {
        System.out.println("START GAME SESSION");
        System.out.println("---------------------------------------");
        System.out.println("A new game session has started.");
        System.out.println("Player: Guest");
        System.out.println("Status: Playing");
        System.out.println("Session saved successfully.");
    }

    public static void showLibraryStatistics()
    {
        System.out.println("LIBRARY STATISTICS");
        System.out.println("---------------------------------------");
        System.out.println("Total games:" + games.size());
        System.out.println("Single player games: 3");
        System.out.println("Online games: 3");
        System.out.println("Multiplayer games: 3");
        System.out.println("Average rating: 4.4/5");
        System.out.println(gameLibrary.getNumberOfGames());
    }

    public static void showAllGames(ArrayList<Game> games) {
       System.out.println("---- All Games ----");
       for (Game game : games) {
        System.out.println(game.getTitle() + " - " + game.getGenre());
       }
    }

    public static void showAboutProject()
    {
        System.out.println("ABOUT THIS PROJECT");
        System.out.println("---------------------------------------");
        System.out.println("This project demonstrates inheritance,");
        System.out.println("methods, switch statements, and user input.");
        System.out.println("It represents a game library system with");
        System.out.println("different types of games and sessions.");
    }

    public static void pause()
    {
        System.out.println();
        System.out.println("Press Enter to continue...");
        input.nextLine();
    }
}

