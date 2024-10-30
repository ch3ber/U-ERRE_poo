package parcial_2;

import java.util.Random;

public class ArreglosBidimensionales1 {
  public static void main(String[] args) {
    Random random = new Random();

    final int TOTAL_FILAS = 3;
    final int TOTAL_COLUMNAS = 4;


    int[][] arrayUno = new int[TOTAL_FILAS][TOTAL_COLUMNAS];
    int[][] arrayDos = new int[TOTAL_FILAS][TOTAL_COLUMNAS];
    int[][] arraySuma = new int[TOTAL_FILAS][TOTAL_COLUMNAS];


    System.out.println("Primer Arreglo 3 x 4");
    for (int i = 0; i < TOTAL_FILAS; i++) {
      for (int j = 0; j < TOTAL_COLUMNAS; j++) {
        arrayUno[i][j] = random.nextInt(6); // asignar valor random del 0 al 5
        System.out.print(" " + arrayUno[i][j]); // imprimir el arreglo
      }
      System.out.println();
    }

    System.out.println("Segundo Arreglo 3 x 4");
    for (int i = 0; i < TOTAL_FILAS; i++) {
      for (int j = 0; j < TOTAL_COLUMNAS; j++) {
        arrayDos[i][j] = random.nextInt(6); // asignar valor random del 0 al 5
        System.out.print(" " + arrayDos[i][j]); // imprimir el arreglo
      }
      System.out.println();
    }

    // Impresion de datos
    System.out.println("Suma de los arreglos");
    for (int i = 0; i < TOTAL_FILAS; i++) {
      for (int j = 0; j < TOTAL_COLUMNAS; j++) {
        arraySuma[i][j] = (arrayUno[i][j])+(arrayDos[i][j]) ; // hace la suma de las matrices
        System.out.print(" " + arraySuma[i][j]); // imprimir el arreglo
      }
      System.out.println();
    }
  }
}
