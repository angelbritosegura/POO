//Práctica 4
public class Circulo {
	final float PI = 3.14159f;
	private float radio;
	
	public float getRadio(float radio){
		return radio;
	}
	//Práctica 5
	public void setRadio(float radio){
		if(radio <0){
			radio = 0;
		}
		this.radio = radio;
	}
	
	public float perimetro(){
		return 2 * PI * radio;
	}
	
	public float area(){
		return PI * radio * radio;
	}
	
	public String toString(){
		return "Círculo [radio=" + radio + "]";
	}
}
