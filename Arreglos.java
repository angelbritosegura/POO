import java.util.Scanner;

public class Arreglos {
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);
		int arreglo[] = new int[10];
		for(int i = 0; i<10; i++){
			System.out.println("Dame n�mero " + (i+1) + ":");
			arreglo[i]=lector.nextInt();
		}
		for(int x=9; x>=0; x--){
			System.out.print("N�mero " + (x+1) + " introducido: ");
			System.out.println(arreglo[x]);
		}
		lector.close();
	}
}
