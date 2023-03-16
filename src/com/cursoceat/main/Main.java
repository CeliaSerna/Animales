package com.cursoceat.main;

import com.cursoceat.model.Delfin;
import com.cursoceat.model.Gato;
import com.cursoceat.model.Tortuga;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Delfin miDelfin = new Delfin(20,"Wally", 800,"Blanca");
	System.out.println(miDelfin.toString());
		
	Gato miGato = new Gato("Sape", 15,"pardo", 12,"gris");
	System.out.println(miGato.toString());	
	miGato.numPatas();
	miGato.timbre();
	miGato.voz();
	
	Tortuga bicho= new Tortuga();
	
	bicho.setNombre("Ronaldo");
	bicho.setEspecie("Marina");
	bicho.setPeso(25);
	bicho.setTipoCaparazon("Blanda");
	System.out.println(bicho.toString());
	}

}
