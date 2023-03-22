package com.cursoceat.main;

import com.cursoceat.model.Delfin;
import com.cursoceat.model.Gato;
import com.cursoceat.model.Perro;
import com.cursoceat.model.Sonido;
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
//tiene que ser gato.version no miGato.version porque no se puede instanciar
System.out.println("Versión desde Clase Gato "+ Gato.version);
System.out.println("Versión desde interfaz "+ Sonido.version);

	
	Tortuga bicho= new Tortuga();
	
	bicho.setNombre("Ronaldo");
	bicho.setEspecie("Marina");
	bicho.setPeso(25);
	bicho.setTipoCaparazon("Blanda");
	
	System.out.println(bicho);
	System.out.println("El gato durmiendo");
	miGato.durmiendo();
	System.out.println("El delfín durmiendo");
	miDelfin.durmiendo();
	Sonido.bostezo();
	miGato.largo();
	miGato.mensaje();
	Sonido son;
	son = new Perro();
	son.voz();
	son = new Gato();
	son.voz();
	
	//System.out.println(bicho.toString());
	

	
	
	}

}
