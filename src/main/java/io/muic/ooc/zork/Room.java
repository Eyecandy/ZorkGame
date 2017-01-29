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
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void addItemToRoom(String dir, Item item) {
        HashSet<Item> itemArrayList;
        if (itemAtDir.get(dir) == null) {
            itemArrayList = new HashSet<Item>();
            itemArrayList.add(item);
            itemAtDir.put(dir,itemArrayList);
        }
        else {
            itemArrayList = itemAtDir.get(dir);
            itemArrayList.add(item);
            itemAtDir.put(dir,itemArrayList);}
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

    public void setStory4(String southStory,String northStory, String eastStory,String westStory) {
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

    public HashSet<Item> getItemAtdir(String dir) {
        return itemAtDir.get(dir);
    }













}
