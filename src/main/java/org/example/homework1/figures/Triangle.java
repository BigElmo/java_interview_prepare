package org.example.homework1.figures;

public class Triangle extends Figure {
    private final Double lengthA;
    private final Double lengthB;
    private final Double lengthC;

    public Triangle(Double lengthA, Double lengthB, Double lengthC) {
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.lengthC = lengthC;
    }

    public Double getLengthA() {
        return lengthA;
    }

    public Double getLengthB() {
        return lengthB;
    }

    public Double getLengthC() {
        return lengthC;
    }

    @Override
    public Integer getSidesCount() {
        return 3;
    }

    @Override
    public Double getArea() {
        Double p = (lengthA + lengthB + lengthC) / 2;
        return Math.sqrt(p*(p-lengthA)*(p-lengthB)*(p-lengthC));
    }
}
