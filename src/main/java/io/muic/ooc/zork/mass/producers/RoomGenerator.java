package io.muic.ooc.zork.mass.producers;


import io.muic.ooc.zork.items.Readable;
import io.muic.ooc.zork.items.Container;
import io.muic.ooc.zork.items.Entrance;
import io.muic.ooc.zork.items.Tool;
import io.muic.ooc.zork.items.Weapon;
import io.muic.ooc.zork.living.things.Monster;
import io.muic.ooc.zork.world.Room;

/**
 * Created by joakimnilfjord on 1/30/2017 AD.
 */
public class RoomGenerator {
    ItemFactory itemFactory;
    MonsterFactory monsterFactory = new MonsterFactory();

    public RoomGenerator(ItemFactory itemFactory) {
        this.itemFactory = itemFactory;
    }

    public Room createRoom1() {
        Room room1 = new Room();
        room1.setName("Bottom Of Tower");
        room1.setStory("There is a wall", "There is a Heavy Metal door",
                "There is Wall", "Stairs without end, leading upwards in a spiral");
        Weapon torch = itemFactory.createWeapon("Torch", 5, "It is ligting the room up");
        Entrance stairs = itemFactory.createEntrance("Stairs", true, "to go there press: enter [ entranceName ] ", 1, 0, "it's closed");
        Entrance heavyMetal = itemFactory.createEntrance("Metal_door", false,
                "It's barricaded from the outside",
                -1, -1, "It's barricaded from the outside");
        Tool metalThread = (Tool) itemFactory.stringToItemLibrary.getItem("Metal_thread");
        Container woodenBox = itemFactory.createContainer("Wooden_box", "It's old and appears to be open,try the open key word", metalThread, true, "it's closed");
        Readable readable = itemFactory.createReadable("red_painted_text", "This tower is filled with 'fun', don't leave yet...oops seems like I've blocked the door, let the fun begin");
        room1.addItemToRoom("South", woodenBox);
        room1.addItemToRoom("East", readable);
        room1.addItemToRoom("North", heavyMetal);
        room1.addItemToRoom("East", torch);
        room1.addItemToRoom("West", stairs);
        return room1;
    }

    public Room createRoom2() {
        Room room2 = new Room();
        room2.setName("Stage 2 of Tower");
        room2.setStory("A mystical blue looking door", "A Door", "Stairs leading downwards", "Stairs leading upwards");
        Entrance stairs = (Entrance) itemFactory.getStringToItemLibrary().getItem("Stairs");
        Entrance stairsUp = itemFactory.createEntrance("Long_steps", true, "Stairs leading upwards.Each step looks like a struggle.", 4, 1, "closed");
        Entrance azureDoor = itemFactory.createEntrance("Azure_door", false, "It's open", 3, 1, "It's closed");
        Tool metalThread = (Tool) itemFactory.stringToItemLibrary.getItem("Metal_thread");
        Tool azureKey = (Tool) itemFactory.stringToItemLibrary.getItem("Azure_key");
        azureKey.setThingsToolCanOpen(azureDoor);
        Container ironBox = itemFactory.createContainer("Iron_box", "it's as secure as they come, but open now", azureKey, false, "It's locked");
        Entrance woodenDoor = itemFactory.createEntrance("Wooden_door", false, "It's open", 2, 1, "It's closed");
        metalThread.setThingsToolCanOpen(woodenDoor);
        room2.addItemToRoom("West", stairsUp);
        room2.addItemToRoom("South", ironBox);
        room2.addItemToRoom("North", woodenDoor);
        room2.addItemToRoom("East", stairs);
        room2.addItemToRoom("South", azureDoor);

        return room2;
    }

    public Room createRoom3() {
        Room room3 = new Room();
        room3.setName("The oval Room");
        room3.setStory("Not much to see here", "There is pillar of stone here", "There is a large dam of blood spill", "Foot step from the east of blood leading here");
        Container ironBox = (Container) itemFactory.stringToItemLibrary.getItem("Iron_box");
        Tool lavaJar = (Tool) itemFactory.stringToItemLibrary.getItem("Lava_jar");
        lavaJar.setThingsToolCanOpen(ironBox);
        Weapon bluntAxe = itemFactory.createWeapon("Blunt_axe", 18, "Well rounded axe,if you know what I mean,it's blunt get it?");
        Entrance woodenDoor = (Entrance) itemFactory.getStringToItemLibrary().getItem("Wooden_door");
        Weapon knife = itemFactory.createWeapon("Large_knife", 20, "It's covered in blood");
        Readable readable = itemFactory.createReadable("in_red", "a taste of what to come");
        Tool redKeyStone = (Tool) itemFactory.stringToItemLibrary.getItem("Red_key_stone");
        room3.addItemToRoom("South", redKeyStone);
        room3.addItemToRoom("North", readable);
        room3.addItemToRoom("North", bluntAxe);
        room3.addItemToRoom("East", lavaJar);
        room3.addItemToRoom("West", knife);
        room3.addItemToRoom("South", woodenDoor);
        return room3;
    }

