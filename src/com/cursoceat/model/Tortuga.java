package com.cursoceat.model;

public class Tortuga extends Animal implements Patas {

	private String tipoCaparazon;

	public Tortuga() {
	
		
	}

	public Tortuga(String nombre, double peso, String especie) {
		super(nombre, peso, especie);

	}

	public String getTipoCaparazon() {
		return tipoCaparazon;
	}

	public void setTipoCaparazon(String tipoCaparazon) {
		this.tipoCaparazon = tipoCaparazon;
	}

	@Override
	public void numPatas() {
		// TODO Auto-generated method stub
		
	}

	
	

}
