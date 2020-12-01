package portAventura_atraccions;

public class Visitant extends Persona implements Cloneable{
	private int numVisitant;
	private Entrada entrada;
	private double diners;
    private int pujades = 0;
    private int primeraFila = 0;
	
	public Visitant(String nom, String cognom, String DNI, int telefon, double altura, int numVisitant, Entrada entrada, double diners, int pujades, int primeraFila) {
		super(nom, cognom, DNI, telefon, altura);
		this.numVisitant = numVisitant;
		this.entrada = entrada;
		this.diners = diners;
        this.pujades = pujades;
        this.primeraFila = primeraFila;
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

    public int getPujades() {
        return pujades;
    }

    public void setPujades(int pujades) {
        this.pujades = pujades;
    }  
    
    public int getPrimeraFila() {
		return primeraFila;
	}

	public void setPrimeraFila(int primeraFila) {
		this.primeraFila = primeraFila;
	}

	@Override
	public String toString() {
		return "Visitant [numVisitant=" + numVisitant + ", entrada=" + entrada + ", diners=" + diners + ", pujades="
				+ pujades + ", nom=" + nom + ", cognom=" + cognom + ", DNI=" + DNI + ", telefon=" + telefon
				+ ", altura=" + altura + "]";
	}

	public String pujarAtraccio(Atraccio a, Empleat e){
        if(e.comprovarAltura(this,a).equals("OK")){
            this.pujades = this.pujades + 1;
            return "Pujooo weeeee!!";
        }
        return "No puc pujar =(";
    }
      
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return (Visitant)super.clone();
	}
	
	public void pagarEntrada(double preu) {
		diners -= preu;
	}

}
