package io.muic.ooc.zork;

/**
 * Created by joakimnilfjord on 1/28/2017 AD.
 */
public class ItemFactory {
    StringToItemLibrary stringToItemLibrary;
    public ItemFactory(StringToItemLibrary stringToItemLibrary) {
        this.stringToItemLibrary = stringToItemLibrary;
    }



    public Item createItem(char itemType, String name, int damage) {
        switch (itemType) {
            case 'w':
                Weapon weapon = new Weapon();
                weapon.setName(name);
                weapon.setDamage(damage);
                weapon.setEquipable(true);
                stringToItemLibrary.setStringToItem(name,weapon);


                return weapon;
            case 'o':
                Obstacle obstacle = new Obstacle();
                obstacle.setName(name);
                obstacle.setEquipable(false);
                stringToItemLibrary.setStringToItem(name,obstacle);
                return obstacle;

            case 't':
                Tool tool = new Tool();
                tool.setName(name);
                tool.setEquipable(true);
                stringToItemLibrary.setStringToItem(name,tool);
                return tool;

            default:
                return null;
        }
    }
}




