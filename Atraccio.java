package portAventura_atraccions;
import java.util.Date;

public class Atraccio implements Comparable<Atraccio> {
	private int idAtraccio;
	private ENomAtraccio nomAtraccio;
	private ESeguretatAtraccio seguretatAtraccio;
	private Date dataConstruccio;
	private int quantitatGent;
	
	public Atraccio(int idAtraccio, ENomAtraccio nomAtraccio, ESeguretatAtraccio seguretatAtraccio,
			int quantitatGent) {
		this.idAtraccio = idAtraccio;
		this.nomAtraccio = nomAtraccio;
		this.seguretatAtraccio = seguretatAtraccio;
		this.quantitatGent = quantitatGent;
	}

	public int getIdAtraccio() {
		return idAtraccio;
	}

	public void setIdAtraccio(int idAtraccio) {
		this.idAtraccio = idAtraccio;
	}

	public ENomAtraccio getNomAtraccio() {
		return nomAtraccio;
	}

	public void setNomAtraccio(ENomAtraccio nomAtraccio) {
		this.nomAtraccio = nomAtraccio;
	}

	public ESeguretatAtraccio getSeguretatAtraccio() {
		return seguretatAtraccio;
	}

	public void setTipusAtraccio(ESeguretatAtraccio seguretatAtraccio) {
		this.seguretatAtraccio = seguretatAtraccio;
	}

	public Date getDataConstruccio() {
		return dataConstruccio;
	}

	public void setDataConstruccio(Date dataConstruccio) {
		this.dataConstruccio = dataConstruccio;
	}

	public int getQuantitatGent() {
		return quantitatGent;
	}

	public void setQuantitatGent(int quantitatGent) {
		this.quantitatGent = quantitatGent;
	}
	
	@Override
	public String toString() {
		return "Atraccio [idAtraccio=" + idAtraccio + ", nomAtraccio=" + nomAtraccio + ", seguretatAtraccio="
				+ seguretatAtraccio + ", dataConstruccio=" + dataConstruccio + ", quantitatGent=" + quantitatGent + "]";
	}

	/*M�todes propis*/
	public void atraccioSeguretat(ESeguretatAtraccio seguretatAtraccio) {
		switch (nomAtraccio) {
		case DRAGON_KHAN:
			if(seguretatAtraccio == ESeguretatAtraccio.PROTECCIO_TOTAL) {
				this.seguretatAtraccio = seguretatAtraccio;
				System.out.println("Seguretat corresponent a l'atracci� seleccionada. ");
			}else {
				System.out.println("Seguretat no corresponent a l'atracci� seleccionada.");
			}
			break;
		case SHAMBALA:
			if(seguretatAtraccio == ESeguretatAtraccio.PROTECCIO_PARCIAL) {
				this.seguretatAtraccio = seguretatAtraccio;
				System.out.println("Seguretat corresponent a l'atracci� seleccionada. ");
			}else {
				System.out.println("Seguretat no corresponent a l'atracci� seleccionada.");
			}
			break;
		case TUTUKI_SPLASH:
			if(seguretatAtraccio == ESeguretatAtraccio.SENSE_PROTECCIO) {
				this.seguretatAtraccio = seguretatAtraccio;
				System.out.println("Seguretat corresponent a l'atracci� seleccionada. ");
			}else {
				System.out.println("Seguretat no corresponent a l'atracci� seleccionada.");
			}
			break;
		case HURAKAN_CONDOR:
			if(seguretatAtraccio == ESeguretatAtraccio.PROTECCIO_TOTAL) {
				this.seguretatAtraccio = seguretatAtraccio;
				System.out.println("Seguretat corresponent a l'atracci� seleccionada. ");
			}else {
				System.out.println("Seguretat no corresponent a l'atracci� seleccionada.");
			}
			break;
		case STAMPIDA:
			if(seguretatAtraccio == ESeguretatAtraccio.PROTECCIO_PARCIAL) {
				this.seguretatAtraccio = seguretatAtraccio;
				System.out.println("Seguretat corresponent a l'atracci� seleccionada. ");
			}else {
				System.out.println("Seguretat no corresponent a l'atracci� seleccionada.");
			}
			break;
			default:
				System.out.println("Describint la seguretat de cada atracci�.");
		}
	}
	
	@Override
	public int compareTo(Atraccio a){
		return this.seguretatAtraccio.compareTo(a.seguretatAtraccio);
	}
	
	public boolean AtraccioPlena (int capacitatGent) {
		return quantitatGent >= capacitatGent;
	}
}
