package portAventura_atraccions;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Date;

public class Principal {

	public static Date crearDia(){
		Date d = new Date();
		return d;
	}
	
	public static void parcTest(ParcAtraccio p) {
		System.out.println("Benvingut a " + p.getNom() + "!");
		Scanner input = new Scanner(System.in);
		String resposta = new String();
		int opcio;
		
		do {
			System.out.println("Entra '1' per a comprar una entrada");
			System.out.println("Entra '0' per a sortir.");
			opcio = input.nextInt();
			
			try {
				switch(opcio) {
				case 1:
					transaccioEntrades(p);
					System.out.println("Vols continuar? Entra 'y' o 'n'.");
					resposta = input.next();
					break;

				case 0:
					System.out.println("Gràcies per comprar amb nosaltres.");
					System.exit(0);
				}
				
			} catch (InputMismatchException e) {
				System.out.println("Si us plau, introdueix un número vàlid.");
				parcTest(p);
				break;
			}
			
		}while(resposta.equalsIgnoreCase("y"));
		System.out.println("Gràcies per comprar amb nosaltres");
	}		
		
	public static void transaccioEntrades(ParcAtraccio p) {
		Scanner input = new Scanner(System.in);
		System.out.println("Aquí pots comprar les entrades!\nSi us plau, entra un ID d'entrada.");
		p.getDadesEntrades();
		int eleccio;
		eleccio = input.nextInt();
		try {
			p.comprarEntrada(eleccio);
		} catch (Exception e) {
			System.out.println("Identificador no vàlid!");
		}
	}
	
	public static void main(String[] args) {
		ParcAtraccio nouParc = new ParcAtraccio("Port Aventura World");
		Entrada e1 = new Entrada(1000L,Principal.crearDia(),"adult",52.10,false);
		nouParc.afegirEntrada(e1);
		Entrada e2 = new Entrada(1022L,Principal.crearDia(),"junior/senior",55.00,false);
		nouParc.afegirEntrada(e2);
		Entrada e3 = new Entrada(1033L,Principal.crearDia(),"junior/senior",45.00,false);
		nouParc.afegirEntrada(e3);
		Entrada e4 = new Entrada(1044L,Principal.crearDia(),"adult",50.00,true);
		nouParc.afegirEntrada(e4);
		
		parcTest(nouParc);
	}
}
		
