
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
		
		Punto3D p3 = new Punto3D();
		p3.setX(1);
		p3.setY(6);
		p3.setZ(7);
		System.out.println("Punto 3D: "+ p3);
		
		Punto3D puntoInvertir = new Punto3D(8,9,-5);
		System.out.println("Punto 3D invertido: "+ puntoInvertir.inviertePunto());
		
		/* p no tiene el metodo inviertePunto()
		System.out.println("Punto invertido: "+ p.inviertePunto());*/
	}
}
