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
            printAnimalName(animal);
            System.out.println();

            move(animal);

            System.out.println("###############");
            System.out.println();
        }
    }

    private static void printAnimalName(Animal animal) {
        switch (animal.getClass().getSimpleName())
        {
            case "Duck":
                System.out.println("Its a duck!");
                break;
            case "Dog":
                System.out.println("Its a dog!");
                break;
            case "Owl":
                System.out.println("Its an Owl!");
                break;
            case "Bird":
                System.out.println("Its some kind of Bird!");
                break;
            case "Hedgehog":
                System.out.println("Sonic?");
                break;
            case "Snake":
                System.out.println("Oh heck its a Snaek!");
                break;
            default:
                System.out.println("ANIMAL!");
                break;
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
