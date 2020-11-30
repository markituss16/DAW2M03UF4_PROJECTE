package portAventura_atraccions;

import java.util.Date;

public class Estandar extends Entrada {
	private int limitHora = 6;
	private int limitAtraccions = 5;
	
	public Estandar(int idEntrada, Date data, String categoriaEntrada, double preu, boolean estatCompra) {
		super(idEntrada, data, categoriaEntrada, preu, estatCompra);
	}

	public int getLimitHora() {
		return limitHora;
	}

	public void setLimitHora(int limitHora) {
		this.limitHora = limitHora;
	}

	public int getLimitAtraccions() {
		return limitAtraccions;
	}

	public void setLimitAtraccions(int limitAtraccions) {
		this.limitAtraccions = limitAtraccions;
	}
	
	public void controlTempsEstandar(int tempsAlParc) {
		if(tempsAlParc >= limitHora) {
			System.out.println("És hora de marxar!");
		}else {
			System.out.println("Pots seguir gaudint de la teva experiència");
		}		
	}
	
	public void controlAtraccionsEstandar(int maxAtraccions) {
		if(maxAtraccions >= limitAtraccions) {
			System.out.println("Ja no hi pots accedir a cap atracció, compra una nova entrada si ho desitges.");
		}else {
			System.out.println("Pots seguir gaudint de la teva experiència");
		}
	}	
}
