package c8pack;

public class CostoNegativoException extends Exception {

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private final Descuento descuento;

		public CostoNegativoException(Descuento descuento) {
			super();
			this.descuento = descuento;
		}
		
}
