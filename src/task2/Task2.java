package task2;

public class Task2 {
    public static void build(){

        AnimalCollection animals = new AnimalCollection();
        animals.addAnimal("Dog");
        animals.addAnimal("Cat");
        animals.addAnimal("Lion");
        animals.addAnimal("Elephant");
        animals.addAnimal("Tiger");
        animals.addAnimal("Giraffe");
        animals.addAnimal("Bear");

        animals.printAnimals();

        animals.removeAnimal();
        animals.removeAnimal();
        animals.removeAnimal();
        animals.removeAnimal();

        animals.printAnimals();
    }
}
