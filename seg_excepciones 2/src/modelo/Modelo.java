package modelo;

import java.awt.Color;

import control.FiguraSinColorException;
import control.NoColorException;

public class Modelo {

	private Figura square;
	private Figura circle;
	private Color general;

	public Modelo() {
		
		square = new Figura(200, 200, null, false);
		circle = new Figura(650, 300, null, false);;
		this.general = null;
	}

	public Color getGeneral() {
		return general;
	}

	public void setGeneral(Color general) {
		this.general = general;
	}

	public Figura getSquare() {
		return square;
	}

	public void setSquare(Figura square) {
		this.square = square;
	}

	public Figura getCircle() {
		return circle;
	}

	public void setCircle(Figura circle) {
		this.circle = circle;
	}

	public void asignarColor(Figura figura) throws NoColorException {
		if (figura.isSelected()) {
			try {
				figura.setColor(this.general);
				general = null;
			} catch (Exception a) {
				throw new NoColorException("No se ha seleccionado un color." + a.getMessage());
			}
		}

	}

	public void compararColor() throws Exception {
		try {
			if (square.getColor().equals(circle.getColor()) ) {

			} else {
				throw new Exception("No son el mismo color");
			}
		} catch (FiguraSinColorException a) {
			throw new FiguraSinColorException("Hay una figura que no tiene color");
		}

	}

	public void limpiar() {
		square.setColor(null);
		square.setColor(null);
	}

}
