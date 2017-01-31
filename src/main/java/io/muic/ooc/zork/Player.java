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
    private int currRoomNO;
    private String playerDirection;
    private StringToItemLibrary stringToItemLibrary;
    private HashSet<String> validDirections = new HashSet<String>();

    public Player(String name,int health,int inventorySize, StringToItemLibrary stringToItemLibrary) {
        this.name = name;
        this.health = health;
        this.inventorySize = inventorySize;
        this.stringToItemLibrary = stringToItemLibrary;
        validDirections.add("South");validDirections.add("West");
        validDirections.add("North");validDirections.add("East");
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

    public int addToInventory(String nameOfItem) {

        if (!stringToItemLibrary.containsItem(nameOfItem)) {
            System.out.println("There is no such item here :" + nameOfItem);
            return 1;
        }
        Item item = stringToItemLibrary.getItem(nameOfItem);

        HashSet<Item> itemsAtDir = room.getItemsAtDir(playerDirection);


        if (!itemsAtDir.contains(item) ) {
            System.out.println("I don't recognize that item :" + nameOfItem);

            return 2;
        }
        else if  (!item.isEquipable()) {
            System.out.println("You can't loot that item: " + item.getName());

            return 3;
        }

        else if (inventory.size() >= inventorySize) {
            System.out.println("Your inventory is full, throw an item out to clear space");
            return 4;

        }
        else {
            inventory.add(item);
            room.removeItem(playerDirection,item);
            System.out.println(item.getName() +" added to inventory");
            return 0;
        }
    }

    public int throwAnItem(String itemName) {
        if (!stringToItemLibrary.containsItem(itemName)) {
            System.out.println("You do not own an item with that name" + itemName);
            return 1;
        }
        Item item = stringToItemLibrary.getItem(itemName);

        if (inventory.contains(item)) {
            inventory.remove(item);
            room.addItemToRoom(playerDirection,item);
            System.out.println("You removed " + item.getName() + " from your inventory");
            return 0;
        }
        else {
            System.out.println("You have no such item in your inventory");
            return 2;
        }
    }
    public void setPosition(GameMap gameMap,int roomNo) {
        currRoomNO = roomNo;
        room = gameMap.getMap().get(roomNo);
    }

    public void setPlayerDirection(String playerDirection) {

        if (validDirections.contains(playerDirection)) {this.playerDirection = playerDirection;}
    }

    public String getPlayerDirection() {
        System.out.println(room.getName()+ ", " + room.getStory(playerDirection));
        getItemAtDirection();
        return playerDirection;

    }
    private void getItemAtDirection() {
        HashSet<Item> itemsAtDir = room.getItemsAtDir(playerDirection);
        if (itemsAtDir != null && !itemsAtDir.isEmpty()) {
            for (Item item: itemsAtDir) {
                System.out.println(item.getName() + ": " + item.getObstacleStory());
            }
        }
    }

    public int  enter(GameMap gameMap,String nameOfObjectThatPlayerWantsToEnter) {
        if (!stringToItemLibrary.containsItem(nameOfObjectThatPlayerWantsToEnter)) {
            System.out.println("There is no entrance by that name: " + nameOfObjectThatPlayerWantsToEnter);
            return 1;
        }
        Item item = stringToItemLibrary.getItem(nameOfObjectThatPlayerWantsToEnter);
        boolean isEntranceAtcurrDir = room.getItemsAtDir(playerDirection).contains(item);


        if (!isEntranceAtcurrDir) {
            System.out.println("There is no such entrance here: "+ nameOfObjectThatPlayerWantsToEnter);

            return 2;
        }
        else if (!(item instanceof Entrance)){

            System.out.println((item.getName() + "....you can't enter that"));
            return 3;
        }

        else {
            System.out.println("Success");
            Entrance entrance = (Entrance) item;

            int roomNo = entrance.getEntranceRoom();
            if (currRoomNO < roomNo) {
                currRoomNO = roomNo;
                room = gameMap.getMap().get(roomNo);
                System.out.println("You are entering: " + room.getName());}
            else {
                roomNo = entrance.getGoBackToRoom();
                currRoomNO = roomNo;
                room = gameMap.getMap().get(roomNo);
                System.out.println("You are entering: " +room.getName());
            }
            return 0;
        }
    }




















}
