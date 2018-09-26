/* Equipo 3
* Brito Segura Angel
* Carranza Escobar Luis Enrique
* Osnaya Molina Victor Iván
* Velázquez Méndez Diego Ignacio
*/
package practica7;

public class PruebaHerencia {
	public static void main(String[] args) {
		ClasePadre objetoDeClasePadre = new ClasePadre();
		ClaseHija objetoDeClaseHija = new ClaseHija();
		
		System.out.println("Llamando a metodoA desde un objeto de ClasePadre: ");
		objetoDeClasePadre.metodoA();
		System.out.println("Llamando a metodoA desde un objeto de ClaseHija: ");
		objetoDeClaseHija.metodoA();
	}

}
