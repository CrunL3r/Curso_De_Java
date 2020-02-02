import javax.swing.*;

public class Ej_Array {

	public static void main(String[] args) {
		// Primera forma de declarar una array.
		/*String [] letras = new String[5];
		* letras[0]="Andreu";
		* letras[1]="Isma";
		* letras[2]="Fox";
		* letras[3]="Aguamari";
		* letras[4]="Pedro";*/
				
		// Segunda forma.
		// String [] letras = {"Andreu","Isma","Fox","Aguamari","Pedro"};
				
		/*for (int y = 0; y < letras.length; y++ ) {
		      * System.out.println(letras[y]);
		* }
		*/
				
		String [] nombres = new String[5];
				
		for (int x = 0; x < 5; x++ ) {
			nombres[x] = JOptionPane.showInputDialog("Introduce nombres: " + (x+1));
		}
				
				
		for	(String elemento:nombres) {
			System.out.println("Nombre: " + elemento); 
		}
				
	}

}
