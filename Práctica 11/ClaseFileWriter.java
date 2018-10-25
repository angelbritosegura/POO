import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;

public class ClaseFileWriter {

	public static void main(String[] args) {
		String texto = "";
		try {
			BufferedReader br;
			br = new BufferedReader();
			
			br.close();
		} catch (IOException ioe) {
			System.out.println("\n\nError al abrir o guardar el archivo: ");
			ioe.printStackTrace();
		} catch (Exception e) {
			System.out.println("\n\nError al leer de teclado:");
			e.printStackTrace();
		}
	}

}
