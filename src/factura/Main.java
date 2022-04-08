/******************************************
 * 											*
 * Autor: Joel Francisco Figueroa Martínez
 * 											*
 * 											*
 * Fecha de creación: 07/04/2022
 * 											*
 * 											*
 * Fecha de modificación:
 * 											*
 * 											*
 * Descripción: uso de la clase factura
 * 											*
 * 											*
 *********************************************/

package factura;

public class Main {

	public static Factura factura;

	public static void main(String[] args) {

		double base = 150;

		factura = new Factura();

		factura.setBase(base);

		factura.getTotalFactura();

	}

}
