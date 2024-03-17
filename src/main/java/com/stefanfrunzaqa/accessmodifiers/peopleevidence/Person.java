package com.stefanfrunzaqa.accessmodifiers.peopleevidence;

public class Person {
  public String name;
  public String surname;
  public String id;
  private int age;
  String sex;
  String residence;
  public boolean isRetired;

  public Person(String name, String surname, String id, int age, String sex, String residence, boolean isRetired){
    this.name = name;
    this.surname = surname;
    this.id = id;
    this.age = age;
    this.sex = sex;
    this.residence = residence;
    this.isRetired = isRetired;
  }

  public Person(String name, String surname, String id){
    this.name = name;
    this.surname = surname;
    this.id = id;
  }

}