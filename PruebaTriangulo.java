
public class PruebaTriangulo {
	public static void main(String [] args){
		Triangulo triangulo = new Triangulo();
		System.out.println("Per�metro equil�tero: " + triangulo.perimetro(5.5f));
		System.out.println("Per�metro is�celes: " + triangulo.perimetro(5.5f, 7.2f));
		System.out.println("Per�metro escaleno: " + triangulo.perimetro(5.5f, 3.5f, 2.6f));
	}
}
