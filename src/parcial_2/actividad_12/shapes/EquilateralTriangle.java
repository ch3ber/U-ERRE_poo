package parcial_2.actividad_12.shapes;

public class EquilateralTriangle extends GeometricFigure {
  private double side;

  public EquilateralTriangle(double side) {
    if (side <= 0) {
      throw new IllegalArgumentException("Side length must be a positive value.");
    }
    this.side = side;
  }

  public double calculateArea() {
    return (Math.sqrt(3) / 4) * side * side;
  }

  public double calculatePerimeter() {
    return 3 * side;
  }

  public String getName() {
    return "Equilateral Triangle";
  }
}
