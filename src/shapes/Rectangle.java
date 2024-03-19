package shapes;

import java.awt.*;

public class Rectangle implements Shape{

    private double width;
    private double height;
    private Colors borderColor = Colors.BLACK;
    private Colors fillColor = Colors.BLACK;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, Colors borderColor, Colors fillColor) {
        this.width = width;
        this.height = height;
        this.borderColor = borderColor;
        this.fillColor = fillColor;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBorderColor() {
        return borderColor.toString();
    }

    public void setBorderColor(Colors borderColor) {
        this.borderColor = borderColor;
    }

    public String getFillColor() {
        return fillColor.toString();
    }

    public void setFillColor(Colors fillColor) {
        this.fillColor = fillColor;
    }

    @Override
    public Double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public Double getArea() {
        return width * height;
    }

    @Override
    public String print() {
        return "Прямоугольник: " + Shape.super.print();
    }
}
