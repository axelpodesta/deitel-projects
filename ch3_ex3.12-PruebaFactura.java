//Esta es la clase PruebaFactura.java que pone a prueba las funcionalidad de Factura.java
import java.util.Scanner;
public class PruebaEj3_12 {
	public static void main(String[] args) {
		
	Ej3_12 factura1 = new Ej3_12("001525", "dynamo_15mw", 5, 25000.50);//Aquí construí una factura mediante el constructor definido
	Ej3_12 factura2 = new Ej3_12("000000", "sin datos", 0, 0.0);
	
	System.out.println("Los datos que figuran en Factura 1 mediante constructor son: ");
	System.out.printf("El codigo de pieza es %s%n", factura1.getnPieza());
	System.out.printf("El nombre del producto es %s%n", factura1.getiPieza());
	System.out.printf("El precio unitario es $%.2f%n", factura1.getpUnit());
	System.out.printf("La cantidad pedida es %d%n%n", factura1.getqPed());
	
	System.out.printf("Ahora lo que vamos hacer es definir datos para la Factura 2, y luego facturar: %n%n");
	Scanner input = new Scanner(System.in);
	
	System.out.printf("Por favor ingrese el codigo de pieza:%n");
	String nPieza = input.nextLine();
	factura2.setnPieza(nPieza);
	System.out.printf("El codigo digitado es %s%n%n", nPieza);
	
	System.out.printf("Por favor ingrese la descripcion de la pieza:%n");
	String iPieza = input.nextLine();
	factura2.setiPieza(iPieza);
	System.out.printf("Los datos de la pieza son %s%n", iPieza);
	
	System.out.printf("Por favor ingrese el precio unitario%n%n");
	double pUnit = input.nextDouble();
	factura2.setpUnit(pUnit);
	System.out.printf("El precio unitario definido es $%.2f%n%n", pUnit);
	
	System.out.printf("Por favor ingrese la cantidad a facturar %n");
	int qPed = input.nextInt();
	factura2.setqPed(qPed);
	System.out.printf("La cantidad vendida es %d%n%n", qPed);
	
	//En esta sección, agregada por mí, se puede ver como a pesar de que los nombres de las variables
	//son iguales, los valores originales se han mantenido dado que factura1 tiene su propio juego de variables
	//esto permite que no proliferen inútilmente los nombres de variables.
	System.out.println("Los datos que figuran en Factura 1 mediante constructor son: ");
	System.out.printf("El codigo de pieza es %s%n", factura1.getnPieza());
	System.out.printf("El nombre del producto es %s%n", factura1.getiPieza());
	System.out.printf("El precio unitario es $%.2f%n", factura1.getpUnit());
	System.out.printf("La cantidad pedida es %d%n%n", factura1.getqPed());
	
	System.out.printf("Ahora vamos a obtener el monto de la factura 2 %n");
	System.out.printf("El total a facturar al cliente es $%.2f%n", factura2.obtenerMontoFactura());
	
	}
}
