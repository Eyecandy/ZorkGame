package io.muic.ooc.zork.mass.producers;

import io.muic.ooc.zork.living.things.Monster;

/**
 * Created by joakimnilfjord on 1/28/2017 AD.
 */
public class MonsterFactory {

    public Monster createMonster(int monsterType, String monsterName, int damage, int health) {
        switch(monsterType) {
            case 1:
                Monster monster = new Monster();
                monster.setName(monsterName);
                monster.setDamage(damage);
                monster.setInitalHealth(health);
                return monster;
            default:
                return  null;



        }
    }
}
