package shapes;

import java.awt.*;

public class Circle implements Shape{

    private Double radius;
    private Colors borderColor = Colors.BLACK;
    private Colors fillColor = Colors.BLACK;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Circle(Double radius, Colors borderColor, Colors fillColor) {
        this.radius = radius;
        this.borderColor = borderColor;
        this.fillColor = fillColor;
    }

    public String getBorderColor() {
        return borderColor.toString();
    }

//    public void setBorderColor(Color borderColor) {
//        this.borderColor = borderColor;
//    }

    public String getFillColor() {
        return fillColor.toString();
    }

//    public void setFillColor(Color fillColor) {
//        this.fillColor = fillColor;
//    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public Double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String print() {
        return "Круг: " + Shape.super.print();
    }
}
