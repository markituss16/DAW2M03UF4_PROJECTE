package portAventura_atraccions;
import java.time.*;
import java.util.Date;

public class Atraccio {
	private int idAtraccio;
	private ENomAtraccio nomAtraccio;
	private String tipusAtraccio;
	private Date dataConstruccio;
	private int capacitatGent;
	
	public Atraccio(int idAtraccio, ENomAtraccio nomAtraccio, String tipusAtraccio, Date dataConstruccio,
			int capacitatGent) {
		this.idAtraccio = idAtraccio;
		this.nomAtraccio = nomAtraccio;
		this.tipusAtraccio = tipusAtraccio;
		this.dataConstruccio = dataConstruccio;
		this.capacitatGent = capacitatGent;
	}
	
	
}
