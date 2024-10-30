package parcial_2;

import utils.Entrada;

import utils.AwaitAnyKey;
import utils.ClearScreen;
import utils.InputValidNumber;

import java.util.Arrays;
import java.util.Comparator;

public class GestionarParticipantes {
  final static int TOTAL_PLACES = 10;
  final static int LAST_SCORE_YEAR = 2002;
  static Competitor[] competitors = new Competitor[0];

  private static void insertLastCompetitor(String name, double bestScore2002, double bestScore2001, double bestScore2000) {
    if (competitors.length >= TOTAL_PLACES) {
      System.out.println("[i] Cupo maximo alcanzado.");
      System.out.println("\tEl espacio limite es de " + TOTAL_PLACES + ".");
      return;
    }

    // Crear un nuevo arreglo con tamaño aumentado en 1
    Competitor[] competitorsCopy = Arrays.copyOf(competitors, competitors.length + 1);
    // Asignar el nuevo elemento a la última posición
    competitorsCopy[competitors.length] = new Competitor(competitors.length + 1, name, bestScore2002, bestScore2001, bestScore2000);
    // asignar el nuevo arreglo con tamaño aumentado en el arreglo original
    competitors = competitorsCopy;
  }

  private static void getData() {
    ClearScreen.clear();
    System.out.println("[i] Ingresa los siguientes datos:");
    System.out.print("\tNombre del competidor: ");
    try {
      String name = Entrada.cadena();

      double bestScore2002 = getBestScore("2002");
      double bestScore2001 = getBestScore("2001");
      double bestScore2000 = getBestScore("2000");

      insertLastCompetitor(name, bestScore2002, bestScore2001, bestScore2000);
    } catch (Exception e) {
      System.out.println("[ERROR] Tipo de valor ingresado incorrecto.");
    }
  }

  private static double getBestScore(String year) {
    double bestScore;
    do {
      System.out.print("\tMejor marca del " + year + " (en mts): ");
      bestScore = InputValidNumber.typeDouble();
      if (bestScore < 0) {
        System.out.println("[ERROR] La mejor marca debe ser un valor positivo.");
      }
    } while (bestScore < 0);
    return bestScore;
  }

  private static void showCompetitors() {
    ClearScreen.clear();
    System.out.println("--- COMPETIDORES ---");
    if (competitors.length == 0) {
      System.out.println("[i] No hay competidores registrados.");
    } else {
      for (Competitor competitor : competitors) {
        competitor.showFullInfo();
        System.out.println("--------------------");
      }
    }
    AwaitAnyKey.await();
  }

  private static void showLastScore(int year) {
    ClearScreen.clear();
    System.out.println("--- MEJORES MARCAS " + LAST_SCORE_YEAR + " ---");
    if (competitors.length == 0) {
      System.out.println("[i] No hay competidores registrados.");
    } else {
      // Ordenar competidores por la mejor marca del año especificado, de mayor a menor
      Competitor[] sortedCompetitors = Arrays.copyOf(competitors, competitors.length);
      Arrays.sort(sortedCompetitors, Comparator.comparingDouble(competitor -> -competitor.bestScore2002));
      for (Competitor competitor : sortedCompetitors) {
        competitor.showLastScore();
        System.out.println("------------------------");
      }
    }
    AwaitAnyKey.await();
  }

  private static Competitor findCompetitor(int idCompetitor) {
    for (Competitor competitor : competitors) {
      if (competitor.id == idCompetitor) return competitor;
    }
    return null;
  }

  private static void printMenu() {
    System.out.println("[i] Selecciona una opcion.");
    System.out.println("\t[1] Inscribir un participante.");
    System.out.println("\t[2] Mostrar un listado de datos.");
    System.out.println("\t[3] Mostrar el listado por marcas en (mts).");
    System.out.println("\t[4] Buscar participante por dorsal.");
    System.out.println("\t[0] Salir.");
    System.out.print(">>> ");
  }

  public static void main(String[] args) {
    boolean mainThread = true;
    int option;

    while (mainThread) {
      ClearScreen.clear();
      printMenu();
      option = InputValidNumber.typeInt();

      switch (option) {
        case 0:
          System.out.println("[*] Saliendo...");
          mainThread = false;
          break;
        case 1:
          getData();
          break;
        case 2:
          showCompetitors();
          break;
        case 3:
          showLastScore(LAST_SCORE_YEAR);
          break;
        case 4:
          System.out.print("Ingresa el id del competidor: ");
          int competitorId = InputValidNumber.typeInt();
          Competitor competitor = findCompetitor(competitorId);

          if (competitor == null) {
            System.out.println("[ERROR] Competidor no encontrado.");
          } else {
            competitor.showFullInfo();
          }
          AwaitAnyKey.await();
          break;
        default:
          System.out.println("[ERROR] Opcion no encontrada.");
          AwaitAnyKey.await();
      }
    }
  }
}
