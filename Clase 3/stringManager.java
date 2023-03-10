package tools;

public class stringManager {
private static String strReference = "abcdefghijklmnñopqrstuvwxyz ";

public stringManager() {
	//no hay nada que iniciar acá
}

/********************************************************************/
// dada una cadena y un desplazamiento se corren las letras la cantidad 
// de lugares en el alfabeto que diga el desplazamiento.
// Este código SUPONE que el desplazamiento es menor a la cantidad de letras del alfabeto
public String strDisplace(String strOriginal, int displace) {
int indexToRef= 0;
String strAux= "";
	strOriginal= strOriginal.toLowerCase();
	for (int i=0; i<strOriginal.length(); i++) {
		indexToRef= strReference.indexOf(strOriginal.charAt(i));
		if (indexToRef<0) {
			strAux= strAux + strOriginal.charAt(i);
		}
		else {
			indexToRef = (indexToRef+displace) % strReference.length();
			strAux= strAux + strReference.charAt(indexToRef);
		}
		}
	return strAux;	
}

/********************************************************************/

}
