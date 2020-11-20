package portAventura_atraccions;

import java.util.Date;

public class ExpressPremium extends Entrada {
	private boolean primeraFila;
	private boolean pulsera;
	
	public ExpressPremium(int idEntrada, Date dataExpiracio, String categoriaEntrada, double preu, boolean primeraFila,
			boolean pulsera) {
		super(idEntrada, dataExpiracio, categoriaEntrada, preu);
		this.primeraFila = primeraFila;
		this.pulsera = pulsera;
	}
	
	
}
