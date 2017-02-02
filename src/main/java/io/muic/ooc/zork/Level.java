package io.muic.ooc.zork;

/**
 * Created by joakimnilfjord on 1/28/2017 AD.
 */
public class Level {
    String nameOfLevel;
    GameMapGenerator gameMapGenerator;
    GameMap gameMap;
    String storyOfLevel;
    public Level(GameMapGenerator gameMapGenerator) {
        this.gameMapGenerator = gameMapGenerator;
    }

    public void setName(String nameOfLevel) {
        this.nameOfLevel = nameOfLevel;
    }
    public void getNameOfLevel() {
        System.out.println(nameOfLevel);
        System.out.println(storyOfLevel);
    }
    public void setStory(String storyOfLevel) {
        this.storyOfLevel = storyOfLevel;
    }

    public GameMap generateGameMap(int level) {
        switch (level) {
            case 1:
                gameMap = gameMapGenerator.createMapLevel1();
                return gameMap;

            case 2:
                gameMap = gameMapGenerator.createMapLevel2();
                return gameMap;
            case 3:

                gameMap = gameMapGenerator.createMapLevel3();
                return gameMap;

            default:


                return null;
        }
    }


}
