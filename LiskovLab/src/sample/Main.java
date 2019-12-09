package sample;


public class Main   {

    public static void main(String[] args) {

        Animal[] animals = {new Dog("Black"),
                            new Hedgehog("Blue"),
                            new Duck("Yellow"),
                            new Owl("Brown"),
                            new Snake("Black and Yellow")};

        System.out.println("###############");
        System.out.println();

        activateAnimal(animals);
    }

    private static void activateAnimal(Animal[] animals) {
        for (Animal animal : animals) {
            animal.eat();
            animal.sleep();
            animal.speak();
            animal.setColor("Grey");
            System.out.println(animal.getClass().getSimpleName() + " is " + animal.getColor());
            System.out.println();

            move(animal);

            System.out.println("###############");
            System.out.println();
        }
    }

    private static void move(Animal animal) {
        animal.dash();
        animal.fly();
        animal.jump();
        animal.roll();
        animal.sit();
        animal.run();
        animal.skip();
        animal.slither();
        animal.trot();
        animal.swim();
    }
}
