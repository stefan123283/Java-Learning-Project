package com.stefanfrunzaqa.accessmodifiers;

import com.stefanfrunzaqa.accessmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog {
    public static void main(String[] args) {

        Person person1 = new Person("Sirbu", "Ion", "7248749620834", 45, "man", "Hincesti", true);
        Person person2 = new Person("Munteanu", "Alexandru", "2937402873629", 22, "man", "Orhei", false);
        Person person3 = new Person("Popovici", "Andrei", "3803749274935");
        Person person4 = new Person("Druta", "Elena", "9473640173846");
        Person person5 = new Person("Colev", "Ioan", "9384027492846");

        if (person1.isRetired){
            System.out.println(person1.name + " " + person1.surname + " is retired.");
        } else {
            System.out.println(person1.name + " " + person1.surname + " is not retired.");
        }

        if (person2.isRetired){
            System.out.println(person2.name + " " + person2.surname + " is retired.");
        } else {
            System.out.println(person2.name + " " + person2.surname + " is not retired.");
        }

        System.out.println("Details about person3: Name: " + person3.name + ", Surname: " + person3.surname + ", ID: " + person3.id);

        person4.surname = "Vasile";

        System.out.println("Details about person4: Name: " + person4.name + ", Surname: " + person4.surname + ", ID: " + person4.id);

        System.out.println("Details about person5: Name: " + person5.name + ", Surname: " + person5.surname + ", ID: " + person5.id);

    }
}