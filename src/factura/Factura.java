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
 * Descripción: clase factura: permite calcular una factura a partir de un monto inicial.
 * 
 * 
 */

package factura;

public class Factura {

	private double base;

	public void getTotalFactura() {

		System.out.println("el total es " + ((this.base * .16) + base));

	}

	// getter & setters
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

}
