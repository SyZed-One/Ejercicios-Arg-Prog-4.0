package tools;

public class Principal {

	public static void main(String[] args) {
		// Inicializamos las variables
		int cantLetras;
		multiTool mT = new multiTool();
		stringManager strMan = new stringManager();
		int[] vectra = {6, 25, 12}; 
		int resultado;
		String cadena = "La vaca feliz";
		
		// Utilizamos cuentaLetra
		System.out.println("cuentaLetra: ");
		cantLetras = mT.cuentaLetra("Hay que contar cuantas letras n hay aca", 'n');
		System.out.println(cantLetras);
		System.out.println("________________________________");
		

		//Utilizamos sortTrio
		System.out.println("sortTrio");
		vectra= mT.sortTrio(vectra[0], vectra[1], vectra[2], true);
		for (int i=0; i<vectra.length; i++) {
			System.out.println(vectra[i]);
		};
		System.out.println("________________________________");
		
		//Utilizamos sumaSIesMayorA
		System.out.println("sumaSIesMayorA");
		resultado = mT.sumaSIesMayorA(vectra, 10);
		System.out.println(resultado);
		System.out.println("________________________________");

		//Utilizamos strDisplace
		System.out.println("strDisplace ");
		cadena = strMan.strDisplace("Qué decís? Gil !", 1);
		System.out.println(cadena);
		System.out.println("________________________________");
		

	}

}
