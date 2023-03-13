package Resources;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

//import tools.stringManager;

public class Ppal_4c {
	
	//Argumentos para copiar y pegar
	//"code" "2" "E:\\Eclipse Works\\Texto.txt" "E:\\Eclipse Works\\Result.txt"

	public static void main(String[] args) {
		String operac = args[0];  	//será "code" o "deco"
		String despStr = args[1]; 	//desplazamiento (entero positivo de cero en adelante)
		String archEnt = args[2]; 	//Archivo de entrada
		String archSal = args[3];	//Archivo de salida
		boolean allOK = true;		//bandera de "todo bien"	
		List<String> lineas = null; //Las líneas que se van a leer
		int despInt;				//conversión del desplazamiento a un entero
		//* para chequear alguna falla en args
		System.out.println(operac);
		System.out.println(despStr);
		System.out.println(archEnt);
		System.out.println(archSal);
		//*/
		operac.toLowerCase();    //por las dudas
		try {
			lineas= Files.readAllLines(Paths.get(archEnt));
			//for (int i = 0; i < lineas.size(); i++) {
			//System.out.println(lineas.get(i));
			}
		 catch (IOException e) {
			System.out.println("La operación falló con el archivo de entrada");
			allOK = false;
		 	};
		try {
			despInt = Integer.parseInt(despStr);
			if (operac.equals("code")) {
				encodeLines(lineas, despInt, archSal);				
			}
			else
				if (operac.equals("deco")) {
					encodeLines(lineas, despInt, archSal);				
				}
				else allOK= false;
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				allOK= false;
			};
	if (allOK) System.out.println("La operación fue exitosa :) ");
	}

/********************************************************************/
public static void encodeLines(List<String> listNr, int desp, String archivo) throws IOException {
stringManager strMan = new stringManager();
String auxStr;
boolean state = (listNr != null);
		
		if (state) {
		for (int i = 0; i < listNr.size(); i++) {
		auxStr = strMan.strDisplace(listNr.get(i), desp); 
		strMan.writter(archivo, auxStr); //escribe linea por linea en el archivo de destino
		}
	//return (state= true);
	}
}
}