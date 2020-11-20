package portAventura_atraccions;

public abstract class Persona {
	protected String nom;
	protected String cognom;
	protected String DNI;
	protected int telefon;
	
	public Persona(String nom, String cognom, String DNI, int telefon) {
		super();
		this.nom = nom;
		this.cognom = cognom;
		this.DNI = DNI;
		this.telefon = telefon;
	}
	
	
}
