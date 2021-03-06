package com.app.models;

public class Piso extends Vivienda {
	boolean ascensor = false;
	
	public Piso(int valor, int mt2, int numeroHabitaciones, int numeroBaņos, boolean ascensor) {
		super(valor, mt2, numeroHabitaciones, numeroBaņos);
		this.ascensor = ascensor;
		CANTIDADVIVIENDAS++;

	}

	public boolean isAscensor() {
		return ascensor;
	}

	public void setAscensor(boolean ascensor) {
		this.ascensor = ascensor;
	}
	
	@Override
	public String toString() {
		return "PISO \nValor = " + super.getValor() + "\nMt2 =" + super.getMt2() + " \nHabitaciones= " + super.getNumeroHabitaciones()
					+ " \nBaņos = " + super.getNumeroBaņos() + " \nAscensor = " + ascensor;
	
	}
}
