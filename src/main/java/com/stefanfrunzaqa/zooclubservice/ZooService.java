package com.stefanfrunzaqa.zooclubservice;

public class ZooService {
    public static void main(String[] args) {
        AbstractAnimal dog1 = new Dog("Max");
        Dog dog2 = new Dog("Milo");
        AbstractAnimal cat1 = new Cat("Bella");
        Cat cat2 = new Cat("Luna");

        dog1.eat();
        dog1.makeSound();
        dog2.makeSound();
        cat1.eat();
        cat1.makeSound();
        cat2.makeSound();
    }
}