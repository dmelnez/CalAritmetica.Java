package edu.calAritmetica.servicios;

import java.util.Scanner;

public class calculoImplementacion implements calculoInterfaz{

	public int suma() {
		
		System.out.print("Seleccion de Suma");
		Scanner usuNum01 = new Scanner (System.in);
		Scanner usuNum02 = new Scanner (System.in);
		int Numero01 = usuNum01.nextInt();
		int Numero02 = usuNum02.nextInt();
		int sumaV = Numero01 + Numero02;
		return sumaV;	
	}
	
	
 public int resta() {
		
		System.out.print("Seleccion de Resta");
		Scanner usuNum01 = new Scanner (System.in);
		Scanner usuNum02 = new Scanner (System.in);
		int Numero01 = usuNum01.nextInt();
		int Numero02 = usuNum02.nextInt();
		int restaV = Numero01 - Numero02;
		return restaV;
		
	}
	
 
 public int multiplicacion() {
		
		System.out.print("Seleccion de Multiplicacion");
		Scanner usuNum01 = new Scanner (System.in);
		Scanner usuNum02 = new Scanner (System.in);
		int Numero01 = usuNum01.nextInt();
		int Numero02 = usuNum02.nextInt();
		int multV = Numero01 * Numero02;
		return multV;	
	}
 
 
 public int division() {
		
		System.out.print("Seleccion de Multiplicacion");
		Scanner usuNum01 = new Scanner (System.in);
		Scanner usuNum02 = new Scanner (System.in);
		int Numero01 = usuNum01.nextInt();
		int Numero02 = usuNum02.nextInt();
		int divV = Numero01 / Numero02;
		return divV;	
	}
	
	
 
 public int moduloSuma() {
		
		System.out.print("Seleccion de Modulo de Suma");
		Scanner usuNum01 = new Scanner (System.in);
		Scanner usuNum02 = new Scanner (System.in);
		int Numero01 = usuNum01.nextInt();
		int Numero02 = usuNum02.nextInt();
		int modV = Numero01 % Numero02;
		return modV;
	}
 
}
