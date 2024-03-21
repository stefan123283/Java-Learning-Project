package com.stefanfrunzaqa.zooclubservice;

public class Dog extends AbstractAnimal implements AnimalInterface{

    public Dog(String name){
        super(name);
    }

    @Override
    void eat() {
        System.out.println(getName() + " is eating meat");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says woof");
    }
}