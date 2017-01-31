package io.muic.ooc.zork;

/**
 * Created by joakimnilfjord on 1/28/2017 AD.
 */
public class ItemFactory {
    StringToItemLibrary stringToItemLibrary;
    public ItemFactory(StringToItemLibrary stringToItemLibrary) {
        this.stringToItemLibrary = stringToItemLibrary;

    }



    public Weapon createWeapon( String name, int damage, String story) {
                Weapon weapon = new Weapon();
                weapon.setName(name);
                weapon.setDamage(damage);
                weapon.setEquipable(true);
                weapon.setStory(story);
                stringToItemLibrary.setStringToItem(name,weapon);
                return weapon;

    }

    public Obstacle createObstacle(String obstacleName, boolean canEnter, String obstacleStory, String keyToEnter) {
        Obstacle obstacle = new Obstacle();
        obstacle.setEquipable(false);
        obstacle.setName(obstacleName);
        obstacle.setStory(obstacleStory);
        obstacle.setOpen(canEnter);
        obstacle.setKeyToenter(keyToEnter);
        stringToItemLibrary.setStringToItem(obstacleName,obstacle);
        return obstacle;
    }

    public Entrance createEntrance(String entranceName,
                                   boolean open,
                                   String obstacleStory,
                                   int roomNo,
                                   int backwardRoomNo,
                                   String ifClosedStory) {
        Entrance entrance = new Entrance();
        entrance.setEquipable(false);
        entrance.setName(entranceName);
        entrance.setStory(obstacleStory);
        entrance.setOpen(open);
        //Note to self: there is a method called itemKey, I am not sure wether I should use it or not. but for now it is not here.
        if (!open) { entrance.setItemStorywhenClosed(ifClosedStory);}
        entrance.setEntranceRoom(roomNo);
        entrance.setGoBackToRoom(backwardRoomNo);
        stringToItemLibrary.setStringToItem(entranceName,entrance);
        return entrance;
    }

    public StringToItemLibrary getStringToItemLibrary() {
        return stringToItemLibrary;
    }








}




