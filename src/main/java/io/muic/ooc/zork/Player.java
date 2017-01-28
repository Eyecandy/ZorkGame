package io.muic.ooc.zork;

import java.util.ArrayList;

/**
 * Created by joakimnilfjord on 1/28/2017 AD.
 */
public class Player {
    private int health;
    private ArrayList<Item> inventory;
    private int inventorySize;
    private String name;
    private int position;

    public Player(String name,int health,int inventorySize, int position) {
        this.name = name;
        this.health = health;
        this.inventorySize = inventorySize;
        Room pos;
        this.position = position;

    }
    public void getName() {
        System.out.println(name);
    }

    public void getInventory() {
        if (inventory.size() == 0) {
            System.out.println("Your inventory is empty");
        }
        else {
            for (int i=0;i < inventory.size();i++) {{
                System.out.println(0 +": " +inventory.get(i).getName());}
            }
        }
    }
    public void checkEquipable(Item item) {

    }
    public void addToInventory(Item item) {
        if (inventory.size() <= inventorySize) {
            inventory.add(item);
            System.out.println(item.getName() +" added to inventory");
        }
        else {
            System.out.println("Your inventory is full, throw an item out to clear space");
        }
    }

    public void throwAnItem(Item item) {
        if (inventory.contains(item)) {
            inventory.remove(item);
            System.out.println(("You removed " + item.getName() + " from your inventory"));
        }
        else {
            System.out.println(("You have no such item in your inventory"));
        }
    }

    public void moveSouth() {


    }



}
