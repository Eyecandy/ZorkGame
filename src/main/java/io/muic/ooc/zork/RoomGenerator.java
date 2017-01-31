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
                "There is Wall", "Stairs leading upwards in a spiral");
        Weapon torch = itemFactory.createWeapon("Torch", 5, "It is ligting the room up");
        Obstacle woodenBox = itemFactory.createObstacle("Wooden_Box",true,
              " which appears to be old", null);
        Entrance stairs = itemFactory.createEntrance("Stairs", true, "to go there press: enter (nameOfObject) ", 1 ,0
        ,"closed");
        Entrance heavyMetal = itemFactory.createEntrance("Metal_Door ",false,
                "It's barricaded from the outside",
                0,0,"it's barricaded from the outside");
        room1.addItemToRoom("North",heavyMetal);
        room1.addItemToRoom("South", woodenBox);
        room1.addItemToRoom("East",torch);
        room1.addItemToRoom("West",stairs);
        return room1;
    }

    public Room createRoom2() {
        Room room2 = new Room();
        room2.setName("Stage 2 of Tower");
        Entrance stairs = (Entrance) itemFactory.getStringToItemLibrary().getItem("Stairs");
        Entrance azureDoor= itemFactory.createEntrance("Azure Door", false, "It's open", 2,1,"It's closed");
        room2.addItemToRoom("East",stairs);
        room2.addItemToRoom("South", azureDoor);

        room2.setStory("A Door","A Door","Stairs leading downwards", "Stairs leading upwards");
        return room2;

    }
}
