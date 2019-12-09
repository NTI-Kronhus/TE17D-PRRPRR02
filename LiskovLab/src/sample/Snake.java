package sample;

public class Snake extends Animal {

    public Snake(String color) {
        super(color);
    }

    void speak() {
        System.out.println("Snake is hissing!");
    }

    void sleep() {
        System.out.println("Snake is sleeping!");
    }

    void eat() {
        System.out.println("Snake is devouring!");
    }

    @Override
    public void fly() {
        //not applicable
    }

    @Override
    public void trot() {
        //not applicable
    }

    @Override
    public void skip() {
        //not applicable
    }

    @Override
    public void slither() {
        System.out.println("Snake is slithering!");
    }

    @Override
    public void jump() {
        System.out.println("Snake is shooting off the ground to bite you with his mouth needles!");
    }

    @Override
    public void swim() {
        System.out.println("Snake is swimming");
    }

    @Override
    public void run() {
        //not applicable
    }

    @Override
    public void roll() {
        System.out.println("Snake is rolling over!");
    }

    @Override
    public void sit() {
        //not applicable
    }

    @Override
    public void dash() {
        //not applicable
    }
}
