package io.muic.ooc.zork;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by joakimnilfjord on 1/25/2017 AD.
 */
public class ZorkRunner {

    public static void main(String[] args) {
        Player player = new Player("jo", 100,8,0);
        Room room = new Room("yolo");
        Weapon weapon = new Weapon();
        Weapon weapon1 = new Weapon();
        room.addItemToRoom(1,weapon);
        room.addItemToRoom(2, weapon1);
        System.out.println(room.itemAtDir.get(1).toString());
        System.out.println(room.itemAtDir.get(2).toString());


    }

}
