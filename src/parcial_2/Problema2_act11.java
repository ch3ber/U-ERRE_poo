package parcial_2;

import utils.InputValidNumber;

public class Problema2_act11 {
  private static void printRangeNumbers(int num1, int num2) {
    if (num1 == num2) {
      System.out.println("Rango de numeros: ");
      System.out.println(num1);
      return;
    }

    System.out.println("Rango de numeros: ");
    if (num1 < num2) {
      for (int i = num1; i <= num2; i++) {
        System.out.print(i + " ");
      }
      return;
    }

    for (int i = num2; i <= num1; i++) {
      System.out.print(i + " ");
    }
  }
  public static void main(String[] args) {
    System.out.println("[i] Ingresa dos numeros enteros para mostrar todos los enteros entre ellos.");

    System.out.print("Numero 1: ");
    int num1 = InputValidNumber.typeInt();

    System.out.print("Numero 2: ");
    int num2 = InputValidNumber.typeInt();

    printRangeNumbers(num1, num2);
  }
}
