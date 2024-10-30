package parcial_1;

import utils.Entrada;

public class ValidateDate {
    public static void main(String[] args) {
    System.out.println("Ingresa una fecha para ser validada.");
    System.out.print("Dia: ");
    int dia = Entrada.entero();
    System.out.print("Mes: ");
    int mes = Entrada.entero();
    System.out.print("Año: ");
    int anio = Entrada.entero();

    String msg = "correcta";

    if (anio < 1) msg = "incorrecta";
    if (mes < 1 || mes > 12) msg = "incorrecta";
    if (dia < 1 || dia > 31) msg = "incorrecta";

    switch (mes) {
      case 1, 3, 5, 7, 8, 10, 12:
        if (dia > 31) msg = "incorrecta";
        break;
      case 2:
        if (dia > 29) msg = "incorrecta";

        if (dia == 29) {
          msg = "incorrecta";
          if (anio % 4 == 0) msg = "correcta";
          if (anio % 4 == 0 && anio % 100 != 0) msg = "correcta";
          if (anio % 100 == 0 && anio % 400 != 0) msg = "incorrecta";
          if (anio % 100 == 0 && anio % 400 == 0) msg = "correcta";
        }
        break;
      case 4, 6, 9, 11:
        if (dia > 30) msg = "incorrecta";
        break;
    }

    System.out.print("La fecha es " + msg + ".");
  }
}
