
public class PruebaContador {

	public static void main(String[] args) {
		System.out.println("Objetos Creados "+ ContadorDeObjetos.objetosCreados);
		ContadorDeObjetos obj1 = new ContadorDeObjetos();
		System.out.println("Objetos Creados "+ ContadorDeObjetos.objetosCreados);
		ContadorDeObjetos obj2 = new ContadorDeObjetos(8);
		System.out.println("Objetos Creados "+ ContadorDeObjetos.objetosCreados);
		ContadorDeObjetos obj3 = new ContadorDeObjetos(520);
		
		System.out.println("Objetos Creados desde obj1 "+obj1.objetosCreados);
		System.out.println("Objetos Creados desde obj2 "+obj2.objetosCreados);
		System.out.println("Objetos Creados desde obj3 "+obj3.objetosCreados);
		
		System.out.println("Valor desde obj1 "+obj1.valor);
		System.out.println("Valor desde obj2 "+obj2.valor);
		System.out.println("Valor desde obj3 "+obj3.valor);
		
		obj1.imprimeValores();
		obj2.imprimeValores();
		obj3.imprimeValores();
	}

}
