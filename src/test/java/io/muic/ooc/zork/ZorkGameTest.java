package io.muic.ooc.zork;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by joakimnilfjord on 1/30/2017 AD.
 */
public class ZorkGameTest extends TestCase {
    GameMap gameMap;
    Level level1;
    ToolToObstacleLibrary toolToObstacleLibrary;
    public void testStartLevel1() throws Exception {
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
        Assert.assertEquals(player.getPlayerDirection(),"North");
        Assert.assertEquals(player.addToInventory("bababh"),1);
        Assert.assertEquals(player.throwAnItem("Torch"),2);
        Assert.assertEquals(player.throwAnItem("babab"),1);
        player.setPlayerDirection("South");
        player.getPlayerDirection();
        Assert.assertEquals(player.open("Wooden_box"),0);
        Assert.assertEquals(player.addToInventory("Metal_thread"),0);
        Assert.assertEquals(player.getPlayerDirection(),"South");
        Assert.assertEquals(player.addToInventory("Wooden_box"),3);
        Assert.assertEquals(player.addToInventory("Torch"),2);
        Assert.assertEquals(player.addToInventory("bababh"),1);
        player.setPlayerDirection("East");
        Assert.assertEquals(player.addToInventory("Torch"),0);
        Assert.assertEquals(player.getPlayerDirection(),"East");
        player.setPlayerDirection("West");
        Assert.assertEquals(player.getPlayerDirection(),"West");
        Assert.assertEquals(player.throwAnItem("Torch"),0);
        Assert.assertEquals(player.addToInventory("Torch"),0);
        Assert.assertEquals(player.addToInventory("Torch"),2);
        player.enter(gameMap,"Stairs");
        player.setPlayerDirection("South");
        player.getPlayerDirection();
        player.setPlayerDirection("North");
        player.getPlayerDirection();
        player.setPlayerDirection("East");
        player.getPlayerDirection();
        player.enter(gameMap,"Stairs");
        player.setPlayerDirection("West");
        player.getPlayerDirection();
        player.getInventory();
        player.setPlayerDirection("South");
        player.setPlayerDirection("West");
        player.enter(gameMap,"Stairs");
        player.setPlayerDirection("North");
        Assert.assertEquals(player.useTool("Metal_thread", "Wooden_door"),0);
        Assert.assertEquals(player.enter(gameMap, "Wooden_door"),0);
        player.setPlayerDirection("South");
        player.getPlayerDirection();
        Assert.assertEquals(player.addToInventory("Red_key_stone"),0);
        player.setPlayerDirection("East");
        Assert.assertEquals(player.addToInventory("Lava_jar"),0);
        player.setPlayerDirection("South");
        player.enter(gameMap, "Wooden_door");
        player.setPlayerDirection("South");
        Assert.assertEquals(player.useTool("Lava_jar","Iron_box"),0);
        Assert.assertEquals(player.enter(gameMap,"Azure_door"),4);
        Assert.assertEquals(player.throwAnItem("Metal_thread"),0);
        Assert.assertEquals(player.open("Iron_box"),0);
        Assert.assertEquals(player.addToInventory("Azure_key"),0);
        Assert.assertEquals(player.useTool("Azure_key","Azure_door"),0);
        Assert.assertEquals(player.enter(gameMap,"Azure_door"),0);
        player.setPlayerDirection("North");
        Assert.assertEquals( player.useTool("Red_key_stone", "Ruby_lock_box"),0);
        Assert.assertEquals(player.open("Ruby_lock_box"),0);
        player.throwAnItem("Red_key_stone");
        Assert.assertEquals(player.addToInventory("Blue_key_stone"),0);
        player.setPlayerDirection("West");
        Assert.assertEquals(player.useTool("Blue_key_stone","Saphire_lock_box"),0);
        Assert.assertEquals(player.open("Saphire_lock_box"),0);
        player.throwAnItem("Blue_key_stone");
        Assert.assertEquals(player.addToInventory("Green_key_stone"),0);
        player.setPlayerDirection("South");
        Assert.assertEquals(player.useTool("Green_key_stone","Emerald_lock_box"),0);
        player.open("Emerald_lock_box");
        Assert.assertEquals(player.addToInventory("Rope"),0);
        player.throwAnItem("Green_key_stone");
        Assert.assertEquals( player.addToInventory("White_key_stone"),0);
        player.setPlayerDirection("East");
        player.getPlayerDirection();
        Assert.assertEquals(player.useTool("White_key_stone","Diamond_lock_box"),0);
        Assert.assertEquals(player.open("Diamond_lock_box"),0);
        Assert.assertEquals(player.addToInventory("Xbow"),0);
        player.setPlayerDirection("North");

        Assert.assertEquals(player.enter(gameMap,"Azure_door"),0);
        player.setPlayerDirection("West");
        player.getPlayerDirection();
        Assert.assertEquals(player.enter(gameMap,"Long_steps"),0);
        player.enter(gameMap,"Long_steps");
        player.setPlayerDirection("East");
        Assert.assertEquals(player.enter(gameMap,"Long_steps"),0);
        Assert.assertEquals(player.enter(gameMap,"Long_steps"),2);
        player.setPlayerDirection("West");
        Assert.assertEquals(player.enter(gameMap,"Long_steps"),0);
        player.setPlayerDirection("West");
        Assert.assertEquals(player.useTool("Rope","Broken_steps"),0);
        player.setPlayerDirection("East");
        Assert.assertEquals(player.useTool("Rope","Broken_steps"),6);




    }


}