package io.muic.ooc.zork.libraries;

import io.muic.ooc.zork.items.Item;

import java.util.HashMap;

/**
 * Created by joakimnilfjord on 1/29/2017 AD.
 */
public class StringToItemLibrary {


    private HashMap<String,Item>  stringToItem = new HashMap<String, Item>();

    public void setStringToItem(String itemName,Item item) {
        stringToItem.put(itemName,item);
    }

    public Item getItem(String itemName) {
        return stringToItem.get(itemName);
    }
    public Boolean containsItem(String itemName) {
        return stringToItem.containsKey(itemName);
    }
    public int getSize() {
        return stringToItem.size();
    }
    public String getStringToItemLibraryAsString() {
        return stringToItem.toString();
    }
}
