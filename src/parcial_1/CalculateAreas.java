package parcial_1;

import parcial_1.areaCalculator.AreaCalculator;
import utils.Entrada;

public class CalculateAreas {
  public static void main(String[] args) {
    double base = 0.0;
    double altura = 0.0;

    System.out.print("Ingresa la base de un cuadrado: ");
    base = Entrada.real();
    System.out.println("El area del cuadrado con lado " + base + " es: " + AreaCalculator.obtenerAreaCuadrado(base, base));

    System.out.print("Ingresa la base de un triangulo: ");
    base = Entrada.real();
    System.out.print("Ingresa la altura de un triangulo: ");
    altura = Entrada.real();
    System.out.println("El area del traingulo con base " + base + " y altura " + altura + " es: " + AreaCalculator.obtenerAreaTriangulo(base, altura));
  }
}
