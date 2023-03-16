package com.cursoceat.model;

public class Gato extends Animal implements Sonido,Patas {

	
	private int numBigotes;
	private String color;




public Gato(String nombre, double peso, String especie, int numBigotes, String color) {
		super(nombre, peso, especie);
		this.numBigotes = numBigotes;
		this.color = color;
	}


public int getNumBigotes() {
	return numBigotes;
}


public void setNumBigotes(int numBigotes) {
	this.numBigotes = numBigotes;
}


public String getColor() {
	return color;
}


public void setColor(String color) {
	this.color = color;
}


@Override
public void numPatas() {
	System.out.println("Tiene cuatro patas");
	
}


@Override
public void voz() {
	System.out.println("miau");
	
}


@Override
public void timbre() {
	System.out.println("agudo");
	
}


@Override
public String toString() {
	super.toString();
	return "Gato [numero de bigotes=" + numBigotes + ", color=" + color + "]";
}
	
	
	
}
