package shapes;

import java.awt.*;

public interface Shape {

    default Double getArea(){
        return 0.0;
    }
    default Double getPerimeter(){
        return 0.0;
    }
    default String getBorderColor(){
        return "some border color";
    }
    default String getFillColor(){
        return "some fill color";
    }
    default String print(){
        return "[" + getArea() + ", " + getPerimeter() + ", " + getFillColor() + ", " + getBorderColor() + "]";
    }
}