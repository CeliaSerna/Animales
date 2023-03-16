package com.cursoceat.model;

public class Delfin extends Animal implements Sonido{

private double longAletas;

public Delfin() {

	}

public Delfin(double longAletas, String nombre, double peso, String especie) {
    
super(nombre, peso, especie);
 this.longAletas = longAletas;
}

public double getLongAletas() {
	return longAletas;
}

public void setLongAletas(double longAletas) {
	this.longAletas = longAletas;
}



@Override
public String toString() {
	return "Delfin [longAletas=" + longAletas + ", nombre=" + nombre + ", peso=" + peso + ", especie=" + especie
			+ ", idTemp=" + idTemp + "]";
}

@Override
public void voz() {
	System.out.println("eeeeee");
	
}

@Override
public void timbre() {
System.out.println("agudo");
	
}






}
