package Final;

import java.util.HashMap;

/**
 * Décrivez votre classe GameLibrary ici.
 *
 * @author (Pamjot)
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
    public void addGame(String title, Genre genre, AgeRating ageRating, PlatForm platform){
        Game g = new Game(nextId, title, genre, ageRating , platform);
        nextId++;
    }
    public void printLibraryDetails(){
        System.out.println("======= Game Library Details =================");
        System.out.println("The library :games: has " + games.size() + "items");
        System.out.println("The next item will have "+nextId+ " :ID");
        System.out.println("==============================================");
    }
    public void searchByTitle(String name){
        name = name.toLowerCase();
        //if (g.getTitle().toLowerCase().contains(text))
        for(Game g : games.values()){    
            if(g.getTitle().toLowerCase().startsWith(name)){
                System.out.println(g.getId() +" ---------- "+g.getTitle());
            }
        }
    }
    public void printGamesDetails(String name){
        name = name.toLowerCase();
        for(Game g : games.values()){    
            if(g.getTitle().toLowerCase().startsWith(name)){
                System.out.println(g.toString());
            }
        }
    }
    public void listAllGames(){
        
        for(Integer id: games.keySet()){
            System.out.println(id +"-------"+ games.get(id).getTitle());
        }
    }
    public void listByGenre(Genre genre){
        /**int index = 0;
        while (index < games.size()){
            if(games.get(index).getGenre() == genre){
                System.out.println(games.get(index));
            }
            index++;
        **/
        int index = 0;
        while (index < games.size()){
            if(games.get(index).getGenre() == genre){
                System.out.println(games.get(index));
            }
            index++;
        }   
        }
    public void listByPlatform(PlatForm platForm){
        for (Game key: games.values()){
            if(key.getPlatform() == platForm){
                System.out.println(key.getId()+ "-----" +key.getTitle() +"____"+key.getPlatform());
            }
        }
    }
    public void listByAgeRating(AgeRating ageRating){
        for (Game key: games.values()){
            if(key.getAgeRating() == ageRating){
                System.out.println(key.getId()+ "-----" +key.getTitle() +"____"+key.getAgeRating());
            }
        }
    }
    public void listByRating(double rating){
        for (Game key: games.values()){
            if(key.getRating() == rating){
                System.out.println(key.getId()+ "-----" +key.getTitle() +"____"+key.getRating());
            }
        }
    }
}
