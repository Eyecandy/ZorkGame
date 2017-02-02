package io.muic.ooc.zork.items;

import io.muic.ooc.zork.items.Item;

/**
 * Created by joakimnilfjord on 1/28/2017 AD.
 */
public class Weapon extends Item {
    private int damage;
    public int getDamage(){return damage;}
    public void setDamage(int damage) {
        this.damage = damage;
    }
}
