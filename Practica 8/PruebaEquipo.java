/* Equipo 3
* Brito Segura Angel
* Carranza Escobar Luis Enrique
* Osnaya Molina Victor Iván
* Velázquez Méndez Diego Ignacio
*/
import practica8.Equipo;

public class PruebaEquipo implements Equipo {
	private int numero;

	public PruebaEquipo(){
		numero=3;
	}

	public String cualEsTuNumeroDeEquipo(){
		return "número "+numero;
	}

	public void muestraNombresDeIntegrantes(){
		System.out.println("Brito Segura Angel");
		System.out.println("Carranza Escobar Luis Enrique");
		System.out.println("Osnaya Molina Víctor Iván");
		System.out.println("Velázquez Méndez Diego Ignacio");
	}

}
