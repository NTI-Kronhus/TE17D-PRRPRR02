package sample;

public class Duck extends Bird {

    public Duck(String color) {
        super(color);
    }

    @Override
    public void fly() {
        System.out.println("Duck is soaring majestically!");
    }

    @Override
    public void trot() {
        //not applicable!
    }

    @Override
    public void skip() {
        //not applicable!
    }

    @Override
    public void slither() {
        //not applicable!
    }

    @Override
    public void jump() {
        System.out.println("Duck is jumping!");
    }

    @Override
    public void swim() {
        System.out.println("Duck is zooming like a speed boat!");
    }

    @Override
    public void run() {
        System.out.println("Duck is running for takeoff!");
    }

    @Override
    public void roll() {
        System.out.println("Duck is good boi!");
    }

    @Override
    public void sit() {
        System.out.println("Duck is squatting on dem eggs!");
    }

    @Override
    public void dash() {
        //not applicable!
    }
}
