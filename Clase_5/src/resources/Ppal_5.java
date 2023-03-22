package resources;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import clase7.NoHayStockException;
import clase7.Producto;

public class Ppal_5 {
	static Persona pers = new Persona("Josefina", "Sánchez", "34563645", "01/02/2002");
	static ArrayList<Producto> prodList = new ArrayList();
	static Carrito carro= new Carrito();
	static float costo=0;
	boolean todoBien= true;
	
	carro.setUnaPersona(pers);
	prodList = loadProds("ListadoUTF.csv");
				
	todoBien = todoBien && (carro.addProd2Carrito(prodList.get(0), 1)); //se pueden agregar algunos random
	todoBien = todoBien && (carro.addProd2Carrito(prodList.get(1), 3)); //se pueden agregar algunos random
	todoBien = todoBien && (carro.addProd2Carrito(prodList.get(4), 1)); //se pueden agregar algunos random
	if (todoBien) {
		carro.setcantCuotas(2);			//La persona indica en cuantas cuotas paga
		carro.setRecargoFinanciero(10); //recargo financiero en porcentaje
		costo = carro.costoFinal();
		System.out.println(pers.Nombre+" "+pers.Apellido+ " abonará en total: $"+costo);
	}
	else System.out.println("Operación Inválida. No hay Stock de: "+e.getProducto().getNombreProd());
}


/******************************************************************************************************/
public static ArrayList<Producto> loadProds(String fileName) {
	Path path = Path.of(fileName);
	boolean exists = Files.exists(path);
	ArrayList<Producto> auxProdList = new ArrayList();
	List<String> listado = null; 
	if (exists) {
	try {
		listado = Files.readAllLines(Paths.get(fileName));
		for (int i=1; i<listado.size(); i++) { //salteamos i=0 porque son los títulos de columna
	        System.out.println(listado.get(i));	
	        String[] datos = listado.get(i).split(";");
	        Producto prod= new Producto(datos[0], datos[1], datos[2], datos[3]);
	        auxProdList.add(prod);
		}
	} catch(IOException e) {
		System.out.println("El archivo de datos es inválido o corrompido.");
	}}
	else System.out.println("El archivo de datos no existe o está en otra ubicación.");
    System.out.println("==========(SEPARADOR)==========");	
	return auxProdList; 
}//fin de loadprods

	
}
