package io.muic.ooc.zork;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;


/**
 * Created by joakimnilfjord on 1/28/2017 AD.
 */
public class Command {

    HashSet<String>  knownKeyWord = new HashSet<String>();
    Player player;
    GameMap gameMap;
    public Command(Player player,GameMap gameMap) {
        this.player = player;
        knownKeyWord.add("go");
        knownKeyWord.add("enter");
        knownKeyWord.add("throw");
        knownKeyWord.add("take");
        knownKeyWord.add("quit");
        knownKeyWord.add("inventory");
        knownKeyWord.add("look");
        knownKeyWord.add("use");
        knownKeyWord.add("open");
        this.player = player;
        this.gameMap = gameMap;


    }


    public int checkString(String commandGivenByParser) {


        String[] commandToArray = commandGivenByParser.split(" ");
        if (commandGivenByParser.length()== 0 ){
            System.out.println("That's not an valid command");
            return 1;
        }

        else if (!knownKeyWord.contains(commandToArray[0])) {
            System.out.println("I don't recognize that word" + commandToArray[0]);
            System.out.println("Known verbs : " +knownKeyWord.toString());
            return 2;
        }

        else if (commandToArray.length == 1) {
            OneKeyWord(commandToArray[0]);
        }

        else if (commandToArray.length == 2) {
           return OneArgPlusKeyWord(commandToArray[0],commandToArray[1]);
        }
        else if (commandToArray.length == 4) {
            twoArgPlusTwoKeyWord(commandToArray[0],commandToArray[1],commandToArray[3]);

        }
        else {
            System.out.println(commandGivenByParser);
            return 0;
        }
        return 0;
    }

    public void OneKeyWord(String keyWord) {
        if (keyWord.equals("quit")) {
            System.exit(0);
        }
        else if (keyWord.equals("inventory")) {
            player.getInventory();

        }
        else if (keyWord.equals("look")) {
            player.getPlayerDirection();
        }
        else if (keyWord.equals("inventory")) {
            player.getInventory();
        }
    }

    public int OneArgPlusKeyWord(String keyWord, String arg) {
        if (keyWord.equals("go")) {
            player.setPlayerDirection(arg);
            player.getPlayerDirection();
            return 0;
        }
        else if (keyWord.equals("take")) {
            player.addToInventory(arg);
            return 0;

        }
        else if (keyWord.equals("throw")) {
            player.throwAnItem(arg);
            return 0;
        }
        else if (keyWord.equals("enter")) {

            player.enter(gameMap,arg);
            if (player.getRoom().getName().equals("Level2")) {
                return -1;

            }

        }
        else if (keyWord.equals("open")) {
            player.open(arg);
            return 0;
        }
        return 0;
    }

    public void twoArgPlusTwoKeyWord(String keyWord, String arg1,String arg2) {
        if (keyWord.equals("use")) {
            player.useTool(arg1,arg2);
        }
    }




}
