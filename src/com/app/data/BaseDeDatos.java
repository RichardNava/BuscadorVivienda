package com.app.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.app.models.Piso;
import com.app.models.Chalet;
import com.app.models.Vivienda;


public class BaseDeDatos {
	
	Scanner sc = new Scanner(System.in);
	private List <Chalet> chalets = new ArrayList<>();
	private List <Piso> pisos = new ArrayList<>();
	
	
	
	public void ingresarChalets(int numChalets) {
	for(int i = 0; i < numChalets; i++ ) {
		
			System.out.println("Agregar Valor del chalet numero: "+(i+1)+":");
			int valor = sc.nextInt();
			System.out.println("Agregar Metros Cuadrados del chalet numero: "+(i+1)+":");
			int mt2 = sc.nextInt();
			System.out.println("Agregar Número de Habitaciones del chalet numero: "+(i+1)+":");
			int numeroHabitaciones = sc.nextInt();
			System.out.println("Agregar Número de Baños del chalet numero: "+(i+1)+":");
			int numeroBaños = sc.nextInt();
			System.out.println("¿Tiene Piscina? si/no: ");
			boolean piscina;
			if (sc.next() == "si") {
				piscina = true;
			} else {
				piscina = false;
			}
			Chalet chalet = new Chalet(valor,mt2, numeroHabitaciones, numeroBaños,piscina);
			chalets.add(chalet);
			System.out.println("Vivienda número "+Vivienda.getCANTIDADVIVIENDAS()+" creada");
	}
	}
			public void ingresarPisos(int numPisos) {
			for(int i = 0; i < numPisos; i++) {
				
			System.out.println("Agregar Valor del piso numero "+(i+1)+":");
			int valor = sc.nextInt();
			System.out.println("Agregar Metros Cuadrados del piso numero "+(i+1)+":");
			int mt2 = sc.nextInt();
			System.out.println("Agregar Número de Habitaciones del piso numero "+(i+1)+":");
			int numeroHabitaciones = sc.nextInt();
			System.out.println("Agregar Número de Baños del piso numero "+(i+1)+":");
			int numeroBaños = sc.nextInt();
			System.out.println("¿Tiene ascensor? si/no: ");
			boolean ascensor;
			if (sc.next() == "si") {
				ascensor = true;
			} else {
				ascensor = false;
			}
			Piso piso = new Piso(valor,mt2, numeroHabitaciones, numeroBaños,ascensor);
			pisos.add(piso);
			System.out.println("Vivienda número "+Vivienda.getCANTIDADVIVIENDAS()+" creada");
		}
			}
			

			public List<Chalet> getChalets() {
				return chalets;
			}
			public void setChalets(List<Chalet> chalets) {
				this.chalets = chalets;
			}
			public List<Piso> getPisos() {
				return pisos;
			}
			public void setPisos(List<Piso> pisos) {
				this.pisos = pisos;
			}
			
			
			
			
			
}
	

