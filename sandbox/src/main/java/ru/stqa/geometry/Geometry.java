package ru.stqa.geometry;

import ru.stqa.geometry.figures.Rectangle;
import ru.stqa.geometry.figures.Square;
import ru.stqa.geometry.figures.Triangle;

public class Geometry {
  public static void main(String[] args) {
    Square.printSquareArea(new Square(7.));
    Square.printSquareArea(new Square(3.0));
    Square.printSquareArea(new Square(5));

    Rectangle.printRectangleArea(3.0, 5.0);
    Rectangle.printRectangleArea(2.0, 8.0);

    Triangle.printTriangleArea(new Triangle(3.0, 4.0, 5.0));
    Triangle.printTriangleArea(new Triangle(2.0, 7.0, 6.0));


    var t = new Triangle(3.0, 4.0, 5.0);
    t.printTrianglePerimeter();
    new Triangle(5.0, 7.0, 9.0).printTrianglePerimeter();
    new Triangle(3.0, -5.0, 4.0).printTrianglePerimeter();

    Triangle.printTriangleArea(new Triangle(2.0, 3.0, 9.0));

    
  }


}
