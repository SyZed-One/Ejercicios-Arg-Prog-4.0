package clase7;

public class Producto { 
		private String nombreProd;
		private String codigo;
		private float precio;
		private int cantStock;
		private int cantProd; //cantidad de ESTE producto, campo aux adicional que utilizará "Carrito"
		
		private boolean noHayStock= false;
		
//en este constructor pasamos todo como string porque pensamos en leer los datos de un csv
		public Producto(String nombreProd, String codeProd, String precio, String stock) {
			this.nombreProd= nombreProd;
			this.codigo= codeProd;
			this.precio= Float.parseFloat(precio);
			this.cantStock= Integer.parseInt(stock);			
		}
		
		//Getters y Setters
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
		
		
		public int getCantProd() {
			return cantProd;
		}

		public boolean isNoHayStock() {
			return noHayStock;
		}

		public void setNoHayStock(boolean noHayStock) {
			this.noHayStock = noHayStock;
		}

		public void setPrecio(float precio) {
			this.precio = precio;
		}

		//este es interesante: asigna reserva si hay stock
		public boolean setCantProd(int cantProd) throws NoHayStockException {
			if (this.cantStock>=cantProd) {
				this.cantProd = cantProd;
				this.cantStock= this.cantProd-cantProd; //se achica el stock
				this.noHayStock= false;
			}
			else {
				this.noHayStock= true;
				throw new NoHayStockException(this);
			};
			return !this.noHayStock;
		}

		//Métodos Propios de Producto. 
		//Este devuelve el precio o una exception
		public float costoFinal() throws NoHayStockException {
			
			if (this.noHayStock) {
				throw new NoHayStockException(this);
			}
			return precio;
		}
		
	}
