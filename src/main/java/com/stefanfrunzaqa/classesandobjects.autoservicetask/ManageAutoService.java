package com.stefanfrunzaqa.classesandobjects.autoservicetask;

public class ManageAutoService {
    public static void main(String[] args) {
        Car car1 = new Car("A Class", "Mercedes", "black");
        Car car2 = new Car("HES456");
        Garage garage1 = new Garage();
        Tool tool1 = new Tool("screwdriver");
        Tool tool2 = new Tool();
        Worker worker1 = new Worker();

        System.out.println("The details of the car1: Make: " + car1.make + ", Model: " + car1.model + ", Color: " + car1.color);
        System.out.println("The details of the car2: Plate number: " + car2.plateNumber);
        garage1.name = "AutoDoctor";
        garage1.address = "43 street";
        System.out.println("The details of the garage1: Address: " + garage1.address + ", Name: " + garage1.name);
        System.out.println("The details of the tool1: Name: " + tool1.name);
        tool2.name = "screw";
        tool2.price = 12.45;
        tool2.weight = 0.376;
        System.out.println("The details of the tool2: Name: "+ tool2.name + ", Price: " + tool2.price + ", Weight: " + tool2.weight);
        worker1.name = "John";
        worker1.height = 180.687;
        worker1.weight = 75.490;
        worker1.age = 25;
        System.out.println("The details of the worker1: Name: " + worker1.name + ", Height: " + worker1.height + ", Weight: " + worker1.weight + ", Age " + worker1.age);
    }
}