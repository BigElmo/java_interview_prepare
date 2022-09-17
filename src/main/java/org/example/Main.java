package org.example;

public class Main {
    public static void main(String[] args) {
        Person ivan = new Person.Builder("Ivan", "Petrov", "Male")
                .withMiddleName("Olegovich")
                .withAge(22)
                .build();

        Person alex = new Person.Builder("Alex", "Sultanov", "Male")
                .build();

        System.out.println(ivan);
        System.out.println(alex);
    }
}