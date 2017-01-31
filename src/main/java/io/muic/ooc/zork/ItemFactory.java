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

    public Obstacle createObstacle(String obstacleName, boolean canEnter, String obstacleStory) {
        Obstacle obstacle = new Obstacle();
        obstacle.setEquipable(false);
        obstacle.setName(obstacleName);
        obstacle.setStory(obstacleStory);
        obstacle.setOpen(canEnter);

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
        if (!open) { entrance.setItemStorywhenClosed(ifClosedStory);}
        entrance.setEntranceRoom(roomNo);
        entrance.setGoBackToRoom(backwardRoomNo);
        stringToItemLibrary.setStringToItem(entranceName,entrance);
        return entrance;
    }

    public Container createContainer(String containerName, String contanerStory, Item content, Boolean open, String storyClosed) {
        Container container = new Container();
        container.setEquipable(false);
        container.setName(containerName);
        container.setStory(contanerStory);
        container.addContent(content);
        container.setOpen(open);
        container.setItemStorywhenClosed(storyClosed);
        stringToItemLibrary.setStringToItem(containerName,container);
        return container;
    }

    public Readable createReadable(String readableName, String Story) {
        Readable readable = new Readable();
        readable.setName(readableName); readable.setStory(Story);
        readable.setEquipable(false);
        stringToItemLibrary.setStringToItem(readableName,readable);
        return readable;
    }


    public StringToItemLibrary getStringToItemLibrary() {
        return stringToItemLibrary;
    }








}




