package com.stefanfrunzaqa.methodstask;

public class ExecutionService {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Covali", 28, "alex123@gmail.com");
        Customer customer2 = new Customer("Rusnac", 22, "andrei321@mail.ru");
        System.out.println("Customer 1 name is " + customer1.getName());
        System.out.println("Customer 1 age is " + customer1.getAge());
        System.out.println("Customer 1 email is " + customer1.getEmail());
        System.out.println("Customer 2 name is " + customer2.getName());
        System.out.println("Customer 2 age is " + customer2.getAge());
        System.out.println("Customer 2 email is " + customer2.getEmail());
        customer1.setName(DataGeneratorUtil.generateRandomString(7));
        customer1.setAge(DataGeneratorUtil.getRandomInt(20, 30));
        customer1.setEmail(DataGeneratorUtil.getRandomEmail());
        customer2.setName(DataGeneratorUtil.generateRandomString(5));
        customer2.setAge(DataGeneratorUtil.getRandomInt(35, 50));
        customer2.setEmail(DataGeneratorUtil.getRandomEmail());
        System.out.println(customer1);
        System.out.println(customer2);
    }
}