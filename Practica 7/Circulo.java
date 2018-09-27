package geometria;

public class Circulo implements FiguraGeometrica {
	final float PI = 3.14159f;
	private float radio;
	
	public float getRadio(float radio){
		return radio;
	}
	
	public void setRadio(float radio){
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