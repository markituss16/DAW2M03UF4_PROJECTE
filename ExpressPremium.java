package portAventura_atraccions;

public class ExpressPremium extends Entrada {
	private int primeraFila = 1;
	
	public ExpressPremium(int idEntrada,String categoriaEntrada, double preu, boolean estatCompra,int primeraFila) {
		super(idEntrada,categoriaEntrada, preu, estatCompra);
		this.primeraFila = primeraFila;
	}

	public int getPrimeraFila() {
		return primeraFila;
	}

	public void setPrimeraFila(int primeraFila) {
		this.primeraFila = primeraFila;
	}

	public void vegadesPrimeraFila(Visitant v) {
		if(v.getEntrada() instanceof ExpressPremium) {
			if(v.getPrimeraFila() >= primeraFila) {
				System.out.println("Ja no hi pots accedir a la primera fila!");
			}else {
				System.out.println("Encara hi pots aprofitar!");
			}
		}
	}
}
