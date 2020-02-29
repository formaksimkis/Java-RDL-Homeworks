package org.fundamentals.homework.generic;

public class Main5 {
    public static void main(String[] args) {
        Animal animal = getAnimalByName(args[0]);
        System.out.println(animal.getDescription());
        System.out.println(animal.toString());
    }

    private static Animal getAnimalByName(String name) {
        switch (name.toLowerCase()) {
            case "dog":
                return new Animal("Dog", () -> "walks on four legs", () -> "Haf-haf");
            case "wolf":
                return new Animal("Wolf", () -> "walks on four legs", () -> "woo-o-o");
            case "cat":
                return new Animal("Cat", () -> "walks on four legs", () -> "mhr-r-r");
            case "bird":
                return new Animal("Bird", () -> "flies by wings", () -> "chick-chi-rik");
            case "dolphin":
                return new Animal("Dolphin", () -> "swims by using the fins", () -> "sque-q-q-q");
            case "snake":
                return new Animal("Snake", () -> "creeps quietly", () -> "hss-s-s");
            default:
                return new Animal(name, new UnknownAnimal(), new UnknownAnimal());
        }
    }
}
