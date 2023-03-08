package Terminal;

import zoo.Zoo;

import java.util.Scanner;

import Terminal.executable.factory.CommandExecutableFactoryImpl;
import Terminal.message.ErrorMessage;
import Terminal.message.InviteMessage;
import Terminal.parser.CommandParser;

public class TerminalReader {
    private static TerminalReader terminalReader;
    private Zoo zoo;

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }

    private CommandParser commandParser;

    private Terminal.executable.create.CommandExecutable commandExecutable;

    private TerminalReader(CommandParser commandParser) {
        this.commandParser = commandParser;
    }

    public static TerminalReader newTerminalReader(CommandParser commandParser) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandParser);
        }
        return terminalReader;
    }

    private void setCommandExecutable(Terminal.executable.create.Command newCommand) {
        this.commandExecutable = new CommandExecutableFactoryImpl(zoo).create(newCommand);
    }

    public void endless() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(zoo.toString() + "\n");
            new InviteMessage().consoleMessage();
            String input = scanner.nextLine();
            if (input.equals("stop")) break;
            if (isCheck(input)) {
                Terminal.executable.create.Command newCommand = this.commandParser.parseCommand(input);
                this.setCommandExecutable(newCommand);
                this.commandExecutable.execute();
            } else {
                new ErrorMessage().consoleMessage();
            }
        }
        scanner.close();
    }

    private boolean isCheck(String input) {
        return false;
    }


}

