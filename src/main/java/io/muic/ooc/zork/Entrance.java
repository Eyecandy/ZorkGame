package io.muic.ooc.zork;

/**
 * Created by joakimnilfjord on 1/30/2017 AD.
 */
public class Entrance extends  Obstacle {
    private  int entranceRoom;
    private  int goBackToRoom;

    public void setEntranceRoom(int roomNo) {
        entranceRoom = roomNo;
    }
    public int getEntranceRoom() {
        return entranceRoom;
    }
    public void setGoBackToRoom(int roomNo) {
        goBackToRoom = roomNo;
    }
    public int getGoBackToRoom() {
        return goBackToRoom;
    }









}
