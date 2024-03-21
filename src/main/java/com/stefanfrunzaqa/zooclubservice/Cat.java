package com.stefanfrunzaqa.zooclubservice;

public class Cat extends AbstractAnimal implements AnimalInterface{

    public Cat(String name){
        super(name);
    }

    @Override
    void eat() {
        System.out.println(getName() + " is eating fish");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says meow");
    }
}