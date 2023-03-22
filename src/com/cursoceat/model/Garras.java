package com.cursoceat.model;

public interface Garras extends Patas{

	void largo();
	
	default void mensaje() {
		System.out.println("Las garras deben cortarse una vez al mes");
		
	}
	
	
}
