package io.muic.ooc.zork.world;

import java.util.ArrayList;

/**
 * Created by joakimnilfjord on 1/28/2017 AD.
 */
public class GameMap {
    private ArrayList<Room> mapOfLevel = new ArrayList<Room>();

    public void addRoomToLevel(Room room) {
        mapOfLevel.add(room);
    }


    public ArrayList<Room> getMap() {
        return mapOfLevel;
    }


}
