package  figuras;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;

public class FigurasController implements Initializable {

	@FXML
	private Line linea1;
	@FXML
	private Line linea2;
	@FXML
	private Line linea3;
	@FXML
	private ComboBox<String> colorLinea1;
	@FXML
	private ComboBox<String> colorLinea2;
	@FXML
	private ComboBox<String> colorLinea3;
	@FXML
	private Button ampliarLinea1;
	@FXML
	private Button ampliarLinea2;
	@FXML
	private Button ampliarLinea3;
	@FXML
	private Button reducirLinea1;
	@FXML
	private Button reducirLinea2;
	@FXML
	private Button reducirLinea3;
	@FXML
	private Button Rotar;
	@FXML
	private Button aumentarOpacidad;
	@FXML
	private Button reducirOpacidad;
	
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// Agregar los colores al ComboBox
		colorLinea1.getItems().addAll("Rojo", "Verde", "Azul");
		// Agregar los colores al ComboBox
		colorLinea2.getItems().addAll("Rojo", "Verde", "Azul");
		// Agregar los colores al ComboBox
		colorLinea3.getItems().addAll("Rojo", "Verde", "Azul");
		
	}	
	
	
	@FXML
	private void cambiarColor1() {
		String colorSeleccionado = colorLinea1.getValue();
		cambiarColorGenerico(colorSeleccionado, linea1);
	}
	
	@FXML
	private void cambiarColor2() {
		String colorSeleccionado = colorLinea2.getValue();
		cambiarColorGenerico(colorSeleccionado, linea2);
	}
	@FXML
	private void cambiarColor3() {
		String colorSeleccionado = colorLinea3.getValue();
		cambiarColorGenerico(colorSeleccionado, linea3);
	}
	
	private void cambiarColorGenerico(String color, Line linea) {
		if (color.equals("Rojo")) {
			linea.setStroke(Color.RED);
		}
		else if (color.equals("Azul")) {
			linea.setStroke(Color.BLUE);
		}
		else if (color.equals("Verde")) {
			linea.setStroke(Color.GREEN);
		}
	}

	@FXML
	private void ampliarLinea1() {
		Double tamaño = linea1.getStrokeWidth();
		if (tamaño < 10) {
			linea1.setStrokeWidth(tamaño + 1);
		}
		
	}
	
	@FXML
	private void reducirLinea1() {
		Double tamaño = linea1.getStrokeWidth();
		if (tamaño > 1) {
			linea1.setStrokeWidth(tamaño - 1);}
		}
		
	@FXML
	private void ampliarLinea2() {
		Double tamaño = linea2.getStrokeWidth();
			if (tamaño < 10) {
				linea2.setStrokeWidth(tamaño + 1);
			}
			
		}
		
	@FXML
	private void reducirLinea2() {
		Double tamaño = linea2.getStrokeWidth();
			if (tamaño > 1) {
				linea2.setStrokeWidth(tamaño - 1);}
			}
			
	@FXML
	private void ampliarLinea3() {
		Double tamaño = linea3.getStrokeWidth();
				if (tamaño < 10) {
					linea3.setStrokeWidth(tamaño + 1);
				}
				
			}
			
	@FXML
	private void reducirLinea3() {
		Double tamaño = linea3.getStrokeWidth();
				if (tamaño > 1) {
					linea3.setStrokeWidth(tamaño - 1);
				}
		
	}
	
	 @FXML
	    private Rectangle rectangulo;
	 
	 
	 @FXML
	    private Polygon triangulo;
	 
	 @FXML
	    private Polygon pentagono;
	
    @FXML
	    private void rotarFiguras() {
	        
    	double centerXrectangulo = rectangulo.getX() + rectangulo.getWidth() / 2;
        double centerYrectangulo = rectangulo.getY() + rectangulo.getHeight() / 2;
        
        Rotate rotarRectangulo = new Rotate(-90, centerXrectangulo, centerYrectangulo);
        rectangulo.getTransforms().add(rotarRectangulo);

        double[] trianguloPoints = triangulo.getPoints().stream().mapToDouble(p -> p).toArray();
        double centerXTriangulo= (trianguloPoints[0] + trianguloPoints[2] + trianguloPoints[4]) / 3;
        double centerYTriangulo = (trianguloPoints[1] + trianguloPoints[3] + trianguloPoints[5]) / 3;

        Rotate rotarTriangulo = new Rotate(-90, centerXTriangulo, centerYTriangulo);
        triangulo.getTransforms().add(rotarTriangulo);
        
        Rotate rotarPentagono = new Rotate(90, pentagono.getLayoutBounds().getMinX() + pentagono.getLayoutBounds().getWidth() / 2, 
        pentagono.getLayoutBounds().getMinY() + pentagono.getLayoutBounds().getHeight() / 2);
        pentagono.getTransforms().add(rotarPentagono);
    
    
}
    @FXML
    private void aumentarOpacidad() {
        triangulo.setOpacity(Math.min(1.0, triangulo.getOpacity() + 0.1));
        rectangulo.setOpacity(Math.min(1.0, rectangulo.getOpacity() + 0.1));
        pentagono.setOpacity(Math.min(1.0, pentagono.getOpacity() + 0.1));
    }

    @FXML
    private void reducirOpacidad() {        
        triangulo.setOpacity(Math.max(0.0, triangulo.getOpacity() - 0.1));
        rectangulo.setOpacity(Math.max(0.0, rectangulo.getOpacity() - 0.1));
        pentagono.setOpacity(Math.max(0.0, pentagono.getOpacity() - 0.1));
    }
		
	
	
}
