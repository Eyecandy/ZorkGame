package io.muic.ooc.zork;

/**
 * Created by joakimnilfjord on 1/28/2017 AD.
 */
public class Obstacle extends Item {
    private boolean open;
    private String keyToenter;
    private String itemStorywhenClosed;
    private String itemStory;

    public void setOpen(boolean open) {
        this.open= open;
    }

    public void setStory(String itemStory) {
        this.itemStory = itemStory;
    }

    public Boolean getOpen() {
        return open;
    }

    public void setKeyToenter(String keyToenter) {
        this.keyToenter = keyToenter;
    }

    public String getKeyToenter() {
        return keyToenter;
    }

    public void setItemStorywhenClosed(String itemStorywhenClosed) {
        this.itemStorywhenClosed = itemStorywhenClosed;
    }

    public String getItemStorywhenClosed() {
        return itemStorywhenClosed;
    }

    public String getObstacleStory() {

        if (open) {

            return itemStory;

        }
        else{
            return getItemStorywhenClosed();
        }
    }












}
