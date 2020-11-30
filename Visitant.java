package portAventura_atraccions;

public class Visitant extends Persona implements Cloneable{
	private int numVisitant;
	private Entrada entrada;
	private double diners;
	
	public Visitant(String nom, String cognom, String DNI, int telefon, int numVisitant, Entrada entrada, double diners) {
		super(nom, cognom, DNI, telefon);
		this.numVisitant = numVisitant;
		this.entrada = entrada;
		this.diners = diners;
	}

	public int getNumVisitant() {
		return numVisitant;
	}

	public void setNumVisitant(int numVisitant) {
		this.numVisitant = numVisitant;
	}

	public Entrada getEntrada() {
		return entrada;
	}
	
	public void setEntrada(Entrada entrada) {
		this.entrada = entrada;
	}
	
	public double getDiners() {
		return diners;
	}

	public void setDiners(double diners) {
		this.diners = diners;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return (Visitant)super.clone();
	}
	
	public void pagarEntrada(double preu) {
		diners -= preu;
	}

}
