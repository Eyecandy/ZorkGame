package io.muic.ooc.zork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by joakimnilfjord on 1/28/2017 AD.
 */
public class Room {
    private final String SOUTH="South";
    private final String NORTH="North";
    private final String EAST="East";
    private final String WEST="West";
    private String name;
    private Story roomStory;
    private HashMap<String,HashSet<Item>>  itemAtDir = new HashMap<String, HashSet<Item>>();
    public Room() {
        itemAtDir.put(SOUTH, new HashSet<Item>());
        itemAtDir.put(NORTH, new HashSet<Item>());
        itemAtDir.put(EAST, new HashSet<Item>());
        itemAtDir.put(WEST, new HashSet<Item>());
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void addItemToRoom(String dir, Item item) {

        HashSet<Item> itemHashSet;
        if (itemAtDir.get(dir).isEmpty()) {
            itemHashSet = new HashSet<Item>();
            itemHashSet.add(item);
            itemAtDir.put(dir,itemHashSet);
        }
        else {
            itemHashSet = itemAtDir.get(dir);
            itemHashSet.add(item);
            itemAtDir.put(dir,itemHashSet);}
    }
    public void removeItem(String dir,Item item) {
        if (itemAtDir.containsKey(dir)) {
            HashSet<Item>  items = itemAtDir.get(dir);
            if (items.contains(item)) {
                items.remove(item);
                itemAtDir.put(dir,items);
            }
        }
    }

    public void setStory(String southStory, String northStory, String eastStory, String westStory) {
        roomStory = new Story();
        roomStory.setDirToStory(SOUTH,southStory);
        roomStory.setDirToStory(NORTH,northStory);
        roomStory.setDirToStory(EAST,eastStory);
        roomStory.setDirToStory(WEST,westStory);
    }


    public String getStory(String dir) {
        return roomStory.getDirAndStory(dir);
    }

    public HashSet<Item> getItemsAtDir(String dir) {
        return itemAtDir.get(dir);
    }
















}
