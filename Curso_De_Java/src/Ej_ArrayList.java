import java.util.ArrayList;
import java.util.Collections;

public class Ej_ArrayList {

	public static void main(String[] args) {
		String[] frutas = new String[3];
		frutas[0]="Platano";
		frutas[1]="Naranja";
		frutas[2]="Manzana";
		System.out.println(frutas[1]);
		
		ArrayList<String> frutas_lista = new ArrayList<String>();
		// Añadir elementos.
		frutas_lista.add("Melon");
		frutas_lista.add("Naranja");
		frutas_lista.add("Manzana");
		frutas_lista.add("Platano");
		// Borrar Elementos.
		frutas_lista.remove("Naranja");
		// Buscar elementos en la Arraylist.
		System.out.println(frutas_lista.contains("Naranja"));
		//Saber el tamaño de la arraylist.
		System.out.println(frutas_lista.size());
		// Ver la posición
		System.out.println(frutas_lista.get(0));
		System.out.println(frutas_lista);
		// Modificar elemento por otro nuevo.
		frutas_lista.set(2,"Banana");
		System.out.println(frutas_lista);
		// Borrar contenido de la arraylist.
		
		/*for (int i = 0; i < frutas_lista.size(); i++) {
		      System.out.println(frutas_lista.get(i));
		    }*/
		
		for (String i : frutas_lista) {
		      System.out.println(i);
		    }
		
		// Para ordenar listas alfab�ticamente o num�ricamente.
		Collections.sort(frutas_lista);
		System.out.println(frutas_lista);

	}

}
