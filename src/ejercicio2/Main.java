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
 * Descripción: uso de la clase persona
 * 
 * 
 */

package ejercicio2;

import java.util.Scanner;

public class Main {
	
	
	public static Persona yo;
	public static Scanner scan;
	
	
	public static void main(String[] args) {

		scan = new Scanner(System.in);
		yo = new Persona();
		
		System.out.println("ingrese su nombre");
		String nombre = scan.nextLine();		
		
		System.out.println("ingrese su dirección");
		String direccion = scan.nextLine();
		
		System.out.println("ingrese su teléfono");
		String telefono = scan.nextLine();
		
		
		yo.setNombre(nombre);
		yo.setDireccion(direccion);
		yo.setTelefono(telefono);
		
		System.out.println(yo.getNombre() + yo.getDireccion() + yo.getTelefono());
		
		
		
		
		
		
		
	}

}
