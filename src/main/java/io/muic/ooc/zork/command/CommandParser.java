package io.muic.ooc.zork.command;

import io.muic.ooc.zork.command.Command;

import java.util.Scanner;

/**
 * Created by joakimnilfjord on 1/28/2017 AD.
 */
public class CommandParser {
    Command command;

    public CommandParser(Command command) {
        this.command = command;
    }

    public void startCommandParsing() {
        int quit = 0;
        while (quit != -1) {
            System.out.println("Type in command:");
            Scanner scanner = new Scanner(System.in);
            String commandGiven = scanner.nextLine();
            quit = command.checkString(commandGiven);

        }
    }


}
