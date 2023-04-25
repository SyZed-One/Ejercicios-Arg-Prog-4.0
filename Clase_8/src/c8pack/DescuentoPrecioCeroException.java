package c8pack;

public class DescuentoPrecioCeroException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final Carrito carrito;

	public DescuentoPrecioCeroException(Carrito carrito) {
		super();
		this.carrito = carrito;
	}

	public Carrito getCarrito() {
		return carrito;
	}
	
}
