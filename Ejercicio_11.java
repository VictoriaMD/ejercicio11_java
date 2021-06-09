package tp1;
import java.util.Scanner;
public class Ejercicio_11 {
 private static Scanner leerInput = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  String fecha;
      String nombre;
      String producto;
      int cantidad;
      double precio;
      
      System.out.println("Fecha de compra: ");
      fecha = leerInput.next();
      System.out.println("Nombre del comprador: ");
      nombre = leerInput.next();
      System.out.println("Producto solicitado: ");
      producto = leerInput.next();
      System.out.println("Cantidad solicitada: ");
      cantidad = leerInput.nextInt();
      System.out.println("Precio unitario: $");
      precio = leerInput.nextInt();
      
      System.out.println();
      System.out.println("Fecha de compra: " + fecha);
      System.out.println("Nombre del comprador: " + nombre);
      System.out.println("Producto solicitado: " + producto);
      System.out.println("Cantidad solicitada: " + cantidad);
      System.out.println("Precio unitario: $" + precio);
      System.out.println("Total a pagar: $" + (precio * cantidad));
      
      
      leerInput.close();
	}

}
