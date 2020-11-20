package portAventura_atraccions;
import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("|||||| GESTIÓ PARC ATRACCIONS ||||||");
		System.out.println("1- Gestió entrades");
		System.out.println("2- Gestió atraccions");
		System.out.println("10- Sortir del programa");
		System.out.println("Escull una opció: ");
		
		int opcio = input.nextInt();
		
		switch(opcio) {
			case 1:
				System.out.println("Gestió entrades");
				break;
				
			case 2:
				System.out.println("Gestió atraccions");
				break;
				
			case 10:
				System.out.println("Sortint del programació");
				break;
		}
	}
}
