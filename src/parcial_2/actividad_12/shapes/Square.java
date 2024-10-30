package parcial_2.actividad_12.shapes;

public class Square extends GeometricFigure {
  private double side;

  public Square(double side) {
    if (side <= 0) {
      throw new Error("Side length must be a positive value.");
    }
    this.side = side;
  }

  public double calculateArea() {
    return side * side;
  }

  public double calculatePerimeter() {
    return 4 * side;
  }

  public String getName() {
    return "Square";
  }
}


