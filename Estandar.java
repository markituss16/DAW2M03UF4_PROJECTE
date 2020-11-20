package portAventura_atraccions;

import java.util.Date;

public class Estandar extends Entrada {
	private int limitHora;
	private int limitAtraccions;
	
	public Estandar(int idEntrada, Date dataExpiracio, String categoriaEntrada, double preu, int limitHora,
			int limitAtraccions) {
		super(idEntrada, dataExpiracio, categoriaEntrada, preu);
		this.limitHora = limitHora;
		this.limitAtraccions = limitAtraccions;
	}
		
}
