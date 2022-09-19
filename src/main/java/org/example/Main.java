package org.example;

import org.example.figures.Circle;
import org.example.figures.Figure;
import org.example.figures.Square;
import org.example.figures.Triangle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Примеры для задания 1
        Person ivan = new Person.Builder("Ivan", "Petrov", "Male")
                .withMiddleName("Olegovich")
                .withAge(22)
                .build();

        Person alex = new Person.Builder("Alex", "Sultanov", "Male")
                .build();

        System.out.println(ivan);
        System.out.println(alex);

        System.out.println("*****************************************************");

        //Примеры для задания 3
        List<Figure> figures = new ArrayList<>();
        figures.add(new Circle(5d));
        figures.add(new Square(10d));
        figures.add(new Triangle(10d, 10d, 10d));

        for (Figure element : figures) {
            System.out.println(element.getClass().getSimpleName());
            System.out.println(element.getSidesCount());
            System.out.println(element.getArea());
            System.out.println();
        }
    }
}