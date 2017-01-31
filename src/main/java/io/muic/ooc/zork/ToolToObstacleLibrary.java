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
        Tool blueKey = toolFactory.createTool("Blue_key", "it's glowing, and cold as ice");
        stringToItemLibrary.setStringToItem(blueKey.getName(),blueKey);
        Tool lavaJar = toolFactory.createTool("Lava_jar","a star-like-hot liquid in a jar, pick it uo what could go wrong?");
        stringToItemLibrary.setStringToItem(lavaJar.getName(),lavaJar);
    }


}
