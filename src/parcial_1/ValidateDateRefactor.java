package parcial_1;

import utils.Entrada;

public class ValidateDateRefactor {
  public static void main(String[] args) {
    System.out.println("Ingresa una fecha para ser validada.");
    System.out.print("Dia: ");
    int dia = Entrada.entero();
    System.out.print("Mes: ");
    int mes = Entrada.entero();
    System.out.print("Año: ");
    int anio = Entrada.entero();

    String msg = "correcta";

    switch (mes) {
      case 1, 3, 5, 7, 8, 10, 12:
        if (dia > 31) msg = "incorrecta";
        break;
      case 2:
        if (dia > 29) msg = "incorrecta";

        if (dia == 29) {
          msg = "incorrecta";
        }
        break;
      case 4, 6, 9, 11:
        if (dia > 30) msg = "incorrecta";
        break;
    }

    System.out.print("La fecha es " + msg);
  }

  private boolean validateDay (int day) {
    return day < 1 || day > 31;
  }

  private boolean isLeapYear (int year) {
    if (year % 4 == 0) return true;
    if (year % 4 == 0 && year % 100 != 0) return true;
    if (year % 100 == 0 && year % 400 != 0) return false;
    if (year % 100 == 0 && year % 400 == 0) return true;
    return false;
  }

  private boolean validateMonth (int month) {
    return month < 1 || month > 12;
  }

  private boolean validateYear (int year) {
    return year < 1;
  }
}
