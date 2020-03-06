package sample;

import animals.*;

public class Main   {

    public static void main(String[] args) {

        Animal[] animals = {new Dog("Black", "It's a dog!"),
                            new Hedgehog("Blue", "Sonic?"),
                            new Duck("Yellow", "It's a duck!"),
                            new Owl("Brown", "It's an Owl!"),
                            new Snake("Black and Yellow", "Oh heck it's a Snaek!")};

        System.out.println("###############");
        System.out.println();

        for (Animal animal : animals) {
            activateAnimal(animal);
        }
    }

    private static void activateAnimal(Animal animal) {
        animal.eat();
        animal.sleep();
        animal.speak();
        animal.setColor("Grey");
        System.out.println(animal.getDescription());
        System.out.println();

        animal.performMotions();

        System.out.println("###############");
        System.out.println();
    }
}
