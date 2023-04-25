package LombokTest;

import java.util.ArrayList;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;


public class Main {
	static Scanner scn = new Scanner(System.in);
	static String auxStr;
	static String auxNombres;
	static String auxApellido;
	static String auxFechaNac;
	static ArrayList<Persona> persList= new ArrayList<Persona>();

	public static void main(String[] args) {

		System.out.println("¿Desea ingresar Datos de una Persona? (s/n): ");
		try {
			auxStr = scn.nextLine().toUpperCase();
		}
		catch (Exception e) { auxStr ="N"; };
		
		while (auxStr.equals("S")) {
		if (auxStr.equals("S")) {
    	try  {
    		System.out.println("Ingrese el/los Nombre/s: ");
    		auxNombres = scn.nextLine();
    		System.out.println("Ingrese el Apellido: ");
    		auxApellido = scn.nextLine();
    		System.out.println("Ingrese Fecha de Nacimiento (dd/mm/aaaa): ");
    		auxFechaNac = scn.nextLine();
			} 
    	catch (Exception e) { auxStr ="N"; };
		}
		if (auxStr.equals("S")) {
			Persona pers= new Persona();
			pers.setNombres(auxNombres);
			pers.setApellido(auxApellido);
			pers.setFechaNacim(auxFechaNac);
			persList.add(pers);
		}
		System.out.println("¿Desea ingresar Datos de OTRA Persona? (s/n): ");
		try {
			auxStr = scn.nextLine().toUpperCase();
		}
		catch (Exception e) { auxStr ="N"; };
		}
		
		MostrarPersonasCargadas();
		GuardarPersonasCargadas("file.csv");
	}

	/******************************************************************/
	public static void MostrarPersonasCargadas() {
		int i=1;
		for(Persona pers: persList) {
			auxNombres= pers.getNombres();
			auxApellido= pers.getApellido();
			auxFechaNac= pers.getFechaNacim();
			System.out.println( i +") "+auxNombres+" "+auxApellido+" - "+auxFechaNac);
			i++;
		}
	}

	/******************************************************************/
	public static void GuardarPersonasCargadas(String fileName) {
		File file = null; 				//Declaring reference of File class
		FileWriter filewriter = null; 	//Declaring reference of FileWriter class
		try {
				file = new File(fileName);
				filewriter = new FileWriter(file);	//Creating Object of FileWriter class

				for(Persona pers: persList) {
					auxNombres= pers.getNombres();
					auxApellido= pers.getApellido();
					auxFechaNac= pers.getFechaNacim();
					filewriter.write( auxNombres+";"+auxApellido+";"+auxFechaNac);
				}
		//Closing the stream
					filewriter.close();
					System.out.println("Archivo "+fileName+" generado correctamente.");
				}
		//Handing Exception
				catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						if (filewriter != null) {
							filewriter.close();
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
	
}
