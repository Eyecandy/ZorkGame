package io.muic.ooc.zork;

import java.util.ArrayList;

/**
 * Created by joakimnilfjord on 1/28/2017 AD.
 */
public class GameMapGenerator {
    ArrayList<Room> rooms = new ArrayList<Room>();
    public ArrayList<Room> createMap() {
        Room room = new Room("Basement");
        Room room1 = new Room("Ceeling");
        rooms.add(room);
        rooms.add(room1);
        return rooms;


    }



}
