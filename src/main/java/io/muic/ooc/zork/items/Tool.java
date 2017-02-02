package io.muic.ooc.zork.items;

import io.muic.ooc.zork.items.Item;
import io.muic.ooc.zork.items.Obstacle;

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
