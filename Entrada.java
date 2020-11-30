package portAventura_atraccions;
import java.util.*;
import java.text.SimpleDateFormat;

public class Entrada {
	SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
	protected long idEntrada;
	protected Date data = new Date();
	protected String categoriaEntrada = new String();
	protected double preu;
	protected boolean estatCompra;
	
	public Entrada(long idEntrada, Date data, String categoriaEntrada, double preu, boolean estatCompra) {
		this.idEntrada = idEntrada;
		this.data = data;	
		if(categoriaEntrada.equalsIgnoreCase("adult")) {
			this.categoriaEntrada = categoriaEntrada;
		}else if(categoriaEntrada.equalsIgnoreCase("junior/senior")){
			this.categoriaEntrada = categoriaEntrada;
		}else {
			System.out.println("Categoria de l'entrada errònia. Si us plau consulta a un empleat del parc");
		}
		this.preu = preu;
		this.estatCompra = estatCompra;
	}
	
	public Entrada() {}

	public long getIdEntrada() {
		return idEntrada;
	}
	
	public Date getData() {
		return data;
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
		return "Ticket comprat: " + getEstatCompra() + "\nEl número de ticket és " + getIdEntrada() + 
				", la categoria és " + getCategoriaEntrada() + ". Admet una persona el " + getData()
				+ "i costa" + getPreu() + "€";
	}
	
}
