package parcial_2;

public class Competitor {
  int id;
  String name;
  double bestScore2002 = 0;
  double bestScore2001 = 0;
  double bestScore2000 = 0;

  public Competitor(int id, String name, double bestScore2002, double bestScore2001, double bestScore2000) {
    this.id = id;
    this.name = name;
    this.bestScore2002 = bestScore2002;
    this.bestScore2001 = bestScore2001;
    this.bestScore2000 = bestScore2000;
  }

  public void showFullInfo () {
    System.out.println("[+] ID: " + this.id);
    System.out.println("\t[-] Nombre: " + this.name);
    System.out.println("\t[-] Mejor marca 2002: " + this.bestScore2002);
    System.out.println("\t[-] Mejor marca 2001: " + this.bestScore2001);
    System.out.println("\t[-] Mejor marca 2000: " + this.bestScore2000);
  }

  public void showLastScore () {
    System.out.println("[+] Nombre: " + this.name);
    System.out.println("[+] Mejor marca 2002: " + this.bestScore2002);
  }
}
