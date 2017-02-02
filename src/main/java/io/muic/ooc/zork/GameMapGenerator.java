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
        Room room4 = roomGenerator.createRoom4();
        Room room5 = roomGenerator.createRoom5();
        Room lvlTransport= new Room(); lvlTransport.setName("Level2");
        gameMap.addRoomToLevel(room1);
        gameMap.addRoomToLevel(room2);
        gameMap.addRoomToLevel(room3);
        gameMap.addRoomToLevel(room4);
        gameMap.addRoomToLevel(room5);
        gameMap.addRoomToLevel(lvlTransport);
        return gameMap;
    }

    public GameMap createMapLevel2() {
        gameMap = new GameMap();
        Room room6 = roomGenerator.createRoom6();
        Room room7 = roomGenerator.createRoom7();
        Room lvlTransport = new Room(); lvlTransport.setName("Level3");
        gameMap.addRoomToLevel(room6);
        gameMap.addRoomToLevel(room7);
        gameMap.addRoomToLevel(lvlTransport);
        return gameMap;
    }

    public GameMap createMapLevel3() {
        gameMap = new GameMap();
        Room room8 = roomGenerator.createRoom8();
        Room room9 = roomGenerator.createRoom9();
        Room completeGame  = new Room(); completeGame.setName("Done");
        gameMap.addRoomToLevel(room8);
        gameMap.addRoomToLevel(room9);
        gameMap.addRoomToLevel(completeGame);

        return gameMap;
    }




}
