package geometria;

public class FiguraCartesiana {
	public static String nombre = "Figura Cartesiana";
	private int x, y;
	
	public void imprimeNombre(){
		System.out.println("Me llamo "+ nombre);
	}
	
	public int getX(){
		return x;
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public int getY(){
		return y;
	}
	
	public void setY(int y){
		this.y = y;
	}
	
	public void imprimeCoordenadas(){
		System.out.println("x = " + x + " y = "+y);
	}
}
