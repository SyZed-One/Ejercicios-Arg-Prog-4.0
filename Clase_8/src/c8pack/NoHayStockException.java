package c8pack;

public class NoHayStockException extends Exception{
	/**
	 * Cuando se quiere vender una cantidad de Producto superior al stock se pudre todo
	 */
	private static final long serialVersionUID = -2525274630527210631L;
	private final Producto producto;
	
	public NoHayStockException(Producto producto) {
		this.producto= producto;
	}

	public Producto getProducto() {
		return producto;
	}
	
	
}
