package mx.unam.ingenieria.poo.practica6;

import mx.unam.ingenieria.poo.practica6.v1.*;

public class PruebaFullyQualifiedName {
	
	public static void main(String[] args){
		Alumno alumnoV1 = new Alumno("Juan Perez", "97104982");
		System.out.println("alumnov1:"+ alumnoV1);
		mx.unam.ingenieria.poo.practica6.v2.Alumno alumnoV2 = new mx.unam.ingenieria.poo.practica6.v2.Alumno("Pedro Lopez", "99147896", "Ingenieria");
		System.out.println("alumnov2:"+ alumnoV2);
	}
}