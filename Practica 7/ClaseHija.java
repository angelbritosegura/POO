package practica7;

public class ClaseHija extends ClasePadre{
	public void metodoA(){
		 System.out.println("Es la version de la clase hija que se ejecuta");
		 super.metodoA();
	}

	public void metodoFinal(){
		System.out.println("Se ejecuta metodoFinal() desde la clase hija");
	}
}