/**************
 * 
 * Autor: Joel Francisco Figueroa Martínez

 * 
 * 
 * Fecha de creación: 07/04/2022
 * 
 * 
 * Fecha de modificación:
 * 
 * 
 * Descripción: uso de la clase de operaciones básicas
 * 
 * 
 */


package ejercicio1;

public class Main {
	
	
	public static Ejercicio1 operaciones;

	public static void main(String[] args) {
		
		
		int a = 144;
		int b = 999;
		
		operaciones = new Ejercicio1();
		
		operaciones.setA(a);
		operaciones.setB(b);
		
		
		operaciones.getResultados();
		

	}

}
