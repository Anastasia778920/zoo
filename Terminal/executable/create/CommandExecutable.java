package Terminal.executable.create;

import zoo.Zoo;

public interface CommandExecutable {

    CommandExecutable getZoo(Zoo zoo, Command input);

    void execute();

}
