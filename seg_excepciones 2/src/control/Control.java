package control;

import java.awt.Color;

import modelo.Figura;
import modelo.Modelo;

public class Control {
	
	private Modelo modelo;
	
	public Control() {
		 modelo = new Modelo();
	}
	
	public void controlCompararColor() throws Exception {
		modelo.compararColor();
	}
	
	public void controlAsignarColor(Figura figura) throws NoColorException {
		modelo.asignarColor(figura);
	}
	
	
	public void controlLimpiar() {
		modelo.limpiar();
	}
	
	public Figura controlGetSquare() {
		return modelo.getSquare();
	}
	
	public void controlSetGeneral(Color c) {
		modelo.setGeneral(c);
	}
	
	public Color controlGetGeneral() {
		return modelo.getGeneral();
	}

	public void controlSetSquare(Figura square) {
		modelo.setSquare(square);
	}

	public Figura controlGetCircle() {
		return modelo.getCircle();
	}

	public void setCircle(Figura circle) {
		modelo.setCircle(circle);
	}
}
