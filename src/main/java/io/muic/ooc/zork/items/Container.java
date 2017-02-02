package io.muic.ooc.zork.items;

import java.util.HashSet;

/**
 * Created by joakimnilfjord on 1/30/2017 AD.
 */
public class Container extends Obstacle {
    private HashSet<Item> content = new HashSet<Item>();

    public void addContent(Item item) {
        content.add(item);
    }

    public HashSet<Item> getContent() {
        return content;
    }


}
