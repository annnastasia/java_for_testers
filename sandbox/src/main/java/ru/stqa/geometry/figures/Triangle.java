package ru.stqa.geometry.figures;

import java.util.Objects;

public record Triangle (
        double a,
        double b,
        double c) {

  public Triangle {
    if(a < 0 || b < 0 || c < 0){
      throw new IllegalArgumentException("Triangle side should be non-negative");
    }
    if((a + b) < c || (b + c) < a || (a + c) < b){
      throw new IllegalArgumentException("Sum of two triangle side lengths should be more than third side");
    }
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Triangle triangle = (Triangle) o;
    return Double.compare(triangle.a, this.a) == 0 && Double.compare(triangle.b, this.b) == 0 && Double.compare(triangle.c, this.c) == 0 ||
            Double.compare(triangle.a, this.b) == 0 && Double.compare(triangle.b, this.c) == 0 && Double.compare(triangle.c, this.a) == 0 ||
            Double.compare(triangle.a, this.c) == 0 && Double.compare(triangle.b, this.a) == 0 && Double.compare(triangle.c, this.b) == 0 ||
            Double.compare(triangle.a, this.a) == 0 && Double.compare(triangle.b, this.c) == 0 && Double.compare(triangle.c, this.b) == 0 ||
            Double.compare(triangle.a, this.c) == 0 && Double.compare(triangle.b, this.b) == 0 && Double.compare(triangle.c, this.a) == 0 ||
            Double.compare(triangle.a, this.b) == 0 && Double.compare(triangle.b, this.a) == 0 && Double.compare(triangle.c, this.c) == 0;
  }

  @Override
  public int hashCode() {
    return 1;
  }
}
