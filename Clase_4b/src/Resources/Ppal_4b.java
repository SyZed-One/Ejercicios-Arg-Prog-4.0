package Resources;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Ppal_4b {
	
	//Argumentos para copiar y pegar
	//"E:\\Eclipse Works\\Archivo.txt" "suma"

	public static void main(String[] args) {
		String archivo = args[0];
		String operac = args[1];
		operac.toLowerCase();
		List<String> lineas = null;
		
		try {
			lineas= Files.readAllLines(Paths.get(archivo));
			for (int i = 0; i < lineas.size(); i++) {
			System.out.println(lineas.get(i));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("La vida es cruel. Error: "+e);
		};
		try {
			if (operac.equals("suma")) {
				archiSuma(lineas);				
			}
			else
				if (operac.equals("prod")) {
					archiProd(lineas);				
				}
				else
					System.out.println("Comando inapropiado o mal escrito !");
				
		} catch (IOException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
		System.out.println("No se pudo realizar la operación");
	};
	}
	
/********************************************************************/
public static void archiSuma(List<String> listNr) throws IOException {
	int resultado = 0;
	int numero = 0;
	if (listNr != null) {
	for (int i = 0; i < listNr.size(); i++) {
	numero = Integer.parseInt(listNr.get(i)); // pusimos el throws por si esto falla
	resultado = resultado + numero;
	};
	System.out.println("El resultado de la suma es:");
	System.out.println(resultado);
	}
	else System.out.println("No se pudo realizar la suma."); 
}
/********************************************************************/
public static void archiProd(List<String> listNr) throws IOException {
	int resultado = 1;
	int numero = 0;
	if (listNr != null) {
	for (int i = 0; i < listNr.size(); i++) {
	numero = Integer.parseInt(listNr.get(i)); // pusimos el throws por si esto falla
	resultado = resultado * numero;
	};
	System.out.println("El resultado del producto es:");
	System.out.println(resultado);
	}
	else System.out.println("No se pudo realizar la suma."); 
}

}
