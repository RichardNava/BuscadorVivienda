package com.app.models;

public class Vivienda {
	private int valor;
	private int mt2;
	private int numeroHabitaciones;
	private int numeroBaņos;
	static int CANTIDADVIVIENDAS = 0;
	
	
	public static int getCANTIDADVIVIENDAS() {
		return CANTIDADVIVIENDAS;
	}

	public Vivienda(int valor, int mt2, int numeroHabitaciones, int numeroBaņos) {
		this.valor = valor;
		this.mt2 = mt2;
		this.numeroHabitaciones = numeroHabitaciones;
		this.numeroBaņos = numeroBaņos;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getMt2() {
		return mt2;
	}

	public void setMt2(int mt2) {
		this.mt2 = mt2;
	}

	public int getNumeroHabitaciones() {
		return numeroHabitaciones;
	}

	public void setNumeroHabitaciones(int numeroHabitaciones) {
		this.numeroHabitaciones = numeroHabitaciones;
	}

	public int getNumeroBaņos() {
		return numeroBaņos;
	}

	public void setNumeroBaņos(int numeroBaņos) {
		this.numeroBaņos = numeroBaņos;
	}

	@Override
	public String toString() {
		return "Vivienda [valor=" + valor + ", mt2=" + mt2 + ", numeroHabitaciones=" + numeroHabitaciones
				+ ", numeroBaņos=" + numeroBaņos + "]";
	}

	
	


	
	
	
	
	
	
	
}
