package vista;

import java.awt.Color;

import control.Control;
import control.NoColorException;
import modelo.Figura;
import processing.core.PApplet;

public class Vista extends PApplet {

	private Control control;
	Figura sq;
	Figura cir;
	Color col;

	public static void main(String[] args) {
		PApplet.main(Vista.class.getName());

	}

	// arraylist de cuadrados para la color bar

	// intancia de cuadrado y círculo para las figuras

	public void settings() {
		size(1000, 800);
		control = new Control();

	}

	public void setup() {
		sq = control.controlGetSquare();
		// inicializar arraylist color bar y las figuras
		cir = control.controlGetCircle();
		// for para agregar un cuadrado al arraylist de cuadrados

	}

	public void draw() {

		background(255);

		fill(0);
		textSize(30);
		text("COMPARAR", 250, 700);
		text("LIMPIAR", 625, 700);
		text(mouseX + "," + mouseY, mouseX, mouseY);

		if (sq.getColor() == null) {
			fill(255);
			square(sq.getPosX(), sq.getPosY(), 200);
		} else {
			fill(sq.getColor().getRed(), sq.getColor().getGreen(), sq.getColor().getBlue());
			square(sq.getPosX(), sq.getPosY(), 200);
		}

		if (cir.getColor() == null) {
			fill(255);
			circle(cir.getPosX(), cir.getPosY(), 200);
		} else {
			fill(cir.getColor().getRed(), cir.getColor().getGreen(), cir.getColor().getBlue());
			square(cir.getPosX(), cir.getPosY(), 200);
		}

		for (int i = 0; i < 10; i++) {
			if (i == 9) {
				fill(255, 50, 50);
			} else if (i == 8) {
				fill(50, 250, 150);
			} else {
				fill(i * 30, 50, 50 * i / 2);
			}

			square(250 + i * 50, 550, 50);
		}

	}

	public void mouseClicked() {
		if (mouseX > 200 && mouseX < 400 && mouseY > 300 && mouseX < 600) {
			if (sq.isSelected()) {
				control.controlSetGeneral(col);
				try {
					control.controlAsignarColor(sq);
				} catch (NoColorException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("No hay color xd");
				}
			} else {
				sq.setSelected(true);
			}
		}

		if (mouseX > 650 && mouseX < 850 && mouseY > 300 && mouseX < 500) {
			if (cir.isSelected()) {
				control.controlSetGeneral(col);
				try {
					control.controlAsignarColor(cir);
				} catch (NoColorException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("No hay color ");
				}
			} else {
				cir.setSelected(true);
			}
		}
		if (mouseX > 250 && mouseX < 300 && mouseY > 550 && mouseX < 600) {
			col = new Color(0, 50, 0);
		}

		if (mouseX > 300 && mouseX < 350 && mouseY > 550 && mouseX < 600) {
			col = new Color(30, 50, 50);
		}

		if (mouseX > 350 && mouseX < 400 && mouseY > 550 && mouseX < 600) {
			col = new Color(60, 50, 50);
		}

		if (mouseX > 400 && mouseX < 450 && mouseY > 550 && mouseX < 600) {
			col = new Color(90, 50, 75);
		}

		if (mouseX > 450 && mouseX < 500 && mouseY > 550 && mouseX < 600) {
			col = new Color(120, 50, 100);
		}

		if (mouseX > 500 && mouseX < 550 && mouseY > 550 && mouseX < 600) {
			col = new Color(150, 50, 125);
		}

		if (mouseX > 550 && mouseX < 600 && mouseY > 550 && mouseX < 600) {
			col = new Color(180, 50, 150);
		}

		if (mouseX > 600 && mouseX < 650 && mouseY > 550 && mouseX < 600) {
			col = new Color(220, 50, 175);
		}

		if (mouseX > 650 && mouseX < 700 && mouseY > 550 && mouseX < 600) {
			col = new Color(50, 250, 150);
		}

		if (mouseX > 700 && mouseX < 750 && mouseY > 550 && mouseX < 600) {
			col = new Color(255, 50, 50);
		}
		if (mouseX > 250 && mouseX < 420 && mouseY > 667 && mouseY < 705) {
             try {
				control.controlCompararColor();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println(" no se pueden compara xq no hay colores");
			}
		}
		if (mouseX > 625 && mouseX < 740 && mouseY > 667 && mouseY < 705) {
             control.controlLimpiar();
		}
	}

}
