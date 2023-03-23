package clase7;

public class DescPorcConTope extends DescuentoPorcentaje {

	private float tope;
	
	public DescPorcConTope(float tope) {
		super(0);
		this.tope= tope;
	}

	public float getTope() { 
		return tope;
	}

	public void setTope(float tope) {
		this.tope = tope;
	}
	
	@Override
	public void setValorDesc(float valor) {
		if (valor>this.tope) {
			super.setValorDesc(this.tope);
		}
		else super.setValorDesc(valor);
	}
	
	
}
