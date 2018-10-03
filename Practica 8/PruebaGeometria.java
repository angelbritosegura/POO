package geometria;

import java.util.Scanner;

public class PruebaGeometria {
	public static void main(String[] args) {
		
		FiguraGeometrica fig2 = new Circulo(0.0f);
		System.out.println(fig2 + "�rea: " + fig2.area() + " Per�metro : "+fig2.perimetro());
	    
		Scanner lector = new Scanner(System.in);
	    int opcion;
	    float lado;
	    float altura;
	    float radio;
	    
	    do{
	    	FiguraGeometrica fig = null;
	    	System.out.println("\tMen� \tFiguras Geom�tricas");
	        System.out.println("1. Tri�ngulo equil�tero.");
	        System.out.println("2. C�rculo.");
	        System.out.println("3. Cuadrado.");
	        System.out.println("4. Salir");
	        System.out.println("Elige una opci�n: ");
		    opcion = lector.nextInt();    
		    switch(opcion){
		    case 1:
		    	System.out.println("Ingresa un lado del tri�ngulo equil�tero: ");
		        lado = lector.nextFloat();
		        System.out.println("Ingresa la altura del tri�ngulo equil�tero: ");
		        altura = lector.nextFloat();
		        fig = new Triangulo(lado, altura);
		       	break;
		    case 2:
		     	System.out.println("Ingresa el radio del c�rculo: ");
		       	radio = lector.nextFloat();
		       	fig = new Circulo(radio);
		       	break;
		    case 3:
		       	System.out.println("Ingresa un lado del cuadrado: ");
		       	lado = lector.nextFloat();
		       	fig = new Cuadrado(lado);
				break;
		    case 4:
		       	System.out.println("Fin del programa.");
		       	break;
		    default:
		       	System.out.println("Solo n�meros entre 1 y 4\n");
		       	break;
		    }
		    System.out.println(fig+" �rea: "+fig.area() + " Per�metro: "+fig.perimetro());
		  }while(opcion!=4);
	    lector.close();
		}
	}