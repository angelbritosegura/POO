
public class Punto3D extends Punto {
	private int z;
	
	public Punto3D(){
		super();
	}
	
	public Punto3D(int x, int y, int z){
		super(x, y);
		this.z = z;
	}
	
	public Punto3D(int val){
		this(val, val, val);
	}
	
	public int getZ(){
		return z;
	}
	
	public void setZ(int z){
		this.z = z;
	}
	
	public String toString(){
		return "Punto 3D [x=" + getX() + ", y=" + getY() + ", z="+z+"]";
		//Con protected se puede hacer [x=" + x + ", y=" + y +", z="+z+"]";
	}
	
	public Punto3D inviertePunto(){
		return new Punto3D(-getX(), -getY(), -z);
	}
}
