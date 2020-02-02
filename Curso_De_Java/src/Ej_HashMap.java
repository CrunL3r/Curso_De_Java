import java.util.HashMap;

public class Ej_HashMap {

	public static void main(String[] args) {
		HashMap<String, String> Paises_Capitales = new HashMap<String, String>();
		// Put para añadir campos (llave,valor).
		Paises_Capitales.put("España", "Barcelona");
		Paises_Capitales.put("Alemania", "Berlin");
		Paises_Capitales.put("Italia", "Roma");
		Paises_Capitales.put("USA", "Washington DC");
		System.out.println(Paises_Capitales);
		// Ver el valor de la llave Espa�a.
		System.out.println(Paises_Capitales.get("España"));
		// Remover poisición de la llave.
		Paises_Capitales.remove("USA");
		System.out.println(Paises_Capitales);
		// Ver el tama�o del HashMap
		System.out.println(Paises_Capitales.size());
		// Modificamos el valor de la key
		Paises_Capitales.put("España", "Madrid"); // tambi�n se puede hacer replace
		// Ver las llaves de la HashMap
		for (String i : Paises_Capitales.keySet()) {
			  System.out.println(i);
		}
		// Ver contenido de los valores de las claves.
		for (String i : Paises_Capitales.values()) {
			  System.out.println(i);
		}
		
		// Eliminar todos los elementos.
		Paises_Capitales.clear();
		System.out.println(Paises_Capitales);

	}

}