    public Room createRoom4() {
        Room room4 = new Room();
        room4.setName("The Jewelery Room");
        room4.setStory("A red painted corner", "A blue painted corner", "A green painted corner",
                "A White painted corner");
        Weapon xbow = itemFactory.createWeapon("Xbow", 30, "An ancient powerful cross-bow");
        Tool redKeyStone = (Tool) itemFactory.stringToItemLibrary.getItem("Red_key_stone");
        Tool blueKeyStone = (Tool) itemFactory.stringToItemLibrary.getItem("Blue_key_stone");
        Tool greenKeyStone = (Tool) itemFactory.stringToItemLibrary.getItem("Green_key_stone");
        Tool whiteKeyStone = (Tool) itemFactory.stringToItemLibrary.getItem("White_key_stone");
        Tool rope = (Tool) itemFactory.stringToItemLibrary.getItem("Rope");
        Entrance azureDoor = (Entrance) itemFactory.stringToItemLibrary.getItem("Azure_door");
        Container rubyLockBox = itemFactory.createContainer("Ruby_lock_box", "it's open", blueKeyStone, false, "It's locked");
        Container saphireLockBox = itemFactory.createContainer("Saphire_lock_box", "it's open", greenKeyStone, false, "it's locked");
        Container emeraldLockBox = itemFactory.createContainer("Emerald_lock_box", "it's open", whiteKeyStone, false, "it's locked");
        Container diamonLockBox = itemFactory.createContainer("Diamond_lock_box", "it's open", xbow, false, "it's locked");
        itemFactory.stringToItemLibrary.setStringToItem(rubyLockBox.getName(), rubyLockBox);
        itemFactory.stringToItemLibrary.setStringToItem(emeraldLockBox.getName(), emeraldLockBox);
        itemFactory.stringToItemLibrary.setStringToItem(diamonLockBox.getName(), diamonLockBox);
        itemFactory.stringToItemLibrary.setStringToItem(saphireLockBox.getName(), saphireLockBox);
        emeraldLockBox.addContent(rope);
        blueKeyStone.setThingsToolCanOpen(saphireLockBox);
        redKeyStone.setThingsToolCanOpen(rubyLockBox);
        greenKeyStone.setThingsToolCanOpen(emeraldLockBox);
        whiteKeyStone.setThingsToolCanOpen(diamonLockBox);
        room4.addItemToRoom("North", azureDoor);
        room4.addItemToRoom("South", emeraldLockBox);
        room4.addItemToRoom("North", rubyLockBox);
        room4.addItemToRoom("East", diamonLockBox);
        room4.addItemToRoom("West", saphireLockBox);
        return room4;
    }

    public Room createRoom5() {
        Room room5 = new Room();
        room5.setName("The broken stairs");
        room5.setStory("There is a wall", "You can see the bottom of the tower far down", "There is staircase leading downward", "Broken Stairs");
        Entrance longSteps = (Entrance) itemFactory.stringToItemLibrary.getItem("Long_steps");
        Entrance brokenSteps = itemFactory.createEntrance("Broken_steps", false, "It's a big gap, and a metal bar sticking up on the other side", 5, 4, "No way back");
        Readable readable = itemFactory.createReadable("stone_carved_text", "Ah, you've come far my friend, hope you're ready to take the leap to the next level of fun");
        Tool rope = (Tool) itemFactory.stringToItemLibrary.getItem("Rope");
        rope.setThingsToolCanOpen(brokenSteps);
        room5.addItemToRoom("East", longSteps);
        room5.addItemToRoom("West", brokenSteps);
        room5.addItemToRoom("South", readable);
        return room5;
    }

    public Room createRoom6() {
        Room room6 = new Room();
        room6.setName("The Plateau");
        room6.setStory("It's dirty here and filled with spiderwebs", "A dark hallway", "A stone wall", "A metal gate");
        Entrance metalGate = itemFactory.createEntrance("Metal_gate", false, "open", 0, 0, "it's to heavy to open this gate");
        Entrance darkHallWay = itemFactory.createEntrance("Dark_hall_way", true, "it's dark,but entering is possible", 1, 0, "never closed");
        Readable readable = itemFactory.createReadable("Blood_marks", "of finger prints covers the the entrance of the hallway, consumed by the darkness of the hallway");
        Weapon greatSword = itemFactory.createWeapon("Great_sword", 32, "it's filled with magic and stuff");
        Container marbleLockBox = itemFactory.createContainer("Marble_lock_box", "'marbelous' it's open now", greatSword, false, "it's closed");
        Container treasureChest = itemFactory.createContainer("Treasure_chest", "It's open", marbleLockBox, false, "it's locked");
        Tool hammer = (Tool) itemFactory.stringToItemLibrary.getItem("Hammer");
        hammer.setThingsToolCanOpen(treasureChest);
        hammer.setThingsToolCanOpen(marbleLockBox);
        room6.addItemToRoom("South", hammer);
        room6.addItemToRoom("East", treasureChest);
        room6.addItemToRoom("West", metalGate);
        room6.addItemToRoom("North", darkHallWay);
        room6.addItemToRoom("North", readable);
        return room6;

    }

