package c8pack;

public abstract class Descuento {
	private float valorDesc;

	// NO HAY CONSTRUCTOR: la clase es abstracta
	
	public float getValorDesc() {
		return valorDesc;
	}

	public void setValorDesc(float valorDesc) {
		this.valorDesc = valorDesc;
	}
	
	public abstract float valorFinal(float valorInicial) throws Exception; //abstract: se define en los herederos
}
