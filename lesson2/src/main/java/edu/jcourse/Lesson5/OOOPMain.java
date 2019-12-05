package edu.jcourse.Lesson5;

public class OOOPMain {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "Abstract Animal";
        animal.sayHello();

        Cat cat = new Cat();
        cat.setName("Pushok");
        cat.setAge(10);
        cat.sayHello();
        cat.printAge();

        Dog dog = new Dog();
        dog.setName("Sharik");
        dog.setAge(5);
        dog.printAge();
        dog.sayHello();

    }
}
