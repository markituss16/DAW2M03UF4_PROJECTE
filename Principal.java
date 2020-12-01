package portAventura_atraccions;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Date;

public class Principal {
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
					break;

				case 0:
					System.out.println("Gràcies per comprar amb nosaltres.");
					System.exit(0);


				default: 
					System.out.println("Si us plau, introdueix un número vàlid.");
					parcTest(p);

				}
			} catch (InputMismatchException e) {
				System.out.println("Si us plau, introdueix un número.");
				parcTest(p);
				break;
			}

		}while(resposta.equalsIgnoreCase("y"));
		System.out.println("Gràcies per comprar amb nosaltres");
	}		

	public static void transaccioEntrades(ParcAtraccio p) {
		int eleccio;
		boolean existeix=false;
		char resposta;
		Scanner input = new Scanner(System.in);
		System.out.println("Aquí pots comprar les entrades!\nSi us plau, entra un ID d'entrada.");
		for(int i=0; i<p.getEntrades().size(); i++ ){
			if(!p.getEntrades().get(i).getEstatCompra()) {
			System.out.println("Id entrada: " + p.getEntrades().get(i).getIdEntrada());
			}		
		}
		try {
			eleccio = input.nextInt();
			for(int i=0; i<p.getEntrades().size(); i++ ){
				if(p.getEntrades().get(i).getIdEntrada()== eleccio){
					p.comprarEntrada(eleccio);
					existeix=true;
					System.out.println("Vols continuar? Entra 'y' o 'n'.");
					resposta = input.next().charAt(0);
				}else{
					continue;
				}
			}
			if(!existeix){
				System.out.println("Identificador no vàlid!");
			}

			p.comprarEntrada(eleccio);
		} catch (Exception e) {
			System.out.println("Identificador ha de ser un nombre.");
		}
	}

	public static void main(String[] args) {
		ParcAtraccio nouParc = new ParcAtraccio("Port Aventura World");
		Entrada e1 = new Entrada(1000L,"aaaa",52.10,false);
		nouParc.afegirEntrada(e1);
		Entrada e2 = new Entrada(1022L,"junior/senior",55.00,false);
		nouParc.afegirEntrada(e2);
		Entrada e3 = new Entrada(1033L,"junior/senior",45.00,false);
		nouParc.afegirEntrada(e3);
		Entrada e4 = new Entrada(1044L,"adult",50.00,true);
		nouParc.afegirEntrada(e4);

		parcTest(nouParc);
	}
}
		
