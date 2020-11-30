package portAventura_atraccions;

public class Empleat extends Persona implements IEmpleat{
	private int idEmpleat;
	private ESalariEmpleat salari;
	private String tipusTreball;
	
	public Empleat(String nom, String cognom, String DNI, int telefon, int idEmpleat, ESalariEmpleat salari, String tipusTreball) {
		super(nom, cognom, DNI, telefon);
		this.idEmpleat = idEmpleat;
		this.salari = salari;
		this.tipusTreball = tipusTreball;
	}

	public int getIdEmpleat() {
		return idEmpleat;
	}

	public void setIdEmpleat(int idEmpleat) {
		this.idEmpleat = idEmpleat;
	}

	public ESalariEmpleat getSalari() {
		return salari;
	}

	public void setSalari(ESalariEmpleat salari) {
		this.salari = salari;
	}

	public String getTipusTreball() {
		return tipusTreball;
	}

	public void setTipusTreball(String tipusTreball) {
		this.tipusTreball = tipusTreball;
	}
	
	@Override
	public void comprovarSeguretat() {
		
	}

	@Override
	public void comprovarAlçada() {

	}

	@Override
	public void indicarAtraccio() {

	}

	@Override
	public void vendreEntrades() {

	}
}
