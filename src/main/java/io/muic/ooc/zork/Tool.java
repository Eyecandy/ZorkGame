package io.muic.ooc.zork;

import java.util.HashSet;

/**
 * Created by joakimnilfjord on 1/29/2017 AD.
 */
public class Tool extends Item {
    HashSet<Obstacle> obstacelsWhichThreadCanOpen = new HashSet<Obstacle>();

    public void setObstacelsWhichThreadCanOpen(Obstacle item) {
        obstacelsWhichThreadCanOpen.add(item);
    }
    public HashSet<Obstacle> getObstacelsWhichThreadCanOpen() {
        return obstacelsWhichThreadCanOpen;
    }




}
