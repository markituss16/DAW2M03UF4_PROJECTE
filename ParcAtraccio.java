package portAventura_atraccions;
import java.sql.Time;
import java.util.*;

public class ParcAtraccio {
	private ArrayList<Entrada> entrades = new ArrayList<Entrada>();
	private String nom = new String();
	private Time horariObertura;
	private int numVisitants;
	private int nombreAtraccions;
	
	public ParcAtraccio(String nom) {
		this.nom = nom;
	}

	/*GETTERS I SETTERS*/
	public String getNom() {
		return this.nom;
	}
	
	public ArrayList<Date> getDadesEntrades(){
		ArrayList<Date> data = new ArrayList<Date>();
		for (Entrada e : this.entrades) {
			if (e.getEstatCompra() == false) {
				System.out.println("ID entrada:" + e.getIdEntrada());
				data.add(e.getData());
			}
		}
		return data;
	}
	
	public int getEntrada(Date data) {
		int resultat = 0;
		for (Entrada e : this.entrades) {
			if (e.getData() == data) {
				resultat++;
			}
		}
		return resultat;
	}
	
	public Entrada getEntrada(long id) {
		Entrada resultat = null;
		for (Entrada e : this.entrades) {
			if (e.getIdEntrada() == id) {
				resultat = e;
			}
		}
		return resultat;
	}
	
	/*public Time getHorariObertura() {
		return horariObertura;
	}

	public void setHorariObertura(Time horariObertura) {
		this.horariObertura = horariObertura;
	}

	public int getNumVisitants() {
		return numVisitants;
	}

	public void setNumVisitants(int numVisitants) {
		this.numVisitants = numVisitants;
	}

	public int getNombreAtraccions() {
		return nombreAtraccions;
	}

	public void setNombreAtraccions(int nombreAtraccions) {
		this.nombreAtraccions = nombreAtraccions;
	}*/
	
	/*MÈTODES PROPIS*/
	
	public void afegirEntrada(Entrada e) {
		this.entrades.add(e);
	}
	
	public void comprarEntrada(long id) {
		try {
			for(Iterator<Entrada> c = this.entrades.iterator();c.hasNext();) {
				Entrada e = c.next();
				if (e.getIdEntrada() == id) {
					c.remove();
					System.out.println("L'entrada " + e.getIdEntrada() + " ha sigut comprat amb èxit!");
				};
			}
		}catch(Exception ex) {
			ex.printStackTrace();
			System.out.println("No s'ha trobat l'entrada. Compra'n una!");
		}
	}	
}
