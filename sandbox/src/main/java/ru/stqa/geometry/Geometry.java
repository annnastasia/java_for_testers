package ru.stqa.geometry;

import ru.stqa.geometry.figures.Rectangle;
import ru.stqa.geometry.figures.Square;

public class Geometry {
  public static void main(String[] args) {
    Square.printSquareArea(new Square(7.));
    Square.printSquareArea(new Square(3.0));
    Square.printSquareArea(new Square(5));

    Rectangle.printRectangleArea(3.0, 5.0);
    Rectangle.printRectangleArea(2.0, 8.0);
    
  }


}
