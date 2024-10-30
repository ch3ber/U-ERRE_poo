package parcial_1.calculator;

public class Calculator {
  public static double sumar (double x, double y) {
    return x + y;
  }

  public static double restar (double x, double y) {
    return x - y;
  }

  public static double multiplicar (double x, double y) {
    return x * y;
  }

  public static double dividir (double x, double y) throws ArithmeticException {
    try {
      return x / y;
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
