package geometria;

import java.util.Scanner;

public class PruebaGeometria {
	public static void main(String[] args) {
		
		FiguraGeometrica fig2 = new Circulo(0.0f);
		System.out.println(fig2 + "Área: " + fig2.area() + " Perímetro : "+fig2.perimetro());
	    
		Scanner lector = new Scanner(System.in);
	    int opcion;
	    float lado;
	    float altura;
	    float radio;
	    
	    do{
	    	FiguraGeometrica fig = null;
	    	System.out.println("\tMenú \tFiguras Geométricas");
	        System.out.println("1. Triángulo equilátero.");
	        System.out.println("2. Círculo.");
	        System.out.println("3. Cuadrado.");
	        System.out.println("4. Salir");
	        System.out.println("Elige una opción: ");
		    opcion = lector.nextInt();    
		    switch(opcion){
		    case 1:
		    	System.out.println("Ingresa un lado del triángulo equilátero: ");
		        lado = lector.nextFloat();
		        System.out.println("Ingresa la altura del triángulo equilátero: ");
		        altura = lector.nextFloat();
		        fig = new Triangulo(lado, altura);
		       	break;
		    case 2:
		     	System.out.println("Ingresa el radio del círculo: ");
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
		       	System.out.println("Solo números entre 1 y 4\n");
		       	break;
		    }
		    System.out.println(fig+" Área: "+fig.area() + " Perímetro: "+fig.perimetro());
		  }while(opcion!=4);
	    lector.close();
		}
	}