package org.example;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void showInfo() {
        System.out.printf("Person with name - %s and has age - %d%n", name, age);
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Person person = new Person("Tom", 25);

        person.showInfo();


        System.out.println("End!");

        System.out.println("ssghsughsg");
        System.out.println("shud");
    }
}
