package io.muic.ooc.zork;

import java.util.ArrayList;

/**
 * Created by joakimnilfjord on 1/28/2017 AD.
 */
public class GameMapGenerator {
    GameMap gameMap;
    ItemFactory itemFactory;
    public GameMapGenerator(ItemFactory itemFactory) {
        this.itemFactory = itemFactory;
    }

    public GameMap createMapLevel1() {
        gameMap = new GameMap();
        Room room1 = new Room();
        room1.setName("Bottom Of Tower");
        room1.setStory4("There is a wall", "There is a Heavy Metal door it is locked with a chain",
                "There is Wall", "There is stairCase leading upwards in a spiral");
        Item xbow = itemFactory.createItem('w', "Xbow", 11);
        Item box = itemFactory.createItem('o',"WoodenBox",12);
        room1.addItemToRoom("West",box);

        room1.addItemToRoom("South",xbow);
        gameMap.addRoomToLevel(room1);
        return gameMap;
    }




}
