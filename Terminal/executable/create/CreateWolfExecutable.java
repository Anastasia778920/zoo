package Terminal.executable.create;

import animals.Wolf;
import zoo.Zoo;

import java.util.ArrayList;

public class CreateWolfExecutable implements CommandExecutable {

    private Zoo zoo;
    private Wolf wolf;

    public CreateWolfExecutable(Zoo zoo, Command command) {
        ArrayList<String> input = command.getParameters();
        this.zoo = zoo;
        this.wolf = new Wolf(Integer.parseInt(input.get(1)), Integer.parseInt(input.get(2)), 0,
                Integer.parseInt(input.get(3)));
    }

    public CreateWolfExecutable() {

    }


    public CreateWolfExecutable getZoo(Zoo zoo, Command command) {
        return new CreateWolfExecutable(zoo, command);
    }


    public void execute() {
        this.zoo.addWolf(wolf);
    }
}