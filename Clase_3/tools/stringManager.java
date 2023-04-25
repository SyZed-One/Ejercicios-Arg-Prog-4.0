package tools;

import java.io.IOException; 
import java.nio.file.Files; 
import java.nio.file.Paths;

public class stringManager {
private static String strReference = "abcdefghijklmnñopqrstuvwxyz ";

public stringManager() {
	//no hay nada que iniciar acá
}

/********************************************************************/
// dada una cadena y un desplazamiento se corren las letras la cantidad 
// de lugares en el alfabeto que diga el desplazamiento. Si displace<0 decodifica.
public String strDisplace(String strOriginal, int displace) {
int indexToRef= 0;
String strAux= "";
	strOriginal= strOriginal.toLowerCase();
	for (int i=0; i<strOriginal.length(); i++) {
		indexToRef= strReference.indexOf(strOriginal.charAt(i));
		if (indexToRef<0) { // si la letra no existe en strReference no la desplazamos
			strAux= strAux + strOriginal.charAt(i);
		}
		else {				// Está todo bien: entonces desplazamos
			indexToRef = (indexToRef+displace) % strReference.length();
			if (indexToRef<0) indexToRef = indexToRef + strReference.length();
			strAux= strAux + strReference.charAt(indexToRef);
		}
		}
	return strAux;	
}

/********************************************************************/
// el siguiente método agrega líneas al final de un archivo.
// si lineToAdd tiene el control \n intercalado agrega varias líneas.
public void writter(String fileName, String lineToAdd) {
	try { Files.write(Paths.get(fileName), lineToAdd.getBytes(), java.nio.file.StandardOpenOption.APPEND); } 
	catch (IOException e) { System.out.println("An error occurred: " + e.getMessage()); } 
}

}
