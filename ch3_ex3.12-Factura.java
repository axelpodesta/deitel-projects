//Esto es la clase Factura.java que luego debe ser ejecutada con la clase PruebaFactura.java
public class Ej3_12 {
	private String nPieza;//Variable de instancia, numero en el inventario
	private String iPieza;//Variable de instancia, info de la pieza, nombre
	private int qPed;//Variable de instancia, cantidad pedida
	private double pUnit;//Variable de instancia, precio
	
	public Ej3_12(String nPieza, String iPieza, int qPed, double pUnit) {
		this.nPieza = nPieza;
		
		this.iPieza = iPieza;
		
		if (qPed > 0) {
			this.qPed = qPed;
		}
		
		if (pUnit > 0.0) {
			this.pUnit = pUnit;
		}
		
	}
	
	//Ahora voy a escribir los cuatro metodos establecer
	
	public void setnPieza(String nPieza) {
		this.nPieza = nPieza;
	}
	
	public void setiPieza(String iPieza) {
		this.iPieza = iPieza;
	}
	
	public void setqPed(int qPed) {
		if (qPed > 0){
			this.qPed = qPed;
		}
	}
	
	public void setpUnit(double pUnit) {
		if (pUnit > 0.0) {
			this.pUnit = pUnit;
		}
	}
	
	//Ahora voy a escribir los cuatro metodos obtener
	
	public String getnPieza() {
		return nPieza;
	}
	
	public String getiPieza() {
		return iPieza;
	}
	
	public int getqPed() {
		return qPed;
	}
	
	public double getpUnit() {
		return pUnit;
	}
	
	//Ahora voy a escribir el metodo para calcular el valor de la factura a cobrar al cliente
	public double obtenerMontoFactura() {
		double billTotal = qPed * pUnit;
		return billTotal;
	}
}
