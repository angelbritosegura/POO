/* Equipo 3
* Brito Segura Angel
* Carranza Escobar Luis Enrique
* Osnaya Molina Victor Iván
* Velázquez Méndez Diego Ignacio
*/
import practica8.Persona;
import practica8.Estudiante;

public class PruebaActividad5 implements Persona, Estudiante {
	private String nombre;
	private String escuela;

	public PruebaActividad5(){
		nombre = "Equipo 3";
		escuela = "UNAM";
	}

	public PruebaActividad5(String nombre, String escuela){
		this.nombre = nombre;
		this.escuela = escuela;
	}	

	public String cualEsTuNombre(){
		return nombre;
	}

	public String enDondeEstudias(){
		return escuela;
	}
	/*
	public void muestraNombresDeIntegrantes(){
		System.out.println("Brito Segura Angel");
		System.out.println("Carranza Escobar Luis Enrique");
		System.out.println("Osnaya Molina Víctor Iván");
		System.out.println("Velázquez Méndez Diego Ignacio");
	}*/

}