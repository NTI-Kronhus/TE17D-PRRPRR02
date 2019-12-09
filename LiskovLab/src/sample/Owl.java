package sample;

public class Owl extends Bird {

    public Owl(String color) {
        super(color);
    }

    public void fly() {
        System.out.println("Owl is gliding silently through the air!");
    }

    @Override
    public void trot() {
        //not applicable!
    }

    @Override
    public void skip() {
        System.out.println("Owl is skipping and hopping!");
    }

    @Override
    public void slither() {
        //not applicable!
    }

    @Override
    public void jump() {
        System.out.println("Owl is jumping!");
    }

    @Override
    public void swim() {
        //not applicable!
    }

    @Override
    public void run() {
        //not applicable!
    }

    @Override
    public void roll() {
        //not applicable!
    }

    @Override
    public void sit() {
        System.out.println("Owl is squatting on dem eggs!");
    }

    @Override
    public void dash() {
        //not applicable!
    }
}
