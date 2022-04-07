package com.app.models;

public class Chalet extends Vivienda{
	boolean piscina = false;
		
	
	public Chalet(int valor, int mt2, int numeroHabitaciones, int numeroBaños, boolean piscina) {
		super(valor, mt2, numeroHabitaciones, numeroBaños);
		this.piscina = piscina;
		CANTIDADVIVIENDAS++;
	}


	public boolean isPiscina() {
		return piscina;
	}


	public void setPiscina(boolean piscina) {
		this.piscina = piscina;
	}


	@Override
	public String toString() {
		return "CHALET \nValor = " + super.getValor() + " \nMt2 =" + super.getMt2() + " \nHabitaciones= " + super.getNumeroHabitaciones()
					+ " \nBaños = " + super.getNumeroBaños() + " \nPiscina = " + piscina;
	}

	
	
	
	
	
	
	

}
