
public class PruebaPunto {
	public static void main(String[] args){
		Punto p1 = new Punto(5,8);
		System.out.println(p1);
		
		Punto x = new Punto(7,2);
		System.out.println("El otro punto es: "+ x);
		
		Punto p = new Punto();
		p.setX(5);
		p.setY(8);
		System.out.println(p);
	}
}
