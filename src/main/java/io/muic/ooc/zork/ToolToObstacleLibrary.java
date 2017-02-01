package io.muic.ooc.zork;

/**
 * Created by joakimnilfjord on 1/31/2017 AD.
 */
public class ToolToObstacleLibrary {
    ToolFactory toolFactory = new ToolFactory();
    StringToItemLibrary stringToItemLibrary;
    public ToolToObstacleLibrary(StringToItemLibrary stringToItemLibrary) {
        this.stringToItemLibrary = stringToItemLibrary;
        Tool metalThread = toolFactory.createTool("Metal_thread", "Brand new and shiny");
        stringToItemLibrary.setStringToItem(metalThread.getName(),metalThread);
        Tool azureKey = toolFactory.createTool("Azure_key", "it's glowing, and cold as ice");
        stringToItemLibrary.setStringToItem(azureKey.getName(),azureKey);
        Tool lavaJar = toolFactory.createTool("Lava_jar","a star-like-hot liquid in a jar, pick it uo what could go wrong?");
        stringToItemLibrary.setStringToItem(lavaJar.getName(),lavaJar);
        Tool blueKeyStone = toolFactory.createTool("Blue_key_stone", "It's ocean-blue-sparkly");
        stringToItemLibrary.setStringToItem(blueKeyStone.getName(),blueKeyStone);
        Tool redKeyStone = toolFactory.createTool("Red_key_stone", "It's red, and it is a key to something, what more do you need to know? ");
        stringToItemLibrary.setStringToItem(redKeyStone.getName(),redKeyStone);
        Tool greenKeyStone = toolFactory.createTool("Green_key_stone", "It's a key gooey green key");
        stringToItemLibrary.setStringToItem(greenKeyStone.getName(),greenKeyStone);
        Tool whiteKeyStone = toolFactory.createTool("White_key_stone", "sparkly key, it is indeed");
        stringToItemLibrary.setStringToItem(whiteKeyStone.getName(),whiteKeyStone);
        Tool rope = toolFactory.createTool("Rope","Long rope");
        stringToItemLibrary.setStringToItem(rope.getName(),rope);
        Tool hammer = toolFactory.createTool("Hammer","the public's favorite tool");
        stringToItemLibrary.setStringToItem(hammer.getName(),hammer);

    }


}
