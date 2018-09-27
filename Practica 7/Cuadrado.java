package geometria;

public class Cuadrado implements FiguraGeometrica {
	private float lado;
	
	public float getLado(float lado){
		return lado;
	}
	
	public void setLado(float lado){
		this.lado = lado;
	}
		
	public float area(){
		return lado * lado;
	}
	
	public float perimetro(){
		return 4 * lado;
	}
	
	public String toString(){
		return "Cuadrado [lado=" + lado + "]";
	}
}
