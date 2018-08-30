/* Equipo 3
* Brito Segura Angel
* Carranza Escobar Luis Enrique
* Osnaya Molina Victor Iván
* Velázquez Méndez Diego Ignacio
*/

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);

		int dia;
		int mes;
		int ano;
		
		System.out.println("\nIngresa la fecha: ");
		System.out.print("dia:");
        dia = lector.nextInt();
        System.out.print("mes:");
        mes = lector.nextInt();
        System.out.print("año:");
        ano = lector.nextInt();
        if (dia >= 1 && dia<= 28){
        	if(mes == 2){
        		if(ano > 0){
        			System.out.println("Fecha correcta.");
        			if(dia == 28){
        				System.out.println("Día siguiente: "+(dia+1)+"/"+mes+"/"+ano);
        			}
        		}
        	}
        }
        if (dia >= 1 && dia<= 31){
        	if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
        		if(ano > 0){
        			System.out.println("Fecha correcta.");
        			if(mes == 12){
        				System.out.println("Día siguiente: 1/1/"+(ano+1));
        			} else {
        				if(dia == 31)
        				System.out.println("Día siguiente: "+(dia+1)+"/"+(mes+1)+"/"+ano);
        			}
        		}
        	}
        }
        if (dia >= 1 && dia<= 30){
        	if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
        		if(ano > 0){
        			System.out.println("Fecha correcta.");
        				if(dia == 30)
        				System.out.println("Día siguiente: "+(dia+1)+"/"+(mes+1)+"/"+ano);
        			}
        		}
        	}
        lector.close();
    }
}
