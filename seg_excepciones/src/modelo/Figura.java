package modelo;

import java.awt.Color;

public class Figura {
	
	//propiedades, add width y height?
	private int posX;
	private int posY;
	private Color color;
	private boolean selected;
	
	
	public Figura(int posX, int posY, Color color, boolean selected) {
		super();
		this.posX = posX;
		this.posY = posY;
		this.color = color;
		this.selected = selected;
	}
	
	


	public int getPosX() {
		return posX;
	}


	public void setPosX(int posX) {
		this.posX = posX;
	}


	public int getPosY() {
		return posY;
	}


	public void setPosY(int posY) {
		this.posY = posY;
	}


	public Color getColor() {
		return color;
	}


	public void setColor(Color color) {
		this.color = color;
	}


	public boolean isSelected() {
		return selected;
	}


	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	
	
	
}