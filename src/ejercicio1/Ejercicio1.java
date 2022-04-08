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
 * Descripción: clase de operaciones básicas
 * 
 * 
 */

package ejercicio1;

public class Ejercicio1 {

	private int a;
	private int b;

	public int sumar() {

		return a + b;

	}

	public int restar() {

		return a - b;

	}

	public int multiplicar() {

		return a * b;

	}

	public int dividir() {

		return a / b;

	}

	public void getResultados() {

		System.out.println("la suma de " + a + " + " + b + " = " + this.sumar());
		System.out.println("la resta de " + a + " - " + b + " = " + this.restar());
		System.out.println("la multiplicación de " + a + " * " + b + " = " + this.multiplicar());
		System.out.println("la divición de " + a + " / " + b + " = " + this.dividir());

	}

	// getters & setters
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

}
