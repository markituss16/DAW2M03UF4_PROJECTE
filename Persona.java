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
									
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCognom() {
		return cognom;
	}

	public void setCognom(String cognom) {
		this.cognom = cognom;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public int getTelefon() {
		return telefon;
	}

	public void setTelefon(int telefon) {
		this.telefon = telefon;
	}

	public void saludar() {
		System.out.println("Bones!");
	}

	@Override
	public String toString() {
		return "Persona [nom=" + nom + ", cognom=" + cognom + ", DNI=" + DNI + ", telefon=" + telefon + "]";
	}
	
	
}
