package Resources;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Ppal_4b {

	public static void main(String[] args) {
		String archivo = args[0];
		String operac = args[1];
		operac.toLowerCase();
		List<String> linea = null;
		
		try {
			linea= Files.readAllLines(Paths.get(archivo));
			for (int i = 0; i < linea.size(); i++) {
			System.out.println(linea.get(i));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("La vida es cruel");
		};
		try {
			if (operac.equals("suma")) {
				archiSuma(linea);				
			}
			else
				if (operac.equals("prod")) {
					archiProd(linea);				
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
