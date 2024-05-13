package task2;

import java.util.ArrayDeque;

public class AnimalCollection {
    private ArrayDeque<String> animals;

    public AnimalCollection() {
        animals = new ArrayDeque<>();
    }

    public void addAnimal(String animal) {
        animals.addFirst(animal);
    }

    public String removeAnimal() {
        if (!animals.isEmpty()) {
            return animals.removeLast();
        }
        return "";
    }

    public void printAnimals() {
        System.out.println("Список животных:");
        for (String animal : animals) {
            System.out.println(animal);
        }
        System.out.println();
    }
}
