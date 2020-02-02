import java.util.*;

public class Ej_If {

	public static void main(String[] args) {
		// Instaciamos 
		Scanner entrada = new Scanner(System.in);
		System.out.println("Cuantos años tienes?");
		int edad = entrada.nextInt();
		
		if (edad > 28) {
			System.out.println("Eres una persona adulta.");
		}else if (edad >= 18) {
			System.out.println("Eres mayor de edad.");
		}else if ((edad > 12) && (edad <= 17)){
			System.out.println("Eres un adolescente");
		}else {
			System.out.println("Eres un niño pequeño.");
		}
		entrada.close();
	}

}
