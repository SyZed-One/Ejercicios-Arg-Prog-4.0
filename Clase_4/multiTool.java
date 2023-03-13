

public class multiTool {
	
	public multiTool() {
	//No hay mucho que hacer acá.	
	}
	
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
	int vector[] = {nr1, nr2, nr3}; // vector arreglo con los parámetros enteros 
	boolean listo= false;
	int auxNumber=0;
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
	//Dados 3 números y un orden ascendente (order=true) o decreciente (order=false) 
	//se los ordena y los muestra en consola
	public void sortShowTrio(int nr1, int nr2, int nr3, boolean order) {
		int[] vectra = new int[3]; 
		vectra = sortTrio( nr1, nr2, nr3, order);
		for (int i=0; i<vectra.length; i++) System.out.println(vectra[i]);
	}

	/************************************************************************************/
	//Dados 3 números y un orden ascendente (order=true) o decreciente (order=false) 
	//se los ordena y los muestra en consola
	public void sortShowTrio(int[] vect, boolean order) {
		vect = sortTrio( vect[0], vect[1], vect[2], order);
		for (int i=0; i<vect.length; i++) System.out.println(vect[i]);
	}

	/************************************************************************************/
	//c. dado un vector de números, y un número X, que sume todos los números > X y
	//retorne el resultado
	public int sumaSIesMayorA(int[] vector, int X ) {
		int acum=0;
		for (int i=0; i<vector.length; i++) { //ATN: falta el igual pero está bien
			if (vector[i]>X) acum= acum+vector[i];
	}
		return acum; 
}
}