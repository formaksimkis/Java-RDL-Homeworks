package org.fundamentals.homework.example;

public class Main4 {
    public static void main(String[] args) {
        printAnimalDescription(getAnimalByName(args[0]));
    }

    private static Animal getAnimalByName(String name) {
        switch (name.toLowerCase()) {
            case "dog":
                return new Dog();
            case "wolf":
                return new Wolf();
            case "cat":
                return new Cat();
            case "bird":
                return new Bird();
            case "dolphin":
                return new Dolphin();
            case "snake":
                return new Snake();
            default:
                return new UnknownAnimal(name);
        }
    }

    private static void printAnimalDescription (Animal animal) {
        System.out.println(animal.getDescription());
    }
}
