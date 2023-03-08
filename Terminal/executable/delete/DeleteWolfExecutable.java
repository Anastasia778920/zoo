package Terminal.executable.delete;

import Terminal.executable.create.Command;
import Terminal.executable.create.CommandExecutable;
import zoo.Zoo;

public class DeleteWolfExecutable implements CommandExecutable {

    private Zoo zoo;

    public DeleteWolfExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    public DeleteWolfExecutable() {

    }

    public DeleteWolfExecutable getZoo(Zoo zoo, Command command) {
        return new DeleteWolfExecutable(zoo);
    }

    public void execute() {
        this.zoo.takeOfWolf();
    }
}