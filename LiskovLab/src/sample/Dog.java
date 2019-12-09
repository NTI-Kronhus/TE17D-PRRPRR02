package sample;

public class Dog extends Animal {

    public Dog(String color) {
        super(color);
    }

    void speak() {
        System.out.println("Dog is barking!");
    }

    void sleep() {
        System.out.println("Dog is sleeping!");
    }

    void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public void fly() {
        //not applicable!
    }

    @Override
    public void trot() {
        System.out.println("Dog is a champion!");
    }

    @Override
    public void skip() {
        System.out.println("Dog is happy!");
    }

    @Override
    public void slither() {
        //not applicable!
    }

    @Override
    public void jump() {
        System.out.println("Dog is agile!");
    }

    @Override
    public void swim() {
        System.out.println("Dog is swimming!");
    }

    @Override
    public void run() {
        System.out.println("Dog running!");
    }

    @Override
    public void roll() {
        System.out.println("Who's a good boi!");
    }

    @Override
    public void sit() {
        System.out.println("Staaaaay!");
    }

    @Override
    public void dash() {
        System.out.println("Dog so fast!");
    }
}
