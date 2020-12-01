package portAventura_atraccions;
import java.util.*;

public class Entrada {
	protected long idEntrada;
	protected String categoriaEntrada = new String();
	protected double preu;
	protected boolean estatCompra;
	
	public Entrada(long idEntrada, String categoriaEntrada, double preu, boolean estatCompra) {
		this.idEntrada = idEntrada;	
		this.categoriaEntrada = categoriaEntrada;
		this.preu = preu;
		this.estatCompra = estatCompra;
	}
	
	public Entrada() {}

	public long getIdEntrada() {
		return idEntrada;
	}
	public String getCategoriaEntrada() {
		return categoriaEntrada;
	}

	public double getPreu() {
		return preu;
	}
		
	public boolean getEstatCompra() {
		boolean estat;
		if(this.estatCompra == true) {
			estat = true;
		}else {
			estat = false;
		}
		return estat;
	}

	@Override
	public String toString() {
		return "Ticket comprat: " + getEstatCompra() + "\nEl n�mero de ticket �s " + getIdEntrada() + 
				", la categoria �s " + getCategoriaEntrada() + ". Costa" + getPreu() + "�";
	}
	
}
