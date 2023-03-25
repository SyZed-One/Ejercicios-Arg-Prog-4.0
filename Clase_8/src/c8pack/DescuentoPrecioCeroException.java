package c8pack;

public class DescuentoPrecioCeroException extends Exception{
	private final Carrito carrito;

	public DescuentoPrecioCeroException(Carrito carrito) {
		super();
		this.carrito = carrito;
	}

	public Carrito getCarrito() {
		return carrito;
	}
	
}
