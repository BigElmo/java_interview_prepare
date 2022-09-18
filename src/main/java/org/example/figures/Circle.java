package org.example.figures;

public class Circle extends Figure {
    private final Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    @Override
    public Integer getSidesCount() {
        return 1;
    }

    @Override
    public Double getArea() {
        return PI * radius * radius;
    }
}
