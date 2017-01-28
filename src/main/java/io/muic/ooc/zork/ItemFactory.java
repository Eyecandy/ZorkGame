package io.muic.ooc.zork;

/**
 * Created by joakimnilfjord on 1/28/2017 AD.
 */
public class ItemFactory {

    public static Item createItem(int itemType, String name, int damage) {
        switch (itemType) {
            case 1:
                Weapon weapon = new Weapon();
                weapon.setName(name);
                weapon.setDamage(damage);
                weapon.setEquipable(true);
                return weapon;
            case 2:
                Obstacle obstacle = new Obstacle();
                obstacle.setName(name);
                obstacle.setEquipable(false);
                return obstacle;
            default:
                return null;
        }
    }
}




