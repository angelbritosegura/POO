/* Equipo 3
* Brito Segura Angel
* Carranza Escobar Luis Enrique
* Osnaya Molina Victor Iván
* Velázquez Méndez Diego Ignacio
*/

import java.util.Scanner;
 
public class Ejercicio3 {
 
     
    public static void main(String[] args) {
         
       Scanner lector = new Scanner(System.in);
       int opcion;
       float x;
       float y;
       float z;
       float p;
       float t;
       float f;

       do{
           System.out.println("\nElija el tipo de conversión que desea hacer: "); 
           System.out.println("1. De Rectangulares a Esféricas.");
           System.out.println("2. De Esféricas a Rectangulares");
           System.out.println("3. Salir.");
           System.out.println("Escribe una de las opciones: ");
           opcion = lector.nextInt();
            
           switch(opcion){
               case 1:
                   System.out.println("\nIngresa las coordenadas cartesianas: ");
                   System.out.print("x:");
                   x = lector.nextFloat();
                   System.out.print("y:");
                   y = lector.nextFloat();
                   System.out.print("z:");
                   z = lector.nextFloat();

                   f = (float) Math.atan(y/x);
                   p = (float) Math.sqrt(Math.pow(x,2.0) + Math.pow(y,2.0) + Math.pow(z,2.0));
                   t = (float) Math.acos(z/p);

                   System.out.println("\nTus coordenadas cartesianas ("+x+","+y+","+z+") a coordenas esféricas es: ("+p+","+t+","+f+")");
                   break;
               case 2:
                   System.out.println("\nIngresa las coordenadas esféricas (ro, theta, phi): ");
                   System.out.print("ro:");
                   p = lector.nextFloat();
                   System.out.print("theta:");
                   t = lector.nextFloat();
                   System.out.print("phi:");
                   f = lector.nextFloat();
                   
                   x = p * ((float) (Math.sin(t) * Math.cos(f)));
                   y = p * ((float) (Math.sin(t) * Math.sin(f)));
                   z = p * ((float) (Math.cos(t)));

                   System.out.println("\nTus coordenas esféricas es: ("+p+","+t+","+f+") a coordenadas cartesianas es ("+x+","+y+","+z+")");
                   break;
                case 3:
                	 System.out.println("Hasta pronto.\n");
                   break;
                default:
                   System.out.println("Opción no posible.\n");
                   break;
           }
       }while(opcion!=3);
      lector.close();
    }    
}