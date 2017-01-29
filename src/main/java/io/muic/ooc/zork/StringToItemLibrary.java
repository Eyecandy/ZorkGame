package io.muic.ooc.zork;

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
}
