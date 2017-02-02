package io.muic.ooc.zork.items;

/**
 * Created by joakimnilfjord on 1/28/2017 AD.
 */
public abstract class Item {
    private String name;
    private boolean equipable;
    private String itemStory;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEquipable(boolean equipable) {
        this.equipable = equipable;
    }

    public Boolean isEquipable() {
        return equipable;
    }

    public void setStory(String itemStory) {
        this.itemStory = itemStory;
    }

    public String getObstacleStory() {
        return itemStory;
    }

}
