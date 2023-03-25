package c8pack;

public class DescuentoFijo extends Descuento {

	
	public DescuentoFijo(float valor) {
		super.setValorDesc(valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float valorFinal(float valorInicial) throws CostoNegativoException{
		float valor;
		System.out.println("Descuento Fijo de $"+String.valueOf(this.getValorDesc()));
		valor = valorInicial - super.getValorDesc();//acá se resta un valor fijo en pesos
		if (valor>=0) {
			return valor;
		}
		else throw new CostoNegativoException(this);
	}

}
