package parcial_1.areaCalculator;

import parcial_1.calculator.Calculator;

public class AreaCalculator {
  public static double obtenerAreaCuadrado (double base, double altura) {
    return Calculator.multiplicar(base, altura);
  }

  public static double obtenerAreaTriangulo (double base, double altura) {
    return Calculator.dividir(Calculator.multiplicar(base, altura), 2);
  }
}
