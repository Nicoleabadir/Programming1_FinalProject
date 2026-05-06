# Programming1_FinalProject
Pamjot is responsible for implementing the RatingLibrary, GameLibrary, GameSession, and all enumeration types.
These components are association‑based classes that interact directly with the Game superclass. Their purpose is to store, manage, and organize game‑related data, including ratings, sessions, and collections of games. The enums (Genre, Platform, AgeRating) will be used throughout the system to standardize and constrain valid values for game attributes.

Nicole is responsible for implementing the remaining classes, including the Game superclass and all subclasses (SinglePlayerGame, OnlineGame, MultiplayerGame).
The Game class defines the core fields and behaviors shared across all game types, such as title, genre, platform, and age rating. The subclasses extend Game and introduce specialized attributes and behaviors based on the type of game.

===================================================================================================
Game class

The game class is the super class wher everthing that would be needed by other classes are stored.
we made them all privat so that other classes can't mess with them it set to privat 
it called somthing like encapuslation.

id          → unique number for each game
title       → name of the game
genre       → type of game (ACTION, RPG, SPORTS…)
platform    → where the game runs (PC, PS5…)
ageRating   → who can play it (KIDS, TEEN, ADULT)
rating      → user rating (0–10)
-----------------------------------------------------------------------------------
To make sure ever Object of game start with complete information we made this contructor
  Game(id, title, genre, ageRating, platform)
      set all fields
      rating = 0
-----------------------------------------------------------------------------------
public Game(int id, String title, Genre genre, AgeRating ageRating, PlatForm platform)
    {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.platform = platform;
        this.ageRating = ageRating;
        this.rating = 0; 
        
    } 
    This is the actual code
---------------------------------------------------------------------------------------
To allow other classes to read information safely I made getter methods 
getTitle() → returns the title
getGenre() → returns the genre
getPlatform() → returns the platform
getAgeRating() → returns the age rating
getRating() → returns the rating
rateGame(value) → updates the rating
toString() → returns a formatted string with all details
toString() is set to 
    public String toString(){
            return ("ID: " +id+ ", Title: " +title+ ", Genre: " +genre+ ", Plat Form: " +platform+ ", Age Rating: " +ageRating+ ", Rating:   "   +rating);
      }
This way all the details would be printed well. I think if it was not thanks to this method it would print somthing else.
-----------------------------------------------------------------------------------------------
=======================================================================================================================
GameLibrary class

Game library class is the "database" all the game will be created and stored here.

the filed for this class are 
games            →  HashMap storing all the Game objects <Interger Game> Every game will have a id and the norme filed form the game class
NextId           → automatically assigns unique IDs because HashMap does not work with index so this would be responsible for making sure unique Ids for every game.
Key: 1
Value: Game object
       ├── id = 1
       ├── title = "Minecraft"
       ├── genre = ADVENTURE
       ├── platform = PC
       ├── ageRating = KIDS
       └── rating = 0

-------------------------------------------------------------------------------------------------
There are all the required methodes in here for the games.


addGame(title, genre, ageRating, platform)
    create new Game with nextId
    store it in the HashMap
    nextId++

list()
    print ID + title for all games

listByGenre(genre)
    loop through all games
    print games whose genre matches

listByPlatform(platform)
    loop through all games
    print games whose platform matches

listByRating(rating)
    loop through all games
    print games whose rating matches

search(text)
    loop through all games
    print games whose title starts with or contains text

printLibraryDetails()
    print number of games and next ID
This are the method that where required in the lia document 
------------------------------------------------------------------------------------------------------
===========================================================================================================
Game Session is where all the games sesstion are recorded and saved.
--------------------------------------------
field
game      → the game being played
duration  → how long the session lasted
---------------------------------------------
Methodes 
startSession()
    start timer or record session start

toString()
    return readable session summary
------------------------------------------------
==========================================================================================================
Rating library 
It sotre detail, comments and rating for every game.
the files would have a hashMap <    Strings>
--------------------------------------------------
methodes would be 
rateGame()       → add a rating
addComments()    → attach comments to a game
printWritings()  → show all comments
-----------------------------------------------------
=========================================================================================================
The game class use sum enume for som field
there are three of them 
PlatForm: diff Platform
Genre:    Diff Genre
AgeRating: Diff age Ratings

===========================================================================================================
SinglePlayerGame class extends Game 
It is a game but with extra fieatures 
---------------------------------------
Filed
storyMode : boolean
Does it have a story mode ?
--------------------------------------
SinglePlayerGame(id, title, genre, platform, ageRating, storyMode)
    super(...) → calls Game constructor
    this.storyMode = storyMode
To initialize both the Game part and the SinglePlayerGame‑specific part.
-----------------------------------------
Methods 
startSolo()
    prints a message saying the single-player game is starting

toString()
    returns Game’s toString() + storyMode info

----------------------------------------------
======================================================
OnlineGame extends Game

requiresInternet : boolean

they use internet so true always
------------------------------------
contructore 
OnlineGame(id, title, genre, platform, ageRating)
    super(...)
    requiresInternet = true
-------------------------------------
methodes 
startOnline()
    prints a message saying the online game is starting

toString()
    returns Game’s toString() + requiresInternet info
-----------------------------------------
===========================================================

MultiplayerGame extends Game
filed
maxPlayers : int
players : ArrayList<String>
maximum allowed players?
list of player names currently in the game

---------------------------------------------
constructore
MultiplayerGame(id, title, genre, platform, ageRating, maxPlayers)
    super(...)
    this.maxPlayers = maxPlayers
    players = new ArrayList<>()
-----------------------------------------------
methodes 
addPlayer(playerName)
    if players.size < maxPlayers → add player
    else → print “Maximum number of players reached.”

listAllPlayers()
    loops through players and prints each one

startMultiplayer()
    prints a message saying the multiplayer game is starting

toString()
    returns Game’s toString() + maxPlayers + current number of players


addPlayer() enforces multiplayer rules

listAllPlayers() shows who is currently in the game

startMultiplayer() represents multiplayer behavior

toString() prints extended details
-------------------------------------------------






