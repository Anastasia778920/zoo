package Terminal.executable.create;

import animals.Snake;
import zoo.Zoo;

import java.util.ArrayList;

public class CreateSnakeExecutable implements CommandExecutable {

    private Zoo zoo;
    private Snake snake;

    public CreateSnakeExecutable(Zoo zoo, Command command) {
        ArrayList<String> input = command.getParameters();
        this.zoo = zoo;
        this.snake = new Snake(Integer.parseInt(input.get(1)), Integer.parseInt(input.get(2)), 0,
                Integer.parseInt(input.get(3)));
    }

    public CreateSnakeExecutable() {

    }


    public CreateSnakeExecutable getZoo(Zoo zoo, Command command) {
        return new CreateSnakeExecutable(zoo, command);
    }


    public void execute() {
        this.zoo.addSnake(snake);
    }
}