    public Room createRoom7() {
        Room room7 = new Room();
        room7.setName("The ruined chamber");
        Weapon toothPick = itemFactory.createWeapon("Tooth_pick", 1, "It has been used");
        Container crackedJar = itemFactory.createContainer("Cracked_jar", "An antic jar, pity is cracked",
                toothPick, true, "Never closed");
        room7.setStory("S", "N", "E", "W");
        Entrance theGreatWall = itemFactory.createEntrance("The_great_wall", false, "daym, u go some cool magical gloves, seems you can climb up now", 2, 1, "no way you can go up there");
        Tool magicalClimbingGloves = (Tool) itemFactory.getStringToItemLibrary().getItem("Magical_climbing_gloves");
        magicalClimbingGloves.setThingsToolCanOpen(theGreatWall);
        Weapon weapon = itemFactory.createWeapon("Spear", 39, "Great spear is great");
        Monster monster = monsterFactory.createMonster(1, "wicked_spirit", 10, 80);
        monster.addToMonsterInventory(magicalClimbingGloves);
        monster.addToMonsterInventory(weapon);
        Entrance entrance = (Entrance) itemFactory.stringToItemLibrary.getItem("Dark_hall_way");
        room7.addItemToRoom("South", entrance);
        room7.addItemToRoom("West", theGreatWall);
        room7.addItemToRoom("North", crackedJar);
        room7.addMonster("East", monster);
        return room7;
    }

    public Room createRoom8() {
        Room room8 = new Room();
        room8.setName("The top of the tower");
        room8.setStory("", "", "", "");
        Entrance purpleWall = itemFactory.createEntrance("Purple_wall", false, "no open", 0, 0, "A purple wall, it appeared behind you, right as you climbed up it's some kinda dark magic");
        Entrance openGate = itemFactory.createEntrance("Open_gate", true, "it's open", 1, 0, "not");
        Weapon boomStick = itemFactory.createWeapon("Boom_stick", 50, "it comes with bullets");
        Readable readable1 = itemFactory.createReadable("in_blood", "did you have fun yet?");
        Readable readable2 = itemFactory.createReadable("in_blood2", "you killed my little creation down there....at a price");
        Readable readable3 = itemFactory.createReadable("in_blood3", "There is one more challenge ahead..do you see the open door");
        Readable readable4 = itemFactory.createReadable("in_blood4", "My birds are always hungry,I welcome you");
        itemFactory.stringToItemLibrary.setStringToItem(openGate.getName(), openGate);
        itemFactory.stringToItemLibrary.setStringToItem(purpleWall.getName(), purpleWall);
        itemFactory.stringToItemLibrary.setStringToItem(boomStick.getName(), boomStick);
        itemFactory.stringToItemLibrary.setStringToItem(readable1.getName(), readable1);
        itemFactory.stringToItemLibrary.setStringToItem(readable2.getName(), readable2);
        itemFactory.stringToItemLibrary.setStringToItem(readable3.getName(), readable3);
        itemFactory.stringToItemLibrary.setStringToItem(readable4.getName(), readable4);


        room8.addItemToRoom("South", readable1);
        room8.addItemToRoom("North", readable2);
        room8.addItemToRoom("West", readable3);
        room8.addItemToRoom("East", readable4);
        room8.addItemToRoom("South", purpleWall);
        room8.addItemToRoom("North", openGate);
        room8.addItemToRoom("West", boomStick);
        return room8;
    }


    public Room createRoom9() {
        Room room9 = new Room();
        room9.setName("The outside plateau");
        Tool portalKey = (Tool) itemFactory.stringToItemLibrary.getItem("Portal_key");
        Entrance portal = itemFactory.createEntrance("Portal", false, "portal outta here", 2, 1, "closed portal");
        room9.setStory("The wind blows strongly, like it's powerful and dangerous", "There is a pillar, it offers shelter from the wind", "There is gushing wind, that goes through bones", "There is a supersonic wind, have you ever felt a supersonic wind before...I didn't think so");
        portalKey.setThingsToolCanOpen(portal);
        Monster clown = monsterFactory.createMonster(1, "Clown", 2, 95);
        clown.addToMonsterInventory(portalKey);
        room9.addItemToRoom("West", portal);
        room9.addMonster("South", clown);
        return room9;
    }


}
