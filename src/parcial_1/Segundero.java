package parcial_1;

import utils.Entrada;

public class Segundero {
  public static void main(String[] args) {
    int limiteTiempo = Entrada.entero();

    for (int i = 1; i <= limiteTiempo; i++) {
      System.out.println(i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    }
  }
}
