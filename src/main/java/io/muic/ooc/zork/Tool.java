package io.muic.ooc.zork;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by joakimnilfjord on 1/29/2017 AD.
 */
public class Tool extends Item {
    private  HashSet<Obstacle> obstaclesWhichToolCanOpen = new HashSet<Obstacle>();

    public void setThingsToolCanOpen(Obstacle obstacle) {
        obstaclesWhichToolCanOpen.add(obstacle);
    }
    public HashSet<Obstacle> getObstaclesWhichToolCanOpen() {
        return obstaclesWhichToolCanOpen;
    }

}
