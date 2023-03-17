package resources;

public class Producto { 
		String nombreProd;
		String codigo;
		float precio;
		int cantProd; //cantidad de ESTE producto, campo aux adicional que utilizará "Carrito"
		

		public Producto(String nombreProd, String codeProd, String precio) {
			this.nombreProd= nombreProd;
			this.codigo= codeProd;
			this.precio= Float.parseFloat(precio);
		}
		
		//Getters
		public String getNombreProd() {
			return nombreProd;
		}

		public void setNombreProd(String nombreProd) {
			this.nombreProd = nombreProd;
		}

		public String getCodigo() {
			return codigo;
		}

		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}

		public float getPrecio() {
			return precio;
		}

		//Setters
		public void setPrecio(float precio) {
			this.precio = precio;
		}

		//Otros Métodos
		public float costoFinal() {
			return precio;
		}
		

	}
