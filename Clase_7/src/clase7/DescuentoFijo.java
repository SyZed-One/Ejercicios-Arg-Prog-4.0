package clase7;

public class DescuentoFijo extends Descuento {

	
	public DescuentoFijo(float valor) {
		super.setValorDesc(valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float valorFinal(float valorInicial) {
		System.out.println("Descuento Fijo de $"+String.valueOf(this.getValorDesc()));
		return valorInicial - super.getValorDesc();//acá se resta un valor fijo en pesos 
	}

}
