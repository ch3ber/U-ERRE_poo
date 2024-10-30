package utils;

public class AwaitAnyKey {
  public static void await() {
    System.out.println("\nPresiona cualquier tecla para continuar...");
    try {
      System.in.read();
    } catch (Exception e) {
      System.out.println("[ERROR] Error al esperar la entrada del usuario.");
    }
  }
}
