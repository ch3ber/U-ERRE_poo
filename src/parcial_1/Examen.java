package parcial_1;

import utils.Entrada;

public class Examen {
  public static void main(String[] args) {
    int totalProducts = 0;
    boolean isUserActive = true;
    double productPrice = 0;
    double total = 0;
    String providerName = null;

    while (isUserActive) {
      System.out.println("Ingresa el nombre del proveedor: ");
      providerName = Entrada.cadena();
      System.out.println("Ingresa el numero de productos a capturar: ");
      totalProducts = Entrada.entero();

      while (totalProducts > 0) {
        System.out.println("Ingresa el precio sin IVA del producto: ");
        productPrice = Entrada.real();

        if (productPrice < 0) {
          do {
            productPrice = Entrada.real();
          } while (productPrice < 0);
        }

        total += productPrice;
        totalProducts -= 1;

      }

      double totalIVA = total * 1.16;
      System.out.println("El pago a efectuar de " + providerName + " es de " + totalIVA);
      System.out.println("Deseas continuar? 1 = si, 0 = no: ");
      int isNext = Entrada.entero();
      isUserActive = false;
    }
  }
}

