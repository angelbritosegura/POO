package practica8.impl;

import practica8.ClaseHija;
import practica8.ClasePadre;

public class PruebaMetodosPolimorficos {
	public static void main(String[] args) {
		new PruebaMetodosPolimorficos().prueba();
	}
	public void prueba() {
		ClasePadre objetoPadreVariablePadre = new ClasePadre();
		llamaMetodosEnClase(objetoPadreVariablePadre);
		
		ClaseHija objetoHijaVariableHija = new ClaseHija();
		llamaMetodosEnClase(objetoHijaVariableHija);

		ClasePadre objetoHijaVariablePadre = new ClaseHija();
		llamaMetodosEnClase(objetoHijaVariablePadre);
	}

	public void llamaMetodosEnClase(ClasePadre objeto) {
		objeto.metodoEnClasePadre();
	}
	public void llamaMetodosEnClase(ClaseHija objeto) {
		objeto.metodoEnClaseHija();
	}
}