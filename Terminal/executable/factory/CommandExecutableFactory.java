package Terminal.executable.factory;

import Terminal.executable.create.Command;
import Terminal.executable.create.CommandExecutable;

public interface CommandExecutableFactory {

    CommandExecutable create(Command input);

    }