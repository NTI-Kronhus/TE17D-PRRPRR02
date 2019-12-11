package animals;

import animal_interfaces.ISnake;

public class Snake extends Animal implements ISnake {

    public Snake(String color, String description) {
        super(color, description);
    }

    public void speak() {
        System.out.println("Snake is hissing!");
    }

    public void sleep() {
        System.out.println("Snake is sleeping!");
    }

    public void eat() {
        System.out.println("Snake is devouring!");
    }

    @Override
    public void performMotions() {
        jump();
        roll();
        slither();
        sneak();
        swim();
    }

    @Override
    public void jump() {
        System.out.println("Snake is jumping!");
    }

    @Override
    public void roll() {
        System.out.println("Snake is rolling!");
    }

    @Override
    public void slither() {
        System.out.println("Snake is slither!");
    }

    @Override
    public void sneak() {
        System.out.println("Snake is sneak!");
    }

    @Override
    public void swim() {
        System.out.println("Snake is swim!");
    }
}
