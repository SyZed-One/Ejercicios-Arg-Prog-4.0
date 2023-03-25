package c8pack;

public class DescuentoPorcentaje extends Descuento{

	
	public DescuentoPorcentaje(float valor) {
		super.setValorDesc(valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float valorFinal(float valorInicial) {
		System.out.println("Descuento Porcentual del "+String.valueOf(this.getValorDesc()+"%"));
		return valorInicial - valorInicial*super.getValorDesc()/100; //acá se resta un porcentaje
	}

	
	
}

