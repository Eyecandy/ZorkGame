package io.muic.ooc.zork;

import java.util.ArrayList;

/**
 * Created by joakimnilfjord on 1/28/2017 AD.
 */
public class GameMap {
   private  ArrayList<Room> mapOfLevel = new ArrayList<Room>();

    public void addRoomToLevel(Room room) {
        mapOfLevel.add(room);
    }
    public String getRoomName(int pos) {
        return mapOfLevel.get(pos).getName();
    }
    public ArrayList<Room> getMap() {
        return mapOfLevel;
    }




}
