package io.muic.ooc.zork;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by joakimnilfjord on 1/28/2017 AD.
 */
public class Player {
    private int health;
    private ArrayList<Item> inventory = new ArrayList<Item>();
    private int inventorySize;
    private String name;
    private Room room;
    private String playerDirection;
    StringToItemLibrary stringToItemLibrary;





    public Player(String name,int health,int inventorySize, StringToItemLibrary stringToItemLibrary) {
        this.name = name;
        this.health = health;
        this.inventorySize = inventorySize;
        this.stringToItemLibrary = stringToItemLibrary;
    }
    public void getName() {
        System.out.println(name);
    }

    public void getInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Your inventory is empty");
        }
        else {
            for (int i=0;i < inventory.size();i++) {{
                System.out.println(0 +": " +inventory.get(i).getName());}
            }
        }
    }

    public void addToInventory(String nameOfItem) {
        Item item = stringToItemLibrary.getItem(nameOfItem);
        HashSet<Item> itemsAtDir = room.getItemsAtDir(playerDirection);
        if (itemsAtDir.contains(itemsAtDir) ) {
            System.out.println("I don't recognize that item :" + item.getName());
            return;
        }
        else if  (!item.isEquipable()) {
            System.out.println("You can't loot that item: " + item.getName());
        }

        else if (inventory.size() >= inventorySize) {
            System.out.println("Your inventory is full, throw an item out to clear space");

        }
        else {
            inventory.add(item);
            room.removeItem(playerDirection,item);
            System.out.println(item.getName() +" added to inventory");
        }
    }

    public void throwAnItem(String itemName) {
        if (!stringToItemLibrary.containsItem(itemName)) {
            System.out.println("You do not own item with that name" + itemName);
            return;
        }
        Item item = stringToItemLibrary.getItem(itemName);

        if (inventory.contains(item)) {
            inventory.remove(item);
            room.addItemToRoom(playerDirection,item);
            System.out.println(("You removed " + item.getName() + " from your inventory"));
        }
        else {
            System.out.println(("You have no such item in your inventory"));
        }
    }
    public void setPosition(GameMap gameMap,int roomNo) {
        room = gameMap.getMap().get(roomNo);
    }
    public void setPlayerDirection(String playerDirection) {
        this.playerDirection = playerDirection;
    }

    public void getPlayerDirection() {
        System.out.println(room.getName()+ ": ");
        System.out.println(room.getStory(playerDirection));
        getItemAtDirection();
    }

    private void getItemAtDirection() {
        HashSet<Item> itemsAtDir = room.getItemsAtDir(playerDirection);
        if (itemsAtDir != null && !itemsAtDir.isEmpty()) {
            for (Item item: itemsAtDir) {
                System.out.println(item.getName());
            }
        }
    }
















}
