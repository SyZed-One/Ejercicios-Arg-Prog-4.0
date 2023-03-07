
public class multiTool {
	private static int vectorLength = 3; //Dejo la puerta abierta para que el vector sea más grande
	public static int vector[] = new int[vectorLength]; // vector arreglo de enteros. Método 
	
	/************************************************************************************/
	//Dado un String y una letra, se cuenta la cantidad de apariciones de la letra en el String
	public int cuentaLetra(String targetStr, char letraABuscar) {
		int acum=0;
		if ((targetStr.length()==0) || (letraABuscar=null) {
			System.out.println("FAIL: Parámetros para cuentaLetra incorrectos!");
		}
		else {
			for (int i=0; i<targetStr.length(); i++) {
				if (targetStr.charAt(i)== letraABuscar) acum++
			}
		}
		cuentaLetra = acum;
	} //Acá terminó el método cuentaLetra
	
	/************************************************************************************/
	//Dados 3 números y un orden ascendente (order=true) o decreciente (order=false) se los ordena y
	//los devuelve en un vector de 3
	public vector[] sortTrio(int nr1, int nr2, int nr3, boolean order) {
	boolean listo= false;
	int auxNumber=0;
	vector[0]= nr1;
	vector[1]= nr2;
	vector[2]= nr3;
		if (order) {
			while (!listo) {
				listo = true;
				for (int i=0; i<vectorLength-1; i++) { //ATN: falta el igual pero está bien
					if (vector[i]>vector[i+1]) {
						auxNumber= vector[i];
						vector[i]= vector[i+1];
						vector[i+1]= auxNumber;
						listo= false;
					} //No sé si es muy eficiente, pero para ordenar tres sobra.
				}
			}
		}
		else {
			while (!listo) {
				listo = true;
				for (int i=0; i<vectorLength-1; i++) { //ATN: falta el igual pero está bien
					if (vector[i]<vector[i+1]) {
						auxNumber= vector[i];
						vector[i]= vector[i+1];
						vector[i+1]= auxNumber;
						listo= false;
					} //No sé si es muy eficiente, pero para ordenar tres sobra.
				}
			}			
		}
	} //Acá terminó el método sortTrio
	
	/************************************************************************************/
	//c. dado un vector de números, y un número X, que sume todos los números > X y
	//retorne el resultado
	public int sumaSIesMayorA(vector[], int X ) {
		int acum=0;
		for (int i=0; i<vectorLength; i++) { //ATN: falta el igual pero está bien
			if (vector[i]>X) {
				acum= acum+vector[i];
			}
		
	}
}
}