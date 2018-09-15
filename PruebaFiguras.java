//Práctica 4
public class PruebaFiguras {
	public static void main(String [] args){
		Circulo cir = new Circulo();
		cir.setRadio(7.2f);
		System.out.println("El área es " + cir.area());
		//Práctica 5
		cir.setRadio(-8.5f);
		System.out.println("El área con radio negativo es " + cir.area());
	}
}