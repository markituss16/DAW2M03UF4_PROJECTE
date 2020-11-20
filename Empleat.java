package portAventura_atraccions;

public class Empleat extends Persona{
	private int idEmpleat;
	private double salari;
	private String tipusTreball;
	
	public Empleat(String nom, String cognom, String DNI, int telefon) {
		super(nom, cognom, DNI, telefon);
		this.idEmpleat = idEmpleat;
		this.salari = salari;
		this.tipusTreball = tipusTreball;
	}
	
	
}
