package resources;

import java.util.ArrayList;

/*************************************************************/
public class Carrito {
	private Persona unaPersona;
	private ArrayList<Producto> prodsInCarrito = new ArrayList<Producto>(); //productos en el Carrito
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
	public boolean addProd2Carrito(Producto prod, int cant) {
		boolean todoBien= true;
		if	(prod.setCantProd(cant)) {
			this.prodsInCarrito.add(prod);
			System.out.println("ADD-> "+String.valueOf(cant)+" PU$ "+String.valueOf(prod.getPrecio()));
		}
		else {
			System.out.println("No hay stock del producto "+prod.getCodigo()+" "+prod.getNombreProd());
			todoBien= false;
		}
		return todoBien;
	}
	
/*******************************************************************************/
	public float costoFinal() {
		float acum=0;
		for (int i=0; i<this.prodsInCarrito.size(); i++) {
			Producto prod = this.prodsInCarrito.get(i);
			acum = acum + prod.getCantProd() * prod.getPrecio();
		};
		System.out.println("Cuotas= "+String.valueOf(this.cantCuotas)+" RF% "+String.valueOf(this.recFin));
		return acum * (1+(this.cantCuotas-1)*this.recFin/100); //una cuota no aplica recargo
	}

/***************************************************************************/
}