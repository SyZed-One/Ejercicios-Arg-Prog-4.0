package c8pack;

public class CostoNegativoException extends Exception {

		private final Descuento descuento;

		public CostoNegativoException(Descuento descuento) {
			super();
			this.descuento = descuento;
		}
	
		
}
