package io.muic.ooc.zork;

import java.util.HashMap;
import java.util.Scanner;


/**
 * Created by joakimnilfjord on 1/28/2017 AD.
 */
public class ZorkGame {
    GameMap gameMap;
    Level level1;
    Level level2;
    Level level3;
    Command command;
    CommandParser commandParser;
    ToolToObstacleLibrary toolToObstacleLibrary;


    public void startGame() {

        StringToItemLibrary stringToItemLibrary = new StringToItemLibrary();
        toolToObstacleLibrary = new ToolToObstacleLibrary(stringToItemLibrary);
        ItemFactory itemFactory = new ItemFactory(stringToItemLibrary);
        GameMapGenerator gameMapGenerator = new GameMapGenerator(itemFactory);

        level1 = new Level(gameMapGenerator);
        level1.setName("The tall tower: Level 1");
        level1.setStory("Objective: find your way out!");
        level1.getNameOfLevel();
        gameMap = level1.generateGameMap(1);

        Player player = new Player("Jo",100,14,stringToItemLibrary);
        player.setPosition(gameMap,0);
        player.setPlayerDirection("North");
        player.getPlayerDirection();

        command = new Command(player,gameMap);
        commandParser = new CommandParser(command);
        commandParser.startCommandParsing();

        level2 = new Level(gameMapGenerator);
        level2.setName("The tall tower: Level 2");
        level2.setStory("After hours of walking you find yourself at plateau, as you enter it a iron gate slams shut behind you");
        gameMap = level2.generateGameMap(2);
        level2.getNameOfLevel();
        player.setPosition(gameMap,0);
        command = new Command(player,gameMap);
        commandParser = new CommandParser(command);
        commandParser.startCommandParsing();

        level3 = new Level(gameMapGenerator);
        level3.setName("The top of the tower : Level 3");
        level3.setStory("You've reached the top of the tower");
        gameMap = level3.generateGameMap(3);
        level3.getNameOfLevel();
        player.setPosition(gameMap,0);
        command = new Command(player,gameMap);
        commandParser = new CommandParser(command);
        commandParser.startCommandParsing();





    }








}
