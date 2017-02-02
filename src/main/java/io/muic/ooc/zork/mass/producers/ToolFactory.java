package io.muic.ooc.zork.mass.producers;


import io.muic.ooc.zork.items.Tool;

/**
 * Created by joakimnilfjord on 1/31/2017 AD.
 */
public class ToolFactory {

    public Tool createTool(String toolName, String toolStory ){
        Tool tool = new Tool();
        tool.setName(toolName);
        tool.setStory(toolStory);
        tool.setEquipable(true);
        return tool;
    }
}
