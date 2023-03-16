package com.cursoceat.main;

import com.cursoceat.model.Delfin;
import com.cursoceat.model.Gato;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Delfin miDelfin = new Delfin(20,"Wally", 800,"Blanca");
	System.out.println(miDelfin.toString());
		
	Gato miGato = new Gato("Sape", 15,"pardo", 12,"gris");
	System.out.println(miGato.toString());	
	}

}
