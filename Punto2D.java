package mx.unam.ingenieria.poo.practica6;
/**
 * Esta clase genera un Punto en 2D 
 * @author Equipo 3
 * @version 1
 *
 */
public class Punto2D {
	private int x;
	private int y;
	
	/**
	 * Constructor que pide como parametros las coordenadas del punto
	 * @param x: Valor entero, coordenada x de (x,y)
	 * @param y: Valor entero, coordenada y de (x,y)
	 */
	public Punto2D(int x, int y){
		super();
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Metodo getter que obtiene el valor de la coordenada x del punto
	 * @return x: el valor entero de la coordenada x
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * Metodo getter que obtiene el valor de la coordenada x del punto
	 * @return y: el valor entero de la coordenada y
	 */
	public int getY(){
		return y;
	}
	
	/**
	 * Metodo que calcula la distancia entre dos Puntos en 2D
	 * @param otro: es un Punto2D con coordenadas (x,y)
	 * @return valor double: este valor es la distancia entre el punto construido y el otro que entro como parametro
	 */
	public double distanciaA(Punto2D otro){
		return Math.sqrt(Math.pow(otro.x - x, 2) + Math.pow(otro.y - y, 2));
	}
}