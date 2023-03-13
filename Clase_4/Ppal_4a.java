import java.util.Scanner;

public class Ppal_4a {
	public static void main(String[] args) {
		int i;
		int[] vector= new int[3];
		String numStr;

		//en esta parte los tomamos de la línea de comandos
		String comd= "";

		 try{
			 vector = decodeArgs(args);
	            comd = args[3];
	        }
	        catch(Exception e){
	        	System.out.println("Parametros insuficientes o incorrectos");
	        	comd= "";
	        };
	    
// Si falló lo anterior le vamos a pedir por teclado al usuario
	        
	  if (comd.equals("")) { // si llegara hasta acá en "" => no funcionó arriba
 
	    	try (Scanner scn = new Scanner(System.in)) {
				i= 0;
				while (i<=3) {
					if (i<3) {
						System.out.println("Ingrese el número "+(i+1));
				    	numStr = scn.nextLine();
						vector[i]= Integer.parseInt(numStr);
					}
					else {
						System.out.println("Ingrese el comando (u o d): ");
						comd = scn.nextLine();
					};
					i++;
				}
			} catch (Exception e) { comd= "";}
	    	};
	    	show(vector, comd);
	    }
	    
/************************************************************************************/

	public static int[] decodeArgs(String[] Args) {
		 Integer nr1 = 0;
		 Integer nr2 = 0;
		 Integer nr3 = 0;
	            nr1 = Integer.valueOf(Args[0]);
	            nr2 = Integer.valueOf(Args[1]);
	            nr3 = Integer.valueOf(Args[2]);			    		
	     int vector[] = {nr1, nr2, nr3}; // vector arreglo con los parámetros enteros 
	     return vector;
	}
	
/************************************************************************************/

	public static void show(int[] vect, String comd) {
	multiTool mT = new multiTool();
			if (comd.equals("u")) {
	    		mT.sortShowTrio(vect, true);	
	    	}
	    	else if (comd.equals("d")) mT.sortShowTrio(vect, false);			    		
	}

}
