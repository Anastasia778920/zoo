package Terminal.executable.delete;

import Terminal.executable.create.Command;
import Terminal.executable.create.CommandExecutable;
import zoo.Zoo;

public class DeleteLionExecutable implements CommandExecutable {

    private Zoo zoo;

    public DeleteLionExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    public DeleteLionExecutable() {

    }

    public  DeleteLionExecutable getZoo(Zoo zoo, Command command) {
        return new DeleteLionExecutable(zoo);
    }

    public void execute() {
        this.zoo.takeOfLion();
    }
}