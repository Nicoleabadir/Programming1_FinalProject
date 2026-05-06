package Final;

import java.util.HashMap;

/**
 * Décrivez votre classe GameLibrary ici.
 *
<<<<<<< HEAD
 * @author (Pamjot Singh Pannu)
=======
 * @author (Pamjot)
>>>>>>> 690d2de20da9de20ae7bccefb26e9c45765e8e34
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

    public void addGame(Game game) {
       if (game != null) {
        games.put(game.getId(), game);
       }
    } 
    public int getNumberOfGames() {
        return games.size();
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
      int index = 0;
        while (index < games.size()){
        if(games.get(index).getGenre() == genre){
                System.out.println(games.get(index));
            }
            index++;
    
        while (index < games.size()){
            if(games.get(index).getGenre() == genre){
                System.out.println(games.get(index));
            }
            index++;
        }   
      } 
    }
    public Game getTopRatedGame() {
         if (games.size() == 0) {
             return null;
         }

         Game topGame = null;

         for (Game game : games.values()) {
            if (topGame == null || game.getRating() > topGame.getRating()) {
                 topGame = game;
            }
         }

         return topGame;
     }
    public void listByPlatform(gamePlatForm gamePlatForm){
          for (Game key: games.values()){
            if(key.getgamePlatForm() == gamePlatForm){
                System.out.println(key.getId()+ "-----" +key.getTitle() +"____"+key.getgamePlatForm());
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
