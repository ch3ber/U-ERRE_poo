package parcial_1;

import utils.Entrada;

public class PositivoNegativo {

    public static void main(String[] args) {
        Entrada entrada = new Entrada();
        int num;
        System.out.print("Introduce un número: ");
        num = Entrada.entero();
        if( num < 0)
            System.out.println("Negativo");
        else
            // suponemos que el 0 es positivo.
            System.out.println("Positivo");
    }
}
