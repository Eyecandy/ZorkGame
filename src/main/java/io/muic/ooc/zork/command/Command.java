package io.muic.ooc.zork.command;

import io.muic.ooc.zork.world.GameMap;
import io.muic.ooc.zork.living.things.Player;

import java.util.HashSet;


/**
 * Created by joakimnilfjord on 1/28/2017 AD.
 */
public class Command {

    private HashSet<String> knownKeyWord = new HashSet<String>();
    private Player player;
    private GameMap gameMap;

    public Command(Player player, GameMap gameMap) {
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
        knownKeyWord.add("attack");
        knownKeyWord.add("help");
        this.player = player;
        this.gameMap = gameMap;


    }


    public int checkString(String commandGivenByParser) {

        String[] commandToArray = commandGivenByParser.split(" ");
        if (commandGivenByParser.length() == 0) {
            System.out.println("That's not an valid command");
            return 1;
        } else if (!knownKeyWord.contains(commandToArray[0])) {
            System.out.println("I don't recognize that word" + commandToArray[0]);
            System.out.println("Known verbs : " + knownKeyWord.toString());
            return 2;
        } else if (commandToArray.length == 1) {
            OneKeyWord(commandToArray[0]);
        } else if (commandToArray.length == 2) {
            return OneArgPlusKeyWord(commandToArray[0], commandToArray[1]);
        } else if (commandToArray.length == 4) {
            twoArgPlusTwoKeyWord(commandToArray[0], commandToArray[1], commandToArray[3]);

        } else {
            System.out.println("I didn't get that, try to type another command");
            return 0;
        }

        return 0;
    }

    public void OneKeyWord(String keyWord) {
        if (keyWord.equals("quit")) {
            System.exit(0);
        } else if (keyWord.equals("inventory")) {
            player.getInventory();

        } else if (keyWord.equals("look")) {
            player.getPlayerDirection();
        } else if (keyWord.equals("inventory")) {
            player.getInventory();
        }
        else if (keyWord.equals("help")) {
            System.out.println("Valid key words: ");
            System.out.println(knownKeyWord.toString());
            System.out.println("enter [ entrance object ]");
            System.out.println("use [ tool object ] on [ obstacle object ]");
            System.out.println("attack [ monster object ] with [ weapon object ]");
        }
        else {
            System.out.println("I did not understand that");
        }

        }

    public int OneArgPlusKeyWord(String keyWord, String arg) {
        if (keyWord.equals("go")) {
            player.setPlayerDirection(arg);
            player.getPlayerDirection();
            return 0;
        } else if (keyWord.equals("take")) {
            player.addToInventory(arg);
            return 0;

        } else if (keyWord.equals("throw")) {
            player.throwAnItem(arg);
            return 0;
        } else if (keyWord.equals("enter")) {

            player.enter(gameMap, arg);
            if (player.getRoom().getName().equals("Level2") || player.getRoom().getName().equals("Level3") || player.getRoom().getName().equals("Done")) {
                return -1;
            }

        } else if (keyWord.equals("open")) {
            player.open(arg);
            return 0;
        }
         else {
            System.out.println("I did not understand that");
        }

        return 0;
    }

    public int twoArgPlusTwoKeyWord(String keyWord, String arg1, String arg2) {
        if (keyWord.equals("use")) {
            player.useTool(arg1, arg2);
            return 0;
        }
        if (keyWord.equals("attack")) {
            player.attack(arg2, arg1);
            return 0;
        } else {
            System.out.println("I did not understand that");
            return 1;
        }
    }
}
