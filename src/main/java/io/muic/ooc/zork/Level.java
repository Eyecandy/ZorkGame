package io.muic.ooc.zork;

/**
 * Created by joakimnilfjord on 1/28/2017 AD.
 */
public class Level {
    String nameOfLevel;
    GameMapGenerator gameMapGenerator;
    GameMap gameMap;
    public Level(GameMapGenerator gameMapGenerator) {
        this.gameMapGenerator = gameMapGenerator;
    }

    public void setName(String nameOfLevel) {
        this.nameOfLevel = nameOfLevel;
    }
    public String getNameOfLevel() {
        return nameOfLevel;
    }

    public GameMap generateGameMap(int level) {
        switch (level) {
            case 1:
                gameMap = gameMapGenerator.createMapLevel1();
                return gameMap;

            default:
                return null;
        }
    }


}
