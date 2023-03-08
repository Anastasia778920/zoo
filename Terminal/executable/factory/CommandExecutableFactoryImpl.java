package Terminal.executable.factory;

import Terminal.executable.create.Command;
import Terminal.executable.create.CommandExecutable;
import zoo.Zoo;


public class CommandExecutableFactoryImpl implements CommandExecutableFactory {
    private Zoo zoo;

    public CommandExecutableFactoryImpl(Zoo zoo) {
        this.zoo = zoo;
    }

    public CommandExecutable create(Terminal.Command command) {
        Command codeEnum = command.getCommandEnum();
        CommandExecutable exec = codeEnum.getMethod();
        return exec.getZoo(zoo, command);
    }

    public CommandExecutable create(Command input) {
       
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }
}
