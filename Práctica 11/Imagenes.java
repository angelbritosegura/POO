/* Equipo 3
* Brito Segura Angel
* Carranza Escobar Luis Enrique
* Osnaya Molina Victor Iván
* Velázquez Méndez Diego Ignacio
*/
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Imagenes {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		byte[] buffer = new byte[81];
		int nbytes=0;
		try{
			String origen=args[0];
			String destino=args[1];
			fis = new FileInputStream(origen);
			File archivo = new File(destino);
			if(archivo.exists()==false) {
				archivo.createNewFile();
			}
			while(true) {
				nbytes = fis.read(buffer, 0, 1);
				if(nbytes == -1) {
					break;
				}
				fos = new FileOutputStream(destino, true);
				fos.write(buffer, 0, nbytes);
				/*String texto = new String(buffer, 0, nbytes);
				System.out.println(texto);*/
			}
			System.out.println("Número de bytes leídos: "+fis.readAllBytes().length+" y en el archivo: "+destino);
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("No se mandaron los argumentos requeridos");
		} catch(IOException e){
			System.out.println("\nError al abrir los archivos");
		}finally {
			try {
				if(fis!=null)
					fis.close();
				if(fos!=null)
					fos.close();
			} catch (IOException ioe) {
				System.out.println("Error al cerrar los archivos.");
			}
		
		}
}
}