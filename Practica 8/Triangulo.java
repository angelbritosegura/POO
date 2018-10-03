package geometria;

public class Triangulo implements FiguraGeometrica {
		float lado; 
		float altura;
		
	public Triangulo(float lado, float altura) {
		this.altura = altura;
		this.lado = lado;
	}
	
	public float getLado(float lado){
		return lado;
	}
	
	public void setLado(float lado){
		this.lado = lado;
	}
	
	public float getAltura(float lado){
		return lado;
	}
	
	public void setAltura(float lado){
		this.lado = lado;
	}
	public float area() {
		return (lado * altura)/ 2;
	}

	public float perimetro() {
        return lado * 3;
	}
	
	public String toString(){
		return "Triángulo [lado=" + lado + ", altura="+altura+"]";
	}

}
