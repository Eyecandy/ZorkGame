package io.muic.ooc.zork;

/**
 * Created by joakimnilfjord on 1/28/2017 AD.
 */
public class GameMapGenerator {
    GameMap gameMap;
    ItemFactory itemFactory;
    RoomGenerator roomGenerator;
    public GameMapGenerator(ItemFactory itemFactory) {
        this.itemFactory = itemFactory;
    }

    public GameMap createMapLevel1() {
        gameMap = new GameMap();
        roomGenerator = new RoomGenerator(itemFactory);
        Room room1 = roomGenerator.createRoom1();
        Room room2 = roomGenerator.createRoom2();
        Room room3 = roomGenerator.createRoom3();
        gameMap.addRoomToLevel(room1);
        gameMap.addRoomToLevel(room2);
        gameMap.addRoomToLevel(room3);
        return gameMap;
    }




}
