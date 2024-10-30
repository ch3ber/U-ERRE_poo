package parcial_2.actividad_12;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import parcial_2.actividad_12.shapes.*;

/**
 * Realizar un programa donde realice el calculo del Área y Perimetro, aplicar herencia y polimorfismo.
 * La clase padre debe ser FiguraGeomtetrica, siguiendo por las subclases de las figuras Cuadrado,
 * Cirulo y Triangulo equilatero.
 *
 * Debe aplicar Excepciones  y la clase Swing
 * Debe haber un menú donde muestre las opciones para mostrar las figuras, para despues mostrar su área y perímetro
 * Debe aplicar abstracción
 */
public class Main {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Geometric Figure Calculator");
    frame.setSize(400, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);

    JLabel label = new JLabel("Select a figure:");
    label.setBounds(50, 30, 200, 30);
    frame.add(label);

    String[] options = {"Square", "Circle", "Equilateral Triangle"};
    JComboBox<String> comboFigures = new JComboBox<>(options);
    comboFigures.setBounds(50, 70, 150, 30);
    frame.add(comboFigures);

    JButton calculateButton = new JButton("Calculate Area and Perimeter");
    calculateButton.setBounds(50, 120, 200, 30);
    frame.add(calculateButton);

    JTextArea resultArea = new JTextArea();
    resultArea.setBounds(50, 160, 300, 100);
    resultArea.setEditable(false);
    frame.add(resultArea);

    calculateButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String selection = (String) comboFigures.getSelectedItem();
        try {
          GeometricFigure figure = null;
          double value = Double.parseDouble(JOptionPane.showInputDialog("Enter the measurement (side or radius)"));

          switch (selection) {
            case "Square":
              figure = new Square(value);
              break;
            case "Circle":
              figure = new Circle(value);
              break;
            case "Equilateral Triangle":
              figure = new EquilateralTriangle(value);
              break;
          }

          if (figure != null) {
            String result = figure.getName() + ":\n" +
                "Area: " + figure.calculateArea() + "\n" +
                "Perimeter: " + figure.calculatePerimeter();
            resultArea.setText(result);
          }
        } catch (NumberFormatException ex) {
          JOptionPane.showMessageDialog(frame, "Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException ex) {
          JOptionPane.showMessageDialog(frame, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
      }
    });

    frame.setVisible(true);
  }
}
