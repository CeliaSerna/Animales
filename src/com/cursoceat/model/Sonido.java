package com.cursoceat.model;

public interface Sonido {

	int version=1;
	
public void voz();
	
public void timbre();

//se puede desarrollar un metodo dentro de la interfaz
	default void durmiendo() {
	System.out.println("ZZZZZzzzzz");
}
    static void bostezo() {
    String miAccion= accion();
    System.out.println(miAccion);
	System.out.println("auuuuu");
}
	private static String accion() {
		return "Bostezo";
	}
	
}
