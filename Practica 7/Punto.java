
public class Punto {
	//protected int x, y;
	private int x, y;
	
	public Punto(){
		
	}
	
	public Punto(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public Punto(int val){
		this(val, val);
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
	
	public String toString(){
		return "Punto [x=" + x + ", y=" + y + "]";
	}
}
