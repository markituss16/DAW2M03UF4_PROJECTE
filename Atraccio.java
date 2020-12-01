package portAventura_atraccions;

public class Atraccio implements Comparable<Atraccio> {
	private int idAtraccio;
	private ENomAtraccio nomAtraccio;
	private ESeguretatAtraccio seguretatAtraccio;
	private int quantitatGent;
	private int alturaMin;
	
	public Atraccio(int idAtraccio, ENomAtraccio nomAtraccio, ESeguretatAtraccio seguretatAtraccio,int quantitatGent) {
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

	public void setSeguretatAtraccio(ESeguretatAtraccio seguretatAtraccio) {
		this.seguretatAtraccio = seguretatAtraccio;
	}

	public int getQuantitatGent() {
		return quantitatGent;
	}

	public void setQuantitatGent(int quantitatGent) {
		this.quantitatGent = quantitatGent;
	}
	
	public int getAlturaMin() {
		return alturaMin;
	}

	public void setAlturaMin(int alturaMin) {
		this.alturaMin = alturaMin;
	}

	@Override
	public String toString() {
		return "Atraccio [idAtraccio=" + idAtraccio + ", nomAtraccio=" + nomAtraccio + ", seguretatAtraccio="
				+ seguretatAtraccio + ", quantitatGent=" + quantitatGent + "]";
	}

	/*Mètodes propis*/
	public void atraccioSeguretat(ESeguretatAtraccio seguretatAtraccio) {
		switch (nomAtraccio) {
		case DRAGON_KHAN:
			if(seguretatAtraccio == ESeguretatAtraccio.PROTECCIO_TOTAL) {
				this.seguretatAtraccio = seguretatAtraccio;
				System.out.println("Seguretat corresponent a l'atracció seleccionada. ");
			}else {
				System.out.println("Seguretat no corresponent a l'atracció seleccionada.");
			}
			break;
		case SHAMBHALA:
			if(seguretatAtraccio == ESeguretatAtraccio.PROTECCIO_PARCIAL) {
				this.seguretatAtraccio = seguretatAtraccio;
				System.out.println("Seguretat corresponent a l'atracció seleccionada. ");
			}else {
				System.out.println("Seguretat no corresponent a l'atracció seleccionada.");
			}
			break;
		case TUTUKI_SPLASH:
			if(seguretatAtraccio == ESeguretatAtraccio.SENSE_PROTECCIO) {
				this.seguretatAtraccio = seguretatAtraccio;
				System.out.println("Seguretat corresponent a l'atracció seleccionada. ");
			}else {
				System.out.println("Seguretat no corresponent a l'atracció seleccionada.");
			}
			break;
		case HURAKAN_CONDOR:
			if(seguretatAtraccio == ESeguretatAtraccio.PROTECCIO_TOTAL) {
				this.seguretatAtraccio = seguretatAtraccio;
				System.out.println("Seguretat corresponent a l'atracció seleccionada. ");
			}else {
				System.out.println("Seguretat no corresponent a l'atracció seleccionada.");
			}
			break;
		case STAMPIDA:
			if(seguretatAtraccio == ESeguretatAtraccio.PROTECCIO_PARCIAL) {
				this.seguretatAtraccio = seguretatAtraccio;
				System.out.println("Seguretat corresponent a l'atracció seleccionada. ");
			}else {
				System.out.println("Seguretat no corresponent a l'atracció seleccionada.");
			}
			break;
			default:
				System.out.println("Describint la seguretat de cada atracció.");
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
