package parcial_2;

import utils.Entrada;

class CalculadoraBasica {

  public static void realizarOperacion(int operacion, double num1, double num2) throws Exception {
    switch (operacion) {
      case 1:
        System.out.println("Resultado: " + (num1 + num2));
        break;
      case 2:
        System.out.println("Resultado: " + (num1 - num2));
        break;
      case 3:
        System.out.println("Resultado: " + (num1 * num2));
        break;
      case 4:
        if (num2 == 0) {
          throw new ArithmeticException("División por cero no permitida.");
        }
        System.out.println("Resultado: " + (num1 / num2));
        break;
      default:
        System.out.println("Operación no válida.");
    }
  }

  public static void main(String[] args) {
    boolean continuar = true;

    while (continuar) {
      try {
        System.out.println("Calculadora Básica:");
        System.out.println("\t[1]. Suma");
        System.out.println("\t[2]. Resta");
        System.out.println("\t[3]. Multiplicación");
        System.out.println("\t[4]. División");
        System.out.println("Seleccione una operación: ");
        int operacion = Entrada.entero();

        System.out.println("Ingrese el primer número: ");
        double num1 = Entrada.real();
        if (Math.abs(num1) > 99999) {
          throw new Exception("Los números no pueden tener más de 5 dígitos.");
        }

        System.out.println("Ingrese el segundo número: ");
        double num2 = Entrada.real();
        if (Math.abs(num2) > 99999) {
          throw new Exception("Los números no pueden tener más de 5 dígitos.");
        }

        realizarOperacion(operacion, num1, num2);

        System.out.println("¿Desea realizar otra operación? (s/n): ");
        char respuesta = Entrada.caracter();
        if (respuesta != 's' && respuesta != 'S') {
          continuar = false;
        }

        // Limpiar pantalla (simulación)
        System.out.print("\033[H\033[2J");
        System.out.flush();

      } catch (Exception e) {
        System.out.println("[ERROR]: " + e.getMessage());
      }
    }
  }
}
