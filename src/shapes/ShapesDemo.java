package shapes;

//import java.awt.*;
import java.util.Arrays;

public class ShapesDemo {
    public static void main(String[] args) {
        Shape circle = new Circle(2.56, Colors.BLUE, Colors.RED);
        Shape triangle = new Triangle(4.5, 6.7, 5.5, Colors.RED, Colors.GRAY);
        Shape rectangle = new Rectangle(28, 55, Colors.YELLOW, Colors.GREEN);

        for (Shape shape : Arrays.asList(circle, triangle, rectangle)){
            System.out.println(shape.print());
        }
    }
}



//Задание 2:
//        Применяя интерфейсы написать программу расчета периметра и площади геометрических фигур: круг, прямоугольник, треугольник.
//        Задать для каждой фигуры цвет заливки и цвет границы.
//        Результат полученных характеристик [ Периметр, площадь, цвет фона, цвет границ ] по каждой фигуре вывести в консоль.
//
//
//        Попробуйте реализовать базовые методы, такие как расчет периметра фигур, в качестве дефолтных методов в интерфейсе.
