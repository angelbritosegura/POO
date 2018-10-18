package mx.unam.poo.practica10;

public class ExcepcionSimple {

	public static void main(String[] args){
		int dato = 0, cuadrado;
		try{
			dato = Integer.parseInt(args[0]);
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("No se mandó el argumento requerido");
		} catch(NumberFormatException e){
			System.out.println("Argumento diferente a la variable int");
		} catch(Exception e){
			System.out.println("Error: excepción general");
		}
		cuadrado = dato * dato;
		System.out.println("El cuadrado del número es: " + cuadrado);
	}
}
