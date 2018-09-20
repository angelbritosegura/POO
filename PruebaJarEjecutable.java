package mx.unam.ingenieria.poo.practica6;

public class PruebaJarEjecutable {
	public static void main(String[] args){
		System.out.println("Se ejecuto la clase: "
			+ PruebaJarEjecutable.class.getName()
			+ "Desde el archivo:"
			+ PruebaJarEjecutable.class.getProtectionDomain().getCodeSource().getLocation());
	}
}