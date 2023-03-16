package com.cursoceat.model;

public class Perro extends Animal implements Sonido, Patas {

	protected String color;
	
	public Perro() {
		
	}

	public Perro(String nombre, double peso, String especie, String color) {
		super(nombre, peso, especie);
		this.color = color;
	}

	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void numPatas() {
	
		System.out.println("Tiene 4 patas");
	}

	@Override
	public void voz() {
		System.out.println("guau");
		
	}

	@Override
	public void timbre() {
		System.out.println("grave");
		
	}

	
	
	
}
