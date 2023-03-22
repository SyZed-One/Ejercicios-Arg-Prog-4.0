package clase7;

/* Nuestro programa tiene su propio error, para ello lo creamos
 * heredando de la clase superior Exception
 */
public class NoHayStockException extends Exception{
	private final Producto producto;
	
	public NoHayStockException(Producto producto) {
		this.producto= producto;
	}

	public Producto getProducto() {
		return producto;
	}
	
	
}
