/* Equipo 3
* Brito Segura Angel
* Carranza Escobar Luis Enrique
* Osnaya Molina Victor Iván
* Velázquez Méndez Diego Ignacio
*/

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);
		
		int N;
		int extras;
		int normales;
		float precio;
		float nomina = 0;
		float trabajador;
		
		System.out.println("\nIngresa el número de empleados de tu empresa: ");
		N = lector.nextInt();
		int horas[] = new int[N];
		System.out.println("Precio por hora: ");
		precio = lector.nextFloat();
		System.out.println("Ingresa horas semanales trabajadas de cada trabajador.");
		for(int i = 0; i<N; i++){
			System.out.println("Trabajador " + (i+1) + ":");
			horas[i]=lector.nextInt();
			if(horas[i] > 40){
				extras = horas[i]-40;
				normales = horas[i] - extras;
				trabajador = (precio * normales) + ((float) (precio * extras * 1.3));
				nomina = nomina + trabajador;
				System.out.println("El trabajador "+(i+1)+" ganó: $"+trabajador);
			} else {
				trabajador = (precio * horas[i]);
				nomina = nomina + trabajador;
				System.out.println("El trabajador "+(i+1)+" ganó: $"+trabajador);
			}
		}
		System.out.println("\nEl total del pago de la nómina de "+N+" empleados es: $"+nomina);
		lector.close();
	}
}