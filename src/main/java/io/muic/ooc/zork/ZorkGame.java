package io.muic.ooc.zork;

import java.util.HashMap;

/**
 * Created by joakimnilfjord on 1/28/2017 AD.
 */
public class ZorkGame {
    //private HashMap<String,Item> stringToItem = new HashMap<String, Item>();
    GameMap gameMap;
    Level level1;






    public void startLevel1() {
        StringToItemLibrary stringToItemLibrary = new StringToItemLibrary();
        ItemFactory itemFactory = new ItemFactory(stringToItemLibrary);
        GameMapGenerator gameMapGenerator = new GameMapGenerator(itemFactory);
        level1 = new Level(gameMapGenerator);
        Player player = new Player("Jo",100,4,stringToItemLibrary);
        level1.setName("The tall tower");
        gameMap = level1.generateGameMap(1);
        player.setPosition(gameMap,0);
        player.setPlayerDirection("North");
        player.getPlayerDirection();
        player.setPlayerDirection("South");
        player.getPlayerDirection();
        player.addToInventory("Xbow");
        player.setPlayerDirection("East");
        player.getPlayerDirection();
        player.getInventory();
        player.setPlayerDirection("West");
        player.getPlayerDirection();
        player.addToInventory("WoodenBox");
        player.throwAnItem("Xbow");
        player.getPlayerDirection();






    }








}
