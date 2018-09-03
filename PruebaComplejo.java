import java.util.Scanner;

public class PruebaComplejo {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.println("Dame el primer complejo parte real y parte imaginaria");
		Complejo c1 = new Complejo(lector.nextFloat(), lector.nextFloat());
		System.out.println("c1 en sus 3 formatos :");
		c1.imprime("B");
		c1.imprime("T");
		c1.imprime("E");

		System.out.println("\n");
		System.out.println("Dame el segundo complejo parte real y parte imaginaria");
		Complejo c2 = new Complejo(lector.nextFloat(), lector.nextFloat());	
		
		System.out.println("\nEl conjugado de c2 ");
		c2.conjugado().imprime();
		
		System.out.println("\n");
		c1.imprime();
		System.out.println("+");
		c2.imprime();
		System.out.println("----------------------------");				
		Complejo.suma(c1, c2).imprime();
		
		System.out.println("\n");
		c1.imprime();
		System.out.println("-");
		c2.imprime();
		System.out.println("----------------------------");				
		Complejo.resta(c1, c2).imprime();
		
		System.out.println("\n");
		c1.imprime();
		System.out.println("X");
		c2.imprime();
		System.out.println("----------------------------");				
		Complejo.multiplicacion(c1, c2).imprime();
		
		System.out.println("\n");
		c1.imprime();
		System.out.println("/");
		c2.imprime();
		System.out.println("----------------------------");
		Complejo.division(c1, c2).imprime();
		
		lector.close();

	}

}
