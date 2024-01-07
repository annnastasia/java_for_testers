package ru.stqa.geometry.figures;

public class Triangle {
  private double a;
  private double b;
  private double c;

  public Triangle (double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public static void printTriangleArea(Triangle t) {
    String text = String.format("Площадь треугольника со сторонами %f и %f и %f = %f", t.a, t.b, t.c, t.area());
    System.out.println(text);
  }

  public void printTrianglePerimeter() {
    String text = String.format("Периметр треугольника со сторонами %f и %f и %f = %f", this.a, this.b, this.c, perimeter());
    System.out.println(text);
  }

public double perimeter(){
    return this.a + this.b + this.c;
}

public double halfperimetr(){
    return perimeter() / 2;
}

public double area(){
    return Math.sqrt(halfperimetr() * ( halfperimetr() - this.a) * (halfperimetr() - this.b) * (halfperimetr() - this.c));
}

}
