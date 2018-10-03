package geometria;

public class PruebaCartesiana {

	public static void main(String[] args) {
		Circulo cir = new Circulo(5.3f, 1, 2);
		cir.imprimeNombre();
		cir.imprimeCoordenadas();
		cir.area();
		cir.perimetro();
		
		FiguraCartesiana cartesiana = new FiguraCartesiana();
		cartesiana = cir;
		cartesiana.imprimeNombre();
		cartesiana.imprimeCoordenadas();
		/*No estan en el padre
		cartesiana.area();
		cartesiana.perimetro();*/
		
		/*Es una interfaz, no crea objetos
		FiguraGeometrica geometrica = new FiguraGeometrica();*/
		FiguraGeometrica geometrica = cir;
		/*No estan en la interfaz
		geometrica.imprimeNombre();
		geometrica.imprimeCoordenadas();*/
		geometrica.area();
		geometrica.perimetro();
	}

}
