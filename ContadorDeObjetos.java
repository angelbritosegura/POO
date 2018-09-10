
public class ContadorDeObjetos {
	static int objetosCreados = 0;
	int valor;
	
	public ContadorDeObjetos(){
		System.out.println("Creando un objeto");
		objetosCreados++;
	}
	
	public ContadorDeObjetos(int valor){
		this();
		this.valor = valor;
	}
	
	public void imprimeValores(){
		System.out.println("Mi valor = "+valor);
		System.out.println("Objetos creados = "+objetosCreados);
	}
}
