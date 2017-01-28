package io.muic.ooc.zork;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by joakimnilfjord on 1/28/2017 AD.
 */
public class Room {
    private final int SOUTH=1;
    private final int NORTH=2;
    private final int EAST=3;
    private final int WEST=4;
    private int DOWN = 5;
    private int UP=6;
    Player player;

    HashMap<Integer,ArrayList<Item>>  itemAtDir;
    private String name;
    public Room(String name) {
        this.name = name;
        itemAtDir = new HashMap<Integer, ArrayList<Item>>();
    }

    public void addItemToRoom(int dir, Item item) {
        ArrayList<Item> itemArrayList;
        if (itemAtDir.get(dir) == null) {
            itemArrayList = new ArrayList<Item>();
            itemArrayList.add(item);
            itemAtDir.put(dir,itemArrayList);

        }
        else {
            itemArrayList = itemAtDir.get(dir);
            itemArrayList.add(item);
            itemAtDir.put(dir,itemArrayList);}
    }

    public void addPlayer(Player player) {
        this.player = player;

    }








}
