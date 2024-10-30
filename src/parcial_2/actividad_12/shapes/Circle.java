package parcial_2.actividad_12.shapes;

public class Circle extends GeometricFigure {
  private double radius;

  public Circle(double radius) {
    if (radius <= 0) {
      throw new IllegalArgumentException("Radius must be a positive value.");
    }
    this.radius = radius;
  }

  public double calculateArea() {
    return Math.PI * radius * radius;
  }

  public double calculatePerimeter() {
    return 2 * Math.PI * radius;
  }

  public String getName() {
    return "Circle";
  }
}
