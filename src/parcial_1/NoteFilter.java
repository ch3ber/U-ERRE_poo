package parcial_1;

import utils.Entrada;

public class NoteFilter {
    public void getNote () {
        System.out.println("Introduce una nota para ser calificada (entre 0 y 10): ");
        int note;
        note = Entrada.entero();

        boolean isInsufficient = note >= 0 && note < 5;
        boolean isEnough = note == 5;
        boolean isGood = note >= 6;
        boolean isExcelent = note > 6 && note <= 10;

        if (isInsufficient) {
            System.out.println("Es insuficiente");
            return;
        }
        if (isEnough) {
            System.out.println("Es insuficiente");
            return;
        }
        if (isGood) {
            System.out.println("Es insuficiente");
            return;
        }
        if (isExcelent) {
            System.out.println("Es insuficiente");
            return;
        }
    }
}
