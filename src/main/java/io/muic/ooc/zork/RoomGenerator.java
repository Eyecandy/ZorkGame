package io.muic.ooc.zork;


import java.util.EmptyStackException;

/**
 * Created by joakimnilfjord on 1/30/2017 AD.
 */
public class RoomGenerator {
    ItemFactory itemFactory;
    public RoomGenerator(ItemFactory itemFactory) {
        this.itemFactory = itemFactory;
    }
    public Room createRoom1() {
        Room room1 = new Room();
        room1.setName("Bottom Of Tower");
        room1.setStory("There is a wall", "There is a Heavy Metal door",
                "There is Wall", "Stairs without end, leading upwards in a spiral");
        Weapon torch = itemFactory.createWeapon("Torch", 5, "It is ligting the room up");
        //Obstacle woodenBox = itemFactory.createObstacle("Wooden_box",true,
              //" which appears to be old");
        Entrance stairs = itemFactory.createEntrance("Stairs", true, "to go there press: enter [ entranceName ] ", 1 ,0
        ,"closed");
        Entrance heavyMetal = itemFactory.createEntrance("Metal_door",false,
                "It's barricaded from the outside",
                -1,-1,"It's barricaded from the outside");
        Tool metalThread= (Tool) itemFactory.stringToItemLibrary.getItem("Metal_thread");
        Container woodenBox = itemFactory.createContainer("Wooden_box", "It's old and appears to be open,try the open key word", metalThread,true,"it's closed" );
        Readable readable =  itemFactory.createReadable("red_painted_text","This tower is filled with 'fun', don't leave yet...oops seems like I've blocked the door, let the fun begin");
        room1.addItemToRoom("South",woodenBox);
        room1.addItemToRoom("East",readable);
        room1.addItemToRoom("North",heavyMetal);
        room1.addItemToRoom("East",torch);
        room1.addItemToRoom("West",stairs);
        return room1;
    }

    public Room createRoom2() {
        Room room2 = new Room();
        room2.setName("Stage 2 of Tower");
        room2.setStory("A mystical blue looking door","A Door","Stairs leading downwards", "Stairs leading upwards");

        Entrance stairs = (Entrance) itemFactory.getStringToItemLibrary().getItem("Stairs");
        Entrance azureDoor= itemFactory.createEntrance("Azure_door", false, "It's open", 3,1,"It's closed");
        Tool metalThread = (Tool) itemFactory.stringToItemLibrary.getItem("Metal_thread");
        Tool blueKey = (Tool) itemFactory.stringToItemLibrary.getItem("Blue_key");
        blueKey.setThingsToolCanOpen(azureDoor);
        Container ironBox = itemFactory.createContainer("Iron_box","it's as secure as they come, but open now",blueKey,false,"It's locked");

        Entrance woodenDoor= itemFactory.createEntrance("Wooden_door", false, "It's open", 2,1,"It's closed");
        metalThread.setThingsToolCanOpen(woodenDoor);

        room2.addItemToRoom("South",ironBox);
        room2.addItemToRoom("North",woodenDoor);
        room2.addItemToRoom("East",stairs);
        room2.addItemToRoom("South", azureDoor);

        return room2;
    }

    public Room createRoom3() {
        Room room3 = new Room();
        room3.setName("The oval Room");
        room3.setStory("Not much to see here","There is pillar of stone here","There is a large dam of blood spill", "Foot step from the east of blood leading here");

        Container ironBox = (Container)  itemFactory.stringToItemLibrary.getItem("Iron_box");
        Tool lavaJar = (Tool) itemFactory.stringToItemLibrary.getItem("Lava_jar");
        lavaJar.setThingsToolCanOpen(ironBox);
        Weapon bluntAxe = itemFactory.createWeapon("Blunt_axe", 18, "Well rounded axe,if you know what I mean,it's blunt get it?");
        Entrance woodenDoor = (Entrance) itemFactory.getStringToItemLibrary().getItem("Wooden_door");
        Weapon knife = itemFactory.createWeapon("Large_knife", 20,"It's covered in blood");
        Readable readable = itemFactory.createReadable("in_red","a taste of what to come");

        room3.addItemToRoom("North",readable);
        room3.addItemToRoom("North",bluntAxe);
        room3.addItemToRoom("East",lavaJar);
        room3.addItemToRoom("West",knife);
        room3.addItemToRoom("South",woodenDoor);
        return room3;
    }
}
