package portAventura_atraccions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    /**
     * ***************MAIN**********************
     */
    public static void main(String[] args) {
        ParcAtraccio nouParc = new ParcAtraccio("Port Aventura World");
        /**
         * *********Instàncies ENTRADA*********
         */
        
        //Ús de polimorfisme
        Entrada e1 = new Estandar(1000, "adult", 52.10, false);
        nouParc.afegirEntrada(e1);
        Entrada e2 = new Estandar(1022, "junior/senior", 55.00, false);
        nouParc.afegirEntrada(e2);
        Entrada e3 = new ExpressPremium(1033, "junior/senior", 45.00, false, 2);
        nouParc.afegirEntrada(e3);
        Entrada e4 = new ExpressPremium(1044, "adult", 50.00, true, 2);
        nouParc.afegirEntrada(e4);
        Entrada e5 = new Estandar(1055, "junior/senior", 46.25, false);
        nouParc.afegirEntrada(e5);
        Entrada e6 = new ExpressPremium(1066, "adult", 40.00, false, 2);
        nouParc.afegirEntrada(e6);
        
        /**
         * *********Instàncies VISITANT*********
         */
        Visitant p1 = new Visitant("Pau", "Sanchez", "33245624X", 643068219, 1.50, 200, null, 1200, 0, 0);
        nouParc.afegirVisitant(p1);
        Visitant p2 = new Visitant("Manel", "Martin", "48926587O", 694851678, 1.69, 400, null, 60, 0, 0);
        nouParc.afegirVisitant(p2);
        Visitant p3 = new Visitant("Jordi", "Martínez", "58712682L", 623489502, 1.80,500 , null, 120, 0, 0);
        nouParc.afegirVisitant(p3);
        Visitant p4 = new Visitant("Hector", "Lopez", "19854692V", 649235791, 1.72, 600, null, 200, 0, 0);
        nouParc.afegirVisitant(p4);
        
        /**
         * *********Instàncies EMPLEAT*********
         */   
        Empleat p5 = new Empleat("Laia", "Pérez", "33245624X", 643068219, 3, ESalariEmpleat.SUPERIOR);
        nouParc.afegirEmpleats(p5);
        Empleat p6 = new Empleat("Pau", "Rodriguez", "49368752J", 648279315, 4, ESalariEmpleat.MEDIO);
        nouParc.afegirEmpleats(p6);
        Empleat p7 = new Empleat("Marta", "Anglès", "15846957G", 689547821, 5, ESalariEmpleat.INFERIOR);
        nouParc.afegirEmpleats(p7);

        /**
         * *********Instàncies ATRACCIO*********
         */   
        Atraccio a1 = new Atraccio(1,ENomAtraccio.DRAGON_KHAN,10,1.51);
        nouParc.afegirAtraccio(a1);
        Atraccio a2 = new Atraccio(2,ENomAtraccio.TUTUKI_SPLASH,15,1.40);
        nouParc.afegirAtraccio(a2);
        Atraccio a3 = new Atraccio(3,ENomAtraccio.SHAMBHALA,20,1.50);
        nouParc.afegirAtraccio(a3);
        Atraccio a4 = new Atraccio(4,ENomAtraccio.HURAKAN_CONDOR,16,1.55);
        nouParc.afegirAtraccio(a4);
        Atraccio a5 = new Atraccio(5,ENomAtraccio.STAMPIDA,24,1.45);
        nouParc.afegirAtraccio(a5);
        
        //Execució de les funcions
        parcTest(nouParc);
        infoParcTest(nouParc);
    }

    /**
     * Test del primer menú.
     * Aquest porta al segon menú un cop es compra una segona entrada.
     */ 
    public static void parcTest(ParcAtraccio p) {
        System.out.println("Benvingut a " + p.getNom() + "!");
        Scanner input = new Scanner(System.in);
        String resposta = new String();
        int opcio;
        
        //Opcions del primer menú
        do {
            System.out.println("Entra '1' per a comprar una entrada i poder accedir al parc.");
            System.out.println("Entra '0' per a sortir.");
            try {
                opcio = input.nextInt();

                switch (opcio) {
                    case 1:
                        transaccioEntrades(p);                  	
                        infoParcTest(p);
                        System.out.println("Vols continuar? Entra 'y' o 'n'.");
                        resposta = input.next();
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

        } while (resposta.equalsIgnoreCase("y"));
        System.out.println("Gràcies per comprar amb nosaltres.");
    }

    /**
     * *************************TESTER_INFORMACIO*********************************
     */
    public static void infoParcTest(ParcAtraccio p) {
        Scanner input = new Scanner(System.in);
        String resposta = new String();
        int opcio;

        //Opcions del segon menú
        do {
            System.out.println("\n	INFORMACIÓ DEL PARC");
            System.out.println("   ---------------------------");
            System.out.println("Entra '1' si vols informació de les atraccions");
            System.out.println("Entra '2' si vols informació dels empleats del parc");
            System.out.println("Entra '3' si vols llista ordenada d'atraccions per nombre de visitants");
            System.out.println("Entra '4' si vols pujar a una atracció");
            System.out.println("Entra '5' si vols consultar el nombre de visitants");
            System.out.println("Entra '0' si desitjes sortir del parc");
            opcio = input.nextInt();
            try {
                switch (opcio) {
                	//Execució de totes en cada cas seleccionat
                
                    case 1:
                        //Info seguretat atraccions
                        infoAtraccions(p.getAtraccions());
                        System.out.println("\nVols continuar? Entra 'y' o 'n'.");
                        resposta = input.next();
                        break;

                    case 2:
                    	//Info referent a les dades dels treballadors
                        infoTreballadors(p.getEmpleats());
                        System.out.println("Vols continuar? Entra 'y' o 'n'.");
                        resposta = input.next();
                        break;

                    case 3:
                    	//Es llisten les atraccions i s'indica el nombre de visitants que te.
                        ordenaAtraccions(p.getAtraccions());
                        System.out.println("Vols continuar? Entra 'y' o 'n'.");
                        resposta = input.next();
                        break;
                    
                    case 4:
                    	//Acció de pujar a l'atracció on s'indica si es permet o no pujar en aquesta
                        pujarAtraccio(p);
                        System.out.println("Vols continuar? Entra 'y' o 'n'.");
                        resposta = input.next();
                        break;
                        
                    case 5:
                    	//Consulta el nombre de visitants que hi ha al parc en aquest moment
                        consultarNumVisit(p);
                        System.out.println("Vols continuar? Entra 'y' o 'n'.");
                        resposta = input.next();
                        break;

                    case 0:
                        System.out.println("Gràcies per acudir al parc.");
                        System.exit(0);

                    default:
                        System.out.println("Si us plau, introdueix un número vàlid.");
                        infoParcTest(p);
                }
            } catch (InputMismatchException ex) {
                System.out.println("Si us plau, introdueix un número.");
                infoParcTest(p);
                break;
            }
        } while (resposta.equalsIgnoreCase("y"));
        System.out.println("Gràcies per acudir al parc.");
    }

    /**
     * Funció per a fer l'operació de compra d'entrades.
     * Comença mostrant les entrades disponibles al parc, on s'ha d'escollir una d'aquestes.
     * Un cop s'introdueix el número identificador de visitant, es mostra la info del proces de compra
     */
    public static void transaccioEntrades(ParcAtraccio p) {
        Entrada eCopia;
        int eleccio, numVisit;
        boolean existeix = false;
        String resposta;
        Visitant v=null;
        Scanner input = new Scanner(System.in);
        System.out.println("Aquí pots comprar les entrades!\nSi us plau, entra un ID d'entrada:\n");
        for (int i = 0; i < p.getEntrades().size(); i++) { //Es recorren totes les entrades que hi ha disponibles.
            if (!p.getEntrades().get(i).getEstatCompra()) { //Si aquestes no han sigut comprades previament es mostren
                System.out.println("Id entrada: " + p.getEntrades().get(i).getIdEntrada()); 
            }
        }
        try {
            eleccio = input.nextInt();
            System.out.println("Identificat amb el nombre de visitant");
            numVisit = input.nextInt();
            for (int i = 0; i < p.getVisitants().size(); i++) {
                if(p.getVisitants().get(i).getNumVisitant()==numVisit){ //Si el numero id del visitant concorda, s'assigna.
                    v = p.getVisitants().get(i);
                }
            }
            //En el for d'abaix es mostra tota la info de la compra un cop aquesta s'ha pogut realitzar
            for (int i = 0; i < p.getEntrades().size(); i++) {
                if (p.getEntrades().get(i).getIdEntrada() == eleccio) {
                    p.comprarEntrada(eleccio);
                    v.pagarEntrada(p.getEntrades().get(i).getPreu());
                    v.setEntrada(p.getEntrades().get(i));
                    System.out.println("Et queden " + v.getDiners() + " €.");
                    System.out.println("Ja tens la teva entrada!");
                    eCopia = p.getEntrades().get(i).clone();   //Es fa ús del clone per tal de tenir una copia de l'entrada que s'ha comprat.
                    System.out.println("Ens quedem una copia de l'entrada, que gaudeixis!");
                    existeix = true;
                } else {
                    continue;
                }
            }
            if (!existeix) {
                System.out.println("Identificador no vàlid!");
                parcTest(p);
            }
            
        } catch (Exception e) {
            System.out.println("Identificador ha de ser un nombre.");
        }
    }

    /**
     * Funció que llista les atraccions (sense criteri alfabetic).
     * Recorre les atraccions que hi ha i les mostra amb la quantitat de gent que contenen.
     */
    public static void ordenaAtraccions(ArrayList<Atraccio> atraccions) {
        //Fa us del CompareTo que s'ha creat a la classe Atracicons per a fer l'ordenació
        Collections.sort(atraccions);
        for (int i = 0; i < atraccions.size(); i++) {
            System.out.println("L'atracció " + atraccions.get(i).getNomAtraccio() + ", té " + atraccions.get(i).getQuantitatGent() + " visitants.");
        }
    }

    /**
     * Es fa el mateix que a l'anterior.
     * En aquest cas es mostra la seguretat de cada atracció.
     */
    public static void infoAtraccions(ArrayList<Atraccio> atraccions) {
        System.out.println("Seguretat de les atraccions:");
        for (int i = 0; i < atraccions.size(); i++) {
            System.out.println("Atracció " + atraccions.get(i).getNomAtraccio() + ", té " + atraccions.get(i).getSeguretatAtraccio() + ".");
        }      
    }  
    
    /**
     * Es recorre l'array l'empleats i es mostra tota la informació d'aquests
     */
    public static void infoTreballadors(ArrayList<Empleat> empleats){
        for (int i = 0; i < empleats.size(); i++) {
            System.out.println(empleats.get(i).toString() + ".");
        } 
    }
    
    /**
     * Funció per a pujar a una atracció.
     * Primer es comprova el número de visitant i després es demana l'atracció a la que es vol pujar.
     * Si les condicions es compleixen, el visitant podrà pujar a l'atracció.
     */
    public static void pujarAtraccio(ParcAtraccio p){
        ArrayList<Visitant> visitants = p.getVisitants();
        Scanner input = new Scanner(System.in);
        String a, e;
        int resposta;
        System.out.println("Identificat amb el nombre de visitant");
        resposta = input.nextInt();
        System.out.println("Introdueix el nom de l'atracció a la que vols pujar");
        a = input.nextLine();
        a = input.nextLine();
        Atraccio atr=null;
        //En aquest primer for es comprova que l'atracció introduïda és correcte.
        for (int i = 0; i < p.getAtraccions().size(); i++) {
            if(p.getAtraccions().get(i).getNomAtraccio().toString().equals(a)){
                atr = p.getAtraccions().get(i);
            }
        } 
        //En aquest for hi ha un condicional el qual comprova el número de visitant, que es compleixen els requisits (altura) per a pujar i que es tracta d'un objecte en aquest cas Estandar
        for (int i = 0; i < visitants.size(); i++) {
            if(visitants.get(i).getNumVisitant()==resposta && p.getEmpleats().get(0).comprovaEntrada(visitants.get(i)).equals("OK") && visitants.get(i).getEntrada() instanceof Estandar){
                Estandar entradaEstandar = (Estandar)visitants.get(i).getEntrada();
                entradaEstandar.controlAtraccionsEstandar(visitants.get(i));
                System.out.println(visitants.get(i).pujarAtraccio(atr, p.getEmpleats().get(0)));
            }
        } 
        
        //Aquí es fa el mateix que a l'anterior però amb l'entrada de tipus ExpressPremium
        for (int i = 0; i < visitants.size(); i++) {
            if(visitants.get(i).getNumVisitant()==resposta && p.getEmpleats().get(0).comprovaEntrada(visitants.get(i)).equals("OK") && visitants.get(i).getEntrada() instanceof ExpressPremium){
                ExpressPremium entradaPremium = (ExpressPremium)visitants.get(i).getEntrada();
                entradaPremium.vegadesPrimeraFila(visitants.get(i));
                System.out.println(visitants.get(i).pujarPrimeraFilaAtraccio(atr, p.getEmpleats().get(0)));
            }
        }
    }
    
    //Aquesta funció consulta el nombre de visitants que hi ha al parc en aquell moment.
    static public void consultarNumVisit(ParcAtraccio p){
        System.out.println("El nombre de visitants del parc és: " + p.getNumVisitants());
    }
}
