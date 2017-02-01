package io.muic.ooc.zork;

import java.util.HashSet;

/**
 * Created by joakimnilfjord on 1/28/2017 AD.
 */
public class Monster {
    private String name;
    private int health;
    private int damage;
    private boolean isAlive = true;
    String story = "it's lurking around..";
    int pos;
    Room room;
    HashSet<Item> monsterInventory = new HashSet<Item>();

    public void setDamage(int damage) {
        this.damage = damage;
    }
    public void addToMonsterInventory(Item item) {
        monsterInventory.add(item);
    }
    public void setStory(String story) {
        this.story = story;
    }

    public void setName(String monsterName) {
        this.name = monsterName;
    }

    public String getName(){
        return name;
    }

    public HashSet<Item> setDead() {
        isAlive = false;
        System.out.println(("You've killed "+ name));
        story = "is dead";
        return  monsterInventory;
    }
    public String getStory() {
        return  story;
    }




    public void setInitalHealth(int health) {
        this.health = health;
    }

    public void setHealth(int damage) {
        health -= damage;
        if (health <= 0) {setDead();}
    }
    public Boolean getIsAlive() {
        return isAlive;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }






}
