package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {

  @Test
  void canCalculatePerimeter(){
    var t = new Triangle(3.0, 4.0, 5.0);
    Assertions.assertEquals(12.0, t.perimeter());
  }

  @Test
  void canCalculateArea(){
    var t = new Triangle(3.0, 4.0, 5.0);
    Assertions.assertEquals(6.0, t.area());
  }

}
