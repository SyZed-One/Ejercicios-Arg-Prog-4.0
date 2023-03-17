package resources;

import java.util.ArrayList;

/*************************************************************/
public class Carrito {
	private Persona unaPersona;
	private ArrayList<Producto> prodsInCarrito = new ArrayList(); //productos en el Carrito
	private String fechaCompra;
	private float recFin= 10;  //% Recargo Por Financiación: porcentaje de recargo mensual por cuotas>1
	private int cantCuotas=1; // cantidad de cuotas

	public Carrito() {
		this.fechaCompra= "";
	}
	
	public Persona getUnaPersona() {
		return unaPersona;
	}

	public void setUnaPersona(Persona unaPersona) {
		this.unaPersona = unaPersona;
	}

	public String getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public void setRecargoFinanciero(float recargo) {
		this.recFin= recargo;
	}
	
	public void setcantCuotas(int cuotas) {
		if (cuotas<1) {
			System.out.println("No se admiten CERO cuotas!"); //cero y cualquier negativo
		}
		else {
			this.cantCuotas= cuotas;
		}
	}
	
	public int getcantProds() {
		return this.prodsInCarrito.size();
	}
	
/*******************************************************************************/
	public void addProd2Carrito(Producto prod, int cant) {
		if (prod!=null) {
			prod.cantProd= cant;
			this.prodsInCarrito.add(prod);
		}
		else System.out.println("No se pudo agregar producto al carrito");
	}
	
/*******************************************************************************/
	public float costoFinal() {
		float acum=0;
		for (int i=0; i<this.prodsInCarrito.size(); i++) {
			Producto prod = this.prodsInCarrito.get(i);
			acum = acum + prod.cantProd * prod.precio;
		};
		return acum * (1+(this.cantCuotas-1)*this.recFin/100);
	}

/***************************************************************************/
}