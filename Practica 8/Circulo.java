package geometria;

public class Circulo extends FiguraCartesiana implements FiguraGeometrica {
	//final float PI = 3.14159f;
	static float PI = 3.14159f;
	private float radio;
	public static String nombre = "Circulo";
	
	public Circulo(float radio){
		this.radio=radio;
	}
	
	public Circulo(float radio, int x, int y){
		this(radio);
		setX(x);
		setY(y);
	}
	
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