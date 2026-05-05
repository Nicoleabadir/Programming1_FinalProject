package Final;

import java.util.HashMap;

/**
 * Décrivez votre classe GameLibrary ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class GameLibrary
{
    private HashMap<Integer, Game> games;
    private int nextId = 1;  
    
    
    public GameLibrary()
    {
        games = new HashMap<>();
        
    }
    public void addGame(String title, Genre genre, AgeRating ageRating, PlatForm platForm){
        Game g = new Game(nextId, title, genre, ageRating , platForm);
        nextId++;
    }
    public void printLibraryDetails(){
        System.out.println("======= Game Library Details =================");
        System.out.println("The library :games: has " + games.size() + "items");
        System.out.println("The next item will have "+nextId+ " :ID");
        System.out.println("==============================================");
    }
    
    public void listAllGames(){
        
        for(Integer id: games.keySet()){
            System.out.println(id +"-------"+ games.get(id));
        }
    }
    public void listByGenre(Genre genre){
        int index = 0;
        while (index < games.size()){
            if(games.get(index).getGenre() == genre){
                System.out.println(games.get(index));
            }
            index++;
        }
    }
    
}
