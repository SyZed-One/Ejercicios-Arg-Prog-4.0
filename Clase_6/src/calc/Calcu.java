package calc;

public class Calcu {
	public void Calcu() {
		//nada por aquí
	}
	
	public static float suma(float a, float b) {
		return a+b;
	}
	
	public static float rest(float value, float rester) {
		return value-rester;
	}
	
	public static float divi(float num, float den) {
		Float resultado= null;
		if (den!=0) {
			resultado = num/den;
		}
		return resultado.floatValue();
	}
	
	public static float prod(float a, float b) {
		return a*b;
	}
}
