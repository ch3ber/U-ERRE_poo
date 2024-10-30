package parcial_2;

import utils.Entrada;

class CalculadoraCambio {
  private double tipoDeCambio;

  public CalculadoraCambio(double tipoDeCambio) {
    this.tipoDeCambio = tipoDeCambio;
  }

  public void cambioEnMonedas(double pesos) throws Exception {
    if (pesos <= 0) {
      throw new Exception("La cantidad de dinero debe ser mayor que 0.");
    }

    double dolares = pesos / tipoDeCambio;
    System.out.printf("Cantidad en pesos mexicanos: %.2f MXN\n", pesos);
    System.out.printf("Equivalente en dólares: %.2f USD\n", dolares);
  }

 public static void main(String[] args) {
    System.out.println("Introduce el tipo de cambio de MXN a USD: ");
    double tipoDeCambio = Entrada.real();

    CalculadoraCambio calculadora = new CalculadoraCambio(tipoDeCambio);

    try {
      System.out.println("Introduce la cantidad en pesos mexicanos: ");
      double pesos = Entrada.real();
      calculadora.cambioEnMonedas(pesos);
    } catch (Exception e) {
      System.out.println("[ERROR]: " + e.getMessage());
    }
  }
}
