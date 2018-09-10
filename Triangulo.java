
public class Triangulo {
	float base, altura;
	
	public float area(){
		return (base*altura)/2;
	}
	
	public float perimetro(float lado){
		return lado*3;
	}
	
	public float perimetro(float lado, float base){
		return lado * 2 + base;
	}
	
	public float perimetro(float ladoA, float ladoB, float ladoC){
		return ladoA + ladoB + ladoC;
	}
}
