public class Hello {
  public static void main(String[] args) {
    var x = 1;
    var y = 0;
    if (y == 0){
        System.out.println("Division by zero is not allowed");
    } else {
        var z = divide(x, y);
        System.out.println("Hello, world!");
    }

  }

  private static int divide(int a, int b) {
    var c = a / b;
    return c;
  }
}
