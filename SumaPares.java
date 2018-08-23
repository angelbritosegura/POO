import java.util.Scanner;

public class SumaPares {
	public static void main(String[] args){
		//Declaraci�n de variables
		int n1, n2;
		int suma = 0;
		int mayor, menor;
		Scanner sc = new Scanner(System.in);
		//Pedir datos al usuario
		System.out.println("Por favor introduzca un n�mero entero: ");
		n1 = sc.nextInt();
		System.out.println("Introduzca otro n�mero entero: ");
		n2 = sc.nextInt();
		//Validar cual es el n�mero mayor y el menor
		if(n1 > n2){
			mayor = n1;
			menor = n2;
		} else {
			mayor = n2;
			menor = n1;
		}
		//Hacer un ciclo desde el menor hasta el mayor
		for(int i = menor; i <=mayor; i++){
			//Validar si es par para sumarlo
			if( i % 2 == 0){
				suma += i;
			}
		}
		//Imprimir el resultado
		System.out.println("La suma de los pares entre "+ menor + " y " + mayor + " es "+suma);
		sc.close();
	}
}
