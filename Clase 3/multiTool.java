
public class multiTool {
	
	/************************************************************************************/
	//Dado un String y una letra, se cuenta la cantidad de apariciones de la letra en el String
	public int cuentaLetra(String targetStr, char letraABuscar) {
		int acum=0;
		if ((targetStr.length()==0) || (letraABuscar==' ')) {
			System.out.println("FAIL: Parámetros para cuentaLetra incorrectos!");
		}
		else {
			for (int i=0; i<targetStr.length(); i++) {
				if (targetStr.charAt(i)== letraABuscar) acum++;
			}
		}
		return acum;
	} //Acá terminó el método cuentaLetra
	
	/************************************************************************************/
	//Dados 3 números y un orden ascendente (order=true) o decreciente (order=false) 
	//se los ordena y los devuelve en un vector de 3
	public int[] sortTrio(int nr1, int nr2, int nr3, boolean order) {
	int vector[] = new int[3]; // vector arreglo de enteros 
	boolean listo= false;
	int auxNumber=0;
	vector[0]= nr1;
	vector[1]= nr2;
	vector[2]= nr3;
		if (order) {
			while (!listo) {
				listo = true;
				for (int i=0; i<vector.length-1; i++) { //ATN: falta el igual pero está bien
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
				for (int i=0; i<vector.length-1; i++) { //ATN: falta el igual pero está bien
					if (vector[i]<vector[i+1]) {
						auxNumber= vector[i];
						vector[i]= vector[i+1];
						vector[i+1]= auxNumber;
						listo= false;
					} //No sé si es muy eficiente, pero para ordenar tres sobra.
				}
			}			
		}
		return vector;
	} //Acá terminó el método sortTrio
	
	/************************************************************************************/
	//c. dado un vector de números, y un número X, que sume todos los números > X y
	//retorne el resultado
	public int sumaSIesMayorA(vector[], int X ) {
		int acum=0;
		for (int i=0; i<vectorLength; i++) { //ATN: falta el igual pero está bien
			if (vector[i]>X) acum= acum+vector[i];
	}
		return acum; 
}
}