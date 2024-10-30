package parcial_2;

import java.util.Random;

public class ArreglosBidimensionales {
  public static void main(String[] args) {
    Random random = new Random();

    final int TOTAL_COLUMNS = 4;
    final int TOTAL_ROWS = 3;

    int[][] array = new int[TOTAL_ROWS][TOTAL_COLUMNS];
    int[] columnSums = new int[TOTAL_COLUMNS];
    int[] rowSums = new int[TOTAL_ROWS];

    System.out.println("Arreglo 3 x 4");
    for (int i = 0; i < TOTAL_ROWS; i++) {
      for (int j = 0; j < TOTAL_COLUMNS; j++) {
        array[i][j] = random.nextInt(0, 5); // asignar valor random
        columnSums[j] += array[i][j]; // sumar columnas
        rowSums[i] += array[i][j]; // sumar filas
        System.out.print(" " + array[i][j]); // imprimir el arreglo
      }
      System.out.println();
    }

    // Impresion de datos
    System.out.println("Suma de las filas");
    for (int i = 0; i < TOTAL_ROWS; i++) {
      System.out.print(" " + rowSums[i]);
    }

    System.out.println();

    System.out.println("Suma de las columnas");
    for (int i = 0; i < TOTAL_COLUMNS; i++) {
      System.out.print(" " + columnSums[i]);
    }
  }
}
