package portAventura_atraccions;
import java.time.*;
import java.util.Date;

public class Entrada {
	protected int idEntrada;
	protected Date dataExpiracio;
	protected String categoriaEntrada;
	protected double preu;
	
	public Entrada(int idEntrada, Date dataExpiracio, String categoriaEntrada, double preu) {
		this.idEntrada = idEntrada;
		this.dataExpiracio = dataExpiracio;
		this.categoriaEntrada = categoriaEntrada;
		this.preu = preu;
	}
		
}
