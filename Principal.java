package portAventura_atraccions;
import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("|||||| GESTI� PARC ATRACCIONS ||||||");
		System.out.println("1- Gesti� entrades");
		System.out.println("2- Gesti� atraccions");
		System.out.println("10- Sortir del programa");
		System.out.println("Escull una opci�: ");
		
		int opcio = input.nextInt();
		
		switch(opcio) {
			case 1:
				System.out.println("Gesti� entrades");
				break;
				
			case 2:
				System.out.println("Gesti� atraccions");
				break;
				
			case 10:
				System.out.println("Sortint del programaci�");
				break;
		}
	}
}
