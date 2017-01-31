package io.muic.ooc.zork;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by joakimnilfjord on 1/30/2017 AD.
 */
public class ZorkGameTest extends TestCase {
    GameMap gameMap;
    Level level1;
    public void testStartLevel1() throws Exception {
        StringToItemLibrary stringToItemLibrary = new StringToItemLibrary();
        ItemFactory itemFactory = new ItemFactory(stringToItemLibrary);
        GameMapGenerator gameMapGenerator = new GameMapGenerator(itemFactory);
        level1 = new Level(gameMapGenerator);
        Player player = new Player("Jo",100,4,stringToItemLibrary);
        level1.setName("The tall tower");
        gameMap = level1.generateGameMap(1);
        player.setPosition(gameMap,0);

        player.setPlayerDirection("North");


        Assert.assertEquals(player.getPlayerDirection(),"North");
        Assert.assertEquals(player.addToInventory("bababh"),1);
        Assert.assertEquals(player.throwAnItem("Torch"),2);
        Assert.assertEquals(player.throwAnItem("babab"),1);
        player.setPlayerDirection("South");
        Assert.assertEquals(player.getPlayerDirection(),"South");
        Assert.assertEquals(player.addToInventory("WoodenBox"),3);
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







    }


}