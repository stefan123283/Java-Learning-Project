package com.stefanfrunzaqa.zooclubservice;

public abstract class AbstractAnimal implements AnimalInterface {
    private String name;

    public AbstractAnimal(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    abstract void eat();
}