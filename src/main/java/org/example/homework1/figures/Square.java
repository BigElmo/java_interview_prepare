package org.example.homework1.figures;

public class Square extends Figure {
    private final Double sideLength;

    public Square(Double sideLength) {
        this.sideLength = sideLength;
    }

    public Double getSideLength() {
        return sideLength;
    }

    @Override
    public Integer getSidesCount() {
        return 4;
    }

    @Override
    public Double getArea() {
        return sideLength * sideLength;
    }
}
