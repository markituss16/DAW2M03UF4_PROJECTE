package portAventura_atraccions;

public class Estandar extends Entrada {
	private int limitAtraccions = 5;
	
	public Estandar(int idEntrada,String categoriaEntrada, double preu, boolean estatCompra) {
		super(idEntrada, categoriaEntrada, preu, estatCompra);
	}

	public int getLimitAtraccions() {
		return limitAtraccions;
	}

	public void setLimitAtraccions(int limitAtraccions) {
		this.limitAtraccions = limitAtraccions;
	}
	
	public void controlAtraccionsEstandar(Visitant v) {
		if(v.getEntrada() instanceof Estandar){
			if(v.getPujades() >= limitAtraccions) {
				System.out.println("Ja no hi pots accedir a cap atracció, compra una nova entrada si ho desitges.");
			}else {
				System.out.println("Pots seguir gaudint de la teva experiència");
			}
		}	
	}
}
