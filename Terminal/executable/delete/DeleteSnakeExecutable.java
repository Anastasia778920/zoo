package Terminal.executable.delete;

import Terminal.executable.create.Command;
import Terminal.executable.create.CommandExecutable;
import zoo.Zoo;

public class DeleteSnakeExecutable implements CommandExecutable {

    private Zoo zoo;

    public DeleteSnakeExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    public DeleteSnakeExecutable() {

    }

    public  DeleteSnakeExecutable getZoo(Zoo zoo, Command command) {
        return new DeleteSnakeExecutable(zoo);
    }


    public void execute() {
        this.zoo.takeOfSnake();
    }
}

