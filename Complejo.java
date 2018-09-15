package Practica4;
/* Equipo 3
* Brito Segura Angel
* Carranza Escobar Luis Enrique
* Osnaya Molina Victor Iván
* Velázquez Méndez Diego Ignacio
*/

public class Complejo {
	  public float real;
	  public float imaginario;
	  
	  
	  public static float beta;
	  
	  public Complejo(){
	  }
	  
	  public Complejo(float real, float imaginario){
		  this.real = real;
		  this.imaginario = imaginario;
	  }
	  
	  public void imprime(){
		  System.out.println("El número complejo en forma binómica es: "+real+" + "+imaginario+"i");
	  }
	  
	  public void imprime(String rep){
		float radio;
		float angulo;
		radio = radio();
		angulo = angulo();
		if(rep.equals("B")){
			System.out.println("El número complejo introducido en forma binómica es: "+real+" + "+imaginario+"i");
		} else if(rep.equals("T")){
			System.out.println("El número complejo introducido en forma trigonométrica es: "+radio+"cis"+angulo);
		} else if(rep.equals("E")){
			System.out.println("El número complejo introducido en forma exponencial es: "+radio+"e^"+angulo);
		} else{
			System.out.println("Forma no reconocida del número complejo.");
		}
	  }
	  
	  public float radio(){
		  float radio;
		  radio = (float)Math.sqrt((real*real)+(imaginario*imaginario));
		  return radio;
	  }
	  
	  public float angulo(){
		  float angulo;
		  angulo = (float)Math.atan(real/imaginario);
		  return angulo;
	  }
	  
	  public Complejo conjugado(){
		  Complejo res= new Complejo();
		  res.real=real;
		  res.imaginario=imaginario*-1;
		  return res;
	  }
	  
	  public static Complejo suma(Complejo c1, Complejo c2){
		  Complejo res= new Complejo();
		  res.real= c1.real + c2.real;
		  res.imaginario = c1.imaginario + c2.imaginario;
		  return res;
	  }
	  
	  public static Complejo resta(Complejo c1, Complejo c2){
		  Complejo res= new Complejo();
		  res.real= c1.real - c2.real;
		  res.imaginario = c1.imaginario - c2.imaginario;
		  return res;
	  }
	  
	  public static Complejo multiplicacion(Complejo c1, Complejo c2){
		  Complejo res= new Complejo();
		  res.real= (c1.real*c2.imaginario)-(c1.imaginario*c2.real);
		  res.imaginario = (c1.real*c2.imaginario)+(c1.imaginario*c2.real);
		  return res;
	  }
	  
	  public static Complejo division(Complejo c1, Complejo c2){
		  Complejo res= new Complejo();
		  beta = (c2.real*c2.real)+(c2.imaginario*c2.imaginario);
		  res = multiplicacion(c1,c2.conjugado());
		  res.real = (1/beta)*res.real;
		  res.imaginario = (1/beta)*res.imaginario;
		  return res;
	  }
	  
}