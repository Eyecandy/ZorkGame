package io.muic.ooc.zork;

import java.util.HashMap;
import java.util.Scanner;


/**
 * Created by joakimnilfjord on 1/28/2017 AD.
 */
public class ZorkGame {
    GameMap gameMap;
    Level level1;
    Command command;
    CommandParser commandParser;
    ToolToObstacleLibrary toolToObstacleLibrary;

    public void startLevel1() {
        StringToItemLibrary stringToItemLibrary = new StringToItemLibrary();
        toolToObstacleLibrary = new ToolToObstacleLibrary(stringToItemLibrary);
        ItemFactory itemFactory = new ItemFactory(stringToItemLibrary);
        GameMapGenerator gameMapGenerator = new GameMapGenerator(itemFactory);
        level1 = new Level(gameMapGenerator);
        Player player = new Player("Jo",100,4,stringToItemLibrary);
        level1.setName("The tall tower");
        gameMap = level1.generateGameMap(1);
        player.setPosition(gameMap,0);
        player.setPlayerDirection("North");
        player.getPlayerDirection();
        command = new Command(player,gameMap);
        commandParser = new CommandParser(command);
        commandParser.startCommandParsing();

    }








}
