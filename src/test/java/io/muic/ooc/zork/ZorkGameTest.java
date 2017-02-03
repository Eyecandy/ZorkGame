package io.muic.ooc.zork;

import io.muic.ooc.zork.libraries.StringToItemLibrary;
import io.muic.ooc.zork.libraries.ToolToObstacleLibrary;
import io.muic.ooc.zork.living.things.Player;
import io.muic.ooc.zork.mass.producers.GameMapGenerator;
import io.muic.ooc.zork.mass.producers.ItemFactory;
import io.muic.ooc.zork.world.GameMap;
import io.muic.ooc.zork.world.Level;
import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by joakimnilfjord on 1/30/2017 AD.
 */
public class ZorkGameTest extends TestCase {
    GameMap gameMap;
    Level level1;
    Level level2;
    Level level3;
    ToolToObstacleLibrary toolToObstacleLibrary;
    public void testStartLevel1() throws Exception {

        //Asserted the whole Game from start to finnish
        
        StringToItemLibrary stringToItemLibrary = new StringToItemLibrary();
        toolToObstacleLibrary = new ToolToObstacleLibrary(stringToItemLibrary);
        ItemFactory itemFactory = new ItemFactory(stringToItemLibrary);
        GameMapGenerator gameMapGenerator = new GameMapGenerator(itemFactory);
        level1 = new Level(gameMapGenerator);
        Player player = new Player("Jo",100,30,stringToItemLibrary);
        level1.setName("The tall tower");
        gameMap = level1.generateGameMap(1);

        player.setPosition(gameMap,0);
        //Assert Direction
        player.setPlayerDirection("South");
        Assert.assertEquals(player.getPlayerDirection(),"South");
        player.setPlayerDirection("East");
        Assert.assertEquals(player.getPlayerDirection(),"East");
        player.setPlayerDirection("West");
        Assert.assertEquals(player.getPlayerDirection(),"West");
        player.setPlayerDirection("North");
        Assert.assertEquals(player.getPlayerDirection(),"North");

        //Assert inventory
        Assert.assertEquals(player.addToInventory("bababh"),1);
        Assert.assertEquals(player.throwAnItem("Torch"),2);
        Assert.assertEquals(player.throwAnItem("babab"),1);
        player.setPlayerDirection("South");
        player.getPlayerDirection();
        //Assert usingTool
        Assert.assertEquals(player.open("Wooden_box"),0);
        //Assert inventory
        Assert.assertEquals(player.addToInventory("Metal_thread"),0);
        Assert.assertEquals(player.getPlayerDirection(),"South");
        Assert.assertEquals(player.addToInventory("Wooden_box"),3);
        Assert.assertEquals(player.addToInventory("Torch"),2);
        Assert.assertEquals(player.addToInventory("bababh"),1);
        player.setPlayerDirection("East");
        //Assert inventory
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
        //Assert Enter new Room
        Assert.assertEquals(player.enter(gameMap,"Stairs"),0);
        player.setPlayerDirection("West");
        player.getPlayerDirection();
        player.getInventory();
        player.setPlayerDirection("South");
        Assert.assertEquals(player.enter(gameMap,"Stairs"),2);
        player.setPlayerDirection("West");
        Assert.assertEquals(player.enter(gameMap,"Stairs"),0);
        player.setPlayerDirection("North");
        //Assert useTool
        Assert.assertEquals(player.useTool("Metal_thread", "Wooden_door"),0);
        Assert.assertEquals(player.enter(gameMap, "Wooden_door"),0);
        player.setPlayerDirection("South");
        player.getPlayerDirection();
        //Assert inventory;
        Assert.assertEquals(player.addToInventory("red_key_stone"),1);
        Assert.assertEquals(player.addToInventory("Red_key_stone"),0);
        player.setPlayerDirection("East");
        Assert.assertEquals(player.addToInventory("Lava_jar"),0);
        player.setPlayerDirection("South");
        player.enter(gameMap, "Wooden_door");
        player.setPlayerDirection("South");
        //assert tool and throw and take item
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
        player.setPlayerDirection("West");
        player.enter(gameMap,"Broken_steps");

        level2 = new Level(gameMapGenerator);
        level2.setName("The tall tower: Level 2");
        gameMap = level2.generateGameMap(2);
        player.setPosition(gameMap,0);
        player.getPlayerDirection();
        player.getInventory();
        Assert.assertEquals(player.throwAnItem("Torch"),0);
        player.setPlayerDirection("South");
        player.getPlayerDirection();
        player.addToInventory("Hammer");
        player.getInventory();
        player.setPlayerDirection("East");
        player.getPlayerDirection();
        player.useTool("Hammer","Treasure_chest");
        player.open("Treasure_chest");
        player.useTool("Hammer","Marble_lock_box");
        player.open("Marble_lock_box");
        player.addToInventory("Great_sword");
        player.setPlayerDirection("North");
        player.getPlayerDirection();
        Assert.assertEquals(player.throwAnItem("Torch"),2);
        player.enter(gameMap,"Dark_hall_way");
        player.setPlayerDirection("East");
        player.getPlayerDirection();
        //This testing will only work if randomized location is turned off on monster. I commented the code out in player
        //assert monster fight
        player.attack("Great_sword","wicked_spirit"); player.attack("Great_sword","wicked_spirit");
        player.attack("Great_sword","wicked_spirit");player.attack("Great_sword","wicked_spirit");
        player.attack("Great_sword","wicked_spirit"); player.attack("Great_sword","wicked_spirit");
        player.attack("Great_sword","wicked_spirit");player.attack("Great_sword","wicked_spirit");
        player.attack("Great_sword","wicked_spirit"); player.attack("Great_sword","wicked_spirit");
        player.attack("Great_sword","wicked_spirit"); player.attack("Great_sword","wicked_spirit");
        player.attack("Great_sword","wicked_spirit"); player.attack("Great_sword","wicked_spirit");
        player.attack("Great_sword","wicked_spirit"); player.attack("Great_sword","wicked_spirit");
        Assert.assertEquals(player.enter(gameMap,"Purple_wall"),1);
        player.getPlayerDirection();
        //assert that monster drops items
        player.addToInventory("Magical_climbing_gloves");
        player.addToInventory("Spear");
        player.setPlayerDirection("West");
        player.useTool("Magical_climbing_gloves","The_great_wall");
        player.enter(gameMap,"The_great_wall");

        level3 = new Level(gameMapGenerator);
        level3.setName("The top of the tower : Level 3");
        level3.setStory("You've reached the top of the tower");
        gameMap = level3.generateGameMap(3);
        level3.getNameOfLevel();
        //Level 3 assert the same stuff as the level 1 and 2
        player.setPosition(gameMap,0);
        player.getPlayerDirection();
        player.setPlayerDirection("South");
        Assert.assertEquals(player.enter(gameMap,"Purple_wall"),4);
        Assert.assertEquals(player.addToInventory("Boom_stick"),2);
        player.getPlayerDirection();
        player.setPlayerDirection("North");
        Assert.assertEquals(player.enter(gameMap,"Pufal"),1);
        player.getPlayerDirection();
        Assert.assertEquals(player.enter(gameMap,"Purple_wall"),2);
        player.setPlayerDirection("West");
        player.getPlayerDirection();
        Assert.assertEquals(player.addToInventory("Boom_stick"),0);
        player.setPlayerDirection("East");
        player.setPlayerDirection("North");
        player.enter(gameMap,"Open_gate");
        Assert.assertEquals(player.throwAnItem("Torch"),2);
        player.setPlayerDirection("South");   player.attack("Boom_stick","Clown");
        player.attack("Boom_stick","Clown");   player.attack("Boom_stick","Clown");
        player.attack("Boom_stick","Clown");
        player.attack("Boom_stick","Clown");
        player.attack("Boom_stick","Clown");
        player.attack("Boom_stick","Clown");
        player.attack("Boom_stick","Clown");
        player.attack("Boom_stick","Clown");
        player.attack("Boom_stick","Clown");
        player.attack("Boom_stick","Clown");
        player.attack("Boom_stick","Clown");
        player.attack("Boom_stick","Clown");
        player.attack("Boom_stick","Clown");
        player.attack("Boom_stick","Clown");
        player.attack("Boom_stick","Clown");
        player.attack("Boom_stick","Clown");
        player.attack("Boom_stick","Clown");
        player.attack("Boom_stick","Clown");
        player.attack("Boom_stick","Clown");
        player.attack("Boom_stick","Clown");
        player.attack("Boom_stick","Clown");
        player.attack("Boom_stick","Clown");
        player.attack("Boom_stick","Clown");
        Assert.assertEquals(player.enter(gameMap,"Portal_key"),3);
        Assert.assertEquals(player.enter(gameMap,"Portal"),2);
        player.addToInventory("Portal_key");
        player.setPlayerDirection("West");
        Assert.assertEquals(player.enter(gameMap,"Portal"),4);
        player.useTool("Portal_key","Portal");
        player.getPlayerDirection();
        Assert.assertEquals(player.enter(gameMap,"Portal"),0);



    }


}