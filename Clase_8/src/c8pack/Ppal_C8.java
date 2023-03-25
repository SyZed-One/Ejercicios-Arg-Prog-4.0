package c8pack;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class Ppal_C8 {

	public static void main(String[] args) {

			Persona pers = new Persona("Josefina", "Sánchez", "34563645", "01/02/2002");
			ArrayList<Producto> prodList = new ArrayList<Producto>();
			Carrito carro= new Carrito("25/03/2023");
			float costo=0;
			boolean todoBien= true;
			
				carro.setUnaPersona(pers);
				Descuento descFijo= new DescuentoFijo(300); //300pe fijos= Tiene un cupón de descuentos
				Descuento descPorc= new DescuentoPorcentaje(12); //12%
				Descuento descPorcCT= new DescPorcConTope(30); //Al crear el obj se define el tope
				
				descPorcCT.setValorDesc(15); //si acá quiero poner >30 no me lo TOMA
				
				prodList = loadProds("ListadoUTF.csv");
			try {				
				carro.addProd2Carrito(prodList.get(0), 1); //se pueden agregar algunos random
				carro.addProd2Carrito(prodList.get(1), 2); //se pueden agregar algunos random
				carro.addProd2Carrito(prodList.get(4), 1); //se pueden agregar algunos random
			}
			catch (NoHayStockException e) {
				todoBien= false;
				System.out.println("Operación Inválida. No hay Stock de: "+e.getProducto().getNombreProd());
			};
			
			carro.setcantCuotas(2);				//La persona indica en cuantas cuotas paga
			carro.setRecargoFinanciero(10); 	//Ajustamos el recargo financiero en porcentaje

			try {
			costo = carro.costoFinal(descPorcCT);	//Aplico UNO solo de los tipos de descuento
			}
			catch (Exception e) {
				todoBien= false;
				System.out.println("Operación Inválida: No se puede aplicar descuento!");
			};
			
			if (todoBien) System.out.println(pers.Nombre+" "+pers.Apellido+ " abonará en total: $"+costo);
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
