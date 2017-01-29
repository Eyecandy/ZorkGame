package io.muic.ooc.zork;

import java.util.HashMap;

/**
 * Created by joakimnilfjord on 1/29/2017 AD.
 */
public class Story {

    private HashMap<String, String> dirToStory = new HashMap<String, String>();

    public void setDirToStory(String dir, String story){dirToStory.put(dir,story);
    }
    public String getDirAndStory(String dir) {
        String dirAndStory = dir + ": "+dirToStory.get(dir);
        return dirAndStory;
    }
}
