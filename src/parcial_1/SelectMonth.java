package parcial_1;

import utils.Entrada;

public class SelectMonth {
    public static void main(String[] args) {
        System.out.println("Ingresa el numero del mes para obtener su estacion: ");
        int month = Entrada.entero();

        switch (month) {
            case 3, 4, 5:
                System.out.println("Primavera");
                break;
            case 6, 7, 8:
                System.out.println("Verano");
                break;
            case 9, 10, 11:
                System.out.println("Otoño");
                break;
            case 12, 1, 2:
                System.out.println("Invierno");
                break;
            default:
                System.out.println("Numero fuera de rango");
        }
    }
}
