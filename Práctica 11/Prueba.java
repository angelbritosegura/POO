/* Realizado por:
* Brito Segura Angel
* Osnaya Molina Victor Iván
*/
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Prueba {

	public static void main(String[] args) {
		String nombre;
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserta el nombre del archivo con su extensión: ");
		nombre=sc.nextLine();
		try {
			BufferedReader br;
			FileReader fr = new FileReader(nombre);
			br = new BufferedReader(fr);
			String linea = br.readLine();
			File archivo = new File("mayusculas.txt");
			archivo.createNewFile();
			while (linea != null) {
				BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true));
				PrintWriter pw = new PrintWriter(writer);
				pw.println(linea.toUpperCase());
				pw.close();
				writer.close();
				linea = br.readLine();
			}
			br.close();
		} catch (IOException ioe) {
			System.out.println("\n\nError al abrir o guardar el archivo: ");
			ioe.printStackTrace();
		}
		sc.close();
	}
}
