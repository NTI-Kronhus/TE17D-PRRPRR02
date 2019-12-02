package sample;


public class Main   {

    public static void main(String[] args) {

        Animal[] animals = {new Dog("Black"),
                            new Hedgehog("Pink"),
                            new Bird("Yellow"),
                            new Snake("Black and Yellow")};

        System.out.println("###############");
        System.out.println();

        for (Animal animal : animals) {
            animal.eat();
            animal.sleep();
            animal.speak();
            animal._color = "Grey";
            System.out.println(animal.getClass().getSimpleName() + " is " + animal.getColor());
            animal.walk();
            System.out.println();

            System.out.println("###############");
            System.out.println();
        }
    }
}
