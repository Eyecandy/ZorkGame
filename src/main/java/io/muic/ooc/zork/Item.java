package io.muic.ooc.zork;

/**
 * Created by joakimnilfjord on 1/28/2017 AD.
 */
public abstract  class  Item  {
    private String name;
    private boolean equipable;

    public String getName() {
        return this.name;
    }

     public void setName(String name) {
        this.name = name;
    }
    public void setEquipable(boolean equipable) {
        this.equipable = equipable;
    }

    public Boolean getEquipable() {
        return equipable;
    }





}
