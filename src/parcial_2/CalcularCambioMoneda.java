package parcial_2;

import utils.AwaitAnyKey;
import utils.ClearScreen;
import utils.InputValidNumber;

public class CalcularCambioMoneda {

  static double tipoDeCambio = 0;

  private static void cambioEnMonedas(double pesos) throws Exception {
    if (pesos <= 0) {
      throw new Exception("La cantidad de dinero debe ser mayor que 0.");
    }

    double dolares = pesos / tipoDeCambio;
    System.out.printf("Cantidad en pesos mexicanos: %.2f MXN\n", pesos);
    System.out.printf("Equivalente en dólares: %.2f USD\n", dolares);
  }

  private static void printMenu() {
    System.out.println("[i] Selecciona una opcion.");
    System.out.println("\t[1] Tipo de cambio.");
    System.out.println("\t[2] Dolares a Pesos.");
    System.out.println("\t[3] Pesos a Dolares.");
    System.out.println("\t[0] Salir.");
    System.out.print(">>> ");
  }

  public static void main(String[] args) {
    boolean mainThread = true;
    int option;

    while (mainThread) {
      ClearScreen.clear();
      printMenu();
      option = InputValidNumber.typeInt();

      switch (option) {
        case 0:
          mainThread = false;
          System.out.println("[*] Saliendo...");
          break;
        case 1:
          do {
            System.out.println("Introduce el tipo de cambio: ");
            double tipoDeCambio = InputValidNumber.typeDouble();
            if (tipoDeCambio < 0) {
              System.out.println("[ERROR] La mejor marca debe ser un valor positivo.");
            }
          } while (tipoDeCambio < 0);
          break;
        case 2:
          if (tipoDeCambio > 0) {
            System.out.println("[ERROR] El tipo de cambio aun no ha sido establecido.");
            break;
          }
          break;
        case 3:
          break;
        default:
          System.out.println("[ERROR] Opcion no encontrada.");
          AwaitAnyKey.await();
      }
    }

    try {
      System.out.println("Introduce la cantidad en pesos mexicanos: ");
      double pesos = InputValidNumber.typeDouble();
      cambioEnMonedas(pesos);
    } catch (Exception e) {
      System.out.println("[ERROR]: " + e.getMessage());
    }
  }
}
