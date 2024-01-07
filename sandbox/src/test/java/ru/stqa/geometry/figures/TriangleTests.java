package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {

  @Test
  void canCalculatePerimeter(){
    var t = new Triangle(3.0, 4.0, 5.0);
    double result = t.perimeter();
    Assertions.assertEquals(12.0, result);
  }

  @Test
  void canCalculateHalfperimetr(){
    var t = new Triangle(5.0, 7.0, 9.0);
    double result = t.halfperimetr();
    Assertions.assertEquals(10.5, result);
  }

  @Test
  void canCalculateArea(){
    Assertions.assertEquals(6.0, new Triangle(3.0, 4.0, 5.0).area());
  }

  @Test
  void cannotCreateTriangleWithNegativeSideA() {
    try {
      new Triangle(-5.0, 1.0, 2.0);
      Assertions.fail();
    }catch(IllegalArgumentException exception) {
      //OK
    }
  }

  @Test
  void cannotCreateTriangleWithNegativeSideBC() {
    try {
      new Triangle(5.0, -3.0, 4.0);
      Assertions.fail();
    }catch(IllegalArgumentException exception) {
      //OK
    }
    try {
      new Triangle(3.0, 3.0, -2.0);
      Assertions.fail();
    }catch(IllegalArgumentException exception) {
      //OK
    }
  }

  @Test
  void cannotCreateTriangleWithSmallSideAB(){
    try {
      new Triangle(1.0, 2.0, 5.0);
      Assertions.fail();
    }catch(IllegalArgumentException exception) {
      //OK
    }
  }

  @Test
  void cannotCreateTriangleWithSmallSideBC(){
    try {
      new Triangle(7.0, 1.0, 4.0);
      Assertions.fail();
    }catch(IllegalArgumentException exception) {
      //OK
    }
  }

  @Test
  void cannotCreateTriangleWithSmallSideAC(){
    try {
      new Triangle(50.0, 96.0, 45.0);
      Assertions.fail();
    }catch(IllegalArgumentException exception) {
      //OK
    }
  }

}
