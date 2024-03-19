package shapes;

public class Triangle implements Shape{

    private Double lenA, lenB, lenC;
    private Colors borderColor = Colors.BLACK;
    private Colors fillColor = Colors.BLACK;

    public Triangle(Double lenA, Double lenB, Double lenC) {
        this.lenA = lenA;
        this.lenB = lenB;
        this.lenC = lenC;
    }

    public Triangle(Double lenA, Double lenB, Double lenC, Colors borderColor, Colors fillColor) {
        this.lenA = lenA;
        this.lenB = lenB;
        this.lenC = lenC;
        this.borderColor = borderColor;
        this.fillColor = fillColor;
    }

    public Double getLenA() {
        return lenA;
    }

    public void setLenA(Double lenA) {
        this.lenA = lenA;
    }

    public Double getLenB() {
        return lenB;
    }

    public void setLenB(Double lenB) {
        this.lenB = lenB;
    }

    public Double getLenC() {
        return lenC;
    }

    public void setLenC(Double lenC) {
        this.lenC = lenC;
    }

    public String getBorderColor() {
        return borderColor.toString();
    }
    public String getFillColor() {
        return fillColor.toString();
    }

    public void setBorderColor(Colors borderColor) {
        this.borderColor = borderColor;
    }

    public void setFillColor(Colors fillColor) {
        this.fillColor = fillColor;
    }

    @Override
    public Double getPerimeter() {
        return lenA + lenB + lenC;
    }

    @Override
    public Double getArea() {
        double halfPerimeter = getPerimeter()/2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - lenA) * (halfPerimeter - lenA) * (halfPerimeter - lenC));
    }

    @Override
    public String print() {
        return "Треугольник: " + Shape.super.print();
    }
}
