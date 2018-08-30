/* Equipo 3
* Brito Segura Angel
* Carranza Escobar Luis Enrique
* Osnaya Molina Victor Iv�n
* Vel�zquez M�ndez Diego Ignacio
*/

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class Ejercicio1 {	
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
	    int opcion;
	    String participante;
	    Hashtable<String, Integer> Participantes = new Hashtable <String, Integer>();
	    do{
	    	System.out.println("\tMen� \tSURVIVOR");
	        System.out.println("1. Dar de alta un nuevo partipante.");
	        System.out.println("2. Ver lista de participantes.");
	        System.out.println("3. Votaci�n.");
	        System.out.println("4. Expulsar al m�s votado");
	        System.out.println("5. Salir");
	           
	        System.out.println("Elige una opci�n: ");
	        opcion = lector.nextInt();
	            
	        switch(opcion){
	               case 1:
	                   	System.out.println("Ingresar nombre de nuevo participante: ");
	                   	participante = lector.next();
	                   	Participantes.putIfAbsent(participante, 0);            
	                   	break;
	               case 2:
	            	   	if(Participantes.isEmpty() == false){
	            	   		System.out.println("Participantes:");
		            	   	for (String clave : Participantes.keySet()){
		           				System.out.println(clave);
		           			}
		            	   	System.out.println("\n");
	            	   	} else {
	            	   		System.out.println("No hay participantes en el reality show.");
	            	   		System.out.println("\n");
	            	   	}
	           			break;
	                case 3:
	                	System.out.println("Ingresar nombre del participante a votar: ");
	                   	participante = lector.next();
	                   	if (Participantes.containsKey(participante) == false){
	                   		System.out.println("Participante no encontrado. Imposible votar.");
	                   		System.out.println("\n");
	                   	} else {
	                   		Integer votos;
	                   		votos = Participantes.get(participante);
	                   		Participantes.replace(participante, (votos+1));
	                   		System.out.println("Participante "+participante+" ha sido votado.");
	                   		System.out.println("\n");
	                   	}
	                	break;
	                case 4:
	                	String clave, eliminado;
	           			Integer valor, max;
	           			max = 0;
	           			eliminado = null;
	            	   	Enumeration<String> claves = Participantes.keys();
	            	   	System.out.println("Participantes antes de la expulsi�n:");
	            	   	if(Participantes.isEmpty() == true){
	            	   		System.out.println("No hay participantes en el reality show.");
	            	   		System.out.println("\n");
	            	   	} else {
	            	   		while(claves.hasMoreElements()){
		           				clave = claves.nextElement();
		           				valor = Participantes.get(clave);
		           				if(max<valor){
		           					max = valor;
		           					eliminado = clave;
		           				}
		           				System.out.println("Participante: "+clave+"\tVotos: "+valor);
		           			}
		           			System.out.println("\nEl participante eliminado fue "+eliminado+" con "+max+" votos");
		           			Participantes.remove(eliminado);
		           			System.out.println("\nParticipantes que quedan en competencia:");
		           			if(Participantes.isEmpty() == true){
		            	   		System.out.println("No hay participantes en el reality show.");
		            	   		System.out.println("\n");
		            	   	} else {
		            	   		String nombre;
			           			Integer voto;
			            	   	Enumeration<String> nombres = Participantes.keys();
		            	   		while(nombres.hasMoreElements()){
			           				nombre = nombres.nextElement();
			           				voto = Participantes.get(nombre);
			           				System.out.println("Participante: "+nombre+"\tVotos: "+voto);
			           			}
		            	   		System.out.println("\n");
		            	   	}
	            	   	}
	            	   	break;
	                case 5:
	                	System.out.println("Fin del reality show. Hasta pronto");
	                	break;
	                default:
	                	System.out.println("Solo n�meros entre 1 y 5\n");
	                	break;
	           }
	       }while(opcion!=5);
	       lector.close();
	}
}