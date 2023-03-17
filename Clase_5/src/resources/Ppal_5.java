package resources;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Ppal_5 {
	static Persona pers = new Persona("Josefina", "Sánchez", "34563645", "01/02/2002");
	static ArrayList<Producto> prodList = new ArrayList();
	static Carrito carro= new Carrito();
	static float costo=0;
	
	public static void main(String[] args) {
		carro.setUnaPersona(pers);
		loadProds("Listado.csv");
		carro.addProd2Carrito(prodList.get(0), 1); //se pueden agregar algunos random
		carro.setcantCuotas(2);			//La persona indica en cuantas cuotas paga
		carro.setRecargoFinanciero(10); //recargo financiero en porcentaje
		costo = carro.costoFinal();
        System.out.println(pers.Nombre+" "+pers.Apellido+ " abonará en total: $"+costo);
	}

	public static void loadProds(String fileName) {
		Path path = Path.of(fileName);
		boolean exists = Files.exists(path);
		List<String> listado = null; 
		if (exists) {
		try {
			listado = Files.readAllLines(Paths.get(fileName));
			for (int i=1; i<listado.size(); i++) { //salteamos i=0 porque son los títulos de columna
		        System.out.println(listado.get(i));	
		        String[] datos = listado.get(i).split(";");
		        Producto prod= new Producto(datos[0], datos[1], datos[2]);
		        prodList.add(prod);
			}
		} catch(IOException e) {
			
		}}
		else System.out.println("El archivo de datos no existe o está en otra ubicación.");
	}
	
}
