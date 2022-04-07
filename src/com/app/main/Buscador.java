package com.app.main;

import java.util.Scanner;

import com.app.data.BaseDeDatos;

public class Buscador {

	public static void main(String[] args) {
	int opcion;
	BaseDeDatos base1 = new BaseDeDatos();
	base1.ingresarChalets(0);
	base1.ingresarPisos(1);
	
	Scanner sc = new Scanner (System.in);
		
		
		System.out.println("****** Bienvenido al Buscador de Viviendas AC3 ******/n");
		
		System.out.println("Seleccione una de las siguientes opciones:");
		System.out.println("1.- Ver Pisos");
		System.out.println("2.- Ver Chalets");
	    System.out.println("0.- Salir");
		
	    try { do {
	    opcion = sc.nextInt();
	
		switch (opcion) {
		case 1: System.out.println(base1.getPisos());
				break;
		case 2: System.out.println(base1.getChalets());
				break;
		case 0: System.out.println("Gracias por visitarnos!");
				break;
		default: System.out.println("OPCION INVALIDA. Por favor, Seleccione una opción entre 0-2");
		}
		} while (opcion < 0 || opcion > 2);
	    } catch (Exception e) {
	    	System.out.println("Caracter Invalido");
	    }
	    sc.close();
	} 
} 


	 






			
	
	
