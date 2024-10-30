package parcial_2;

import utils.InputValidNumber;

import java.util.Random;

public class Problema3_act11 {
  private static int MAX_RANDOM_VALUE_TABLE = 100;

  private static int[][] generateTableOf(int rows, int columns) {
    Random random = new Random();
    int[][] table = new int[rows][columns];

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        table[i][j] = random.nextInt(MAX_RANDOM_VALUE_TABLE);
      }
    }

    return table;
  }

  private static int getMaxValueFromTable(int[][] table) {
    int maxValue = table[0][0];

    for (int[] row : table) {
      for (int value : row) {
        if (value > maxValue) maxValue = value;
      }
    }

    return maxValue;
  }

  private static void printTable(int[][] table) {
    System.out.println("--- TABLA ---");
    for (int[] row : table) {
      for (int value : row) {
        System.out.print(value + " ");
      }
      System.out.println();
    }
    System.out.println("-------------");
  }

  public static void main(String[] args) {
    System.out.println("[i] Ingresa los valores para generar una tabla y obtener el valor maximo.");

    System.out.print("Filas: ");
    int rows = InputValidNumber.typeInt();

    System.out.print("Columnas: ");
    int columns = InputValidNumber.typeInt();

    int[][] table = generateTableOf(rows, columns);
    printTable(table);

    int maxValue = getMaxValueFromTable(table);
    System.out.println("Valor maximo: " + maxValue);
  }
}
