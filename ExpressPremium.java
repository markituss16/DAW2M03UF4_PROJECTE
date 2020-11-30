package portAventura_atraccions;

import java.util.Date;

public class ExpressPremium extends Entrada {
	private boolean primeraFila;
	private boolean pulsera;
	
	public ExpressPremium(int idEntrada, Date data, String categoriaEntrada, double preu, boolean estatCompra) {
		super(idEntrada, data, categoriaEntrada, preu, estatCompra);
	}

	public boolean isPrimeraFila() {
		return primeraFila;
	}

	public void setPrimeraFila(boolean primeraFila) {
		this.primeraFila = primeraFila;
	}

	public boolean isPulsera() {
		return pulsera;
	}

	public void setPulsera(boolean pulsera) {
		this.pulsera = pulsera;
	}
	


}
