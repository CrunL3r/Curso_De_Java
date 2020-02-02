package Ej_Examen1;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// Instanciar Objeto calculadora
		Calculo calculadora = new Calculo();
		// "" Para escribir parametros en consola
		Scanner entrada = new Scanner(System.in);
		int [] numeros = new int[2];
		System.out.println("Dime que tiempo es ahora? \n1: De día  \n2: De tarde \n3: De noche");
		int tiempo = entrada.nextInt();
		calculadora.buenas(tiempo); 
		String nombre = entrada.next();
		calculadora.bienvenido(nombre);
		System.out.println("Que quieres hacer? \nA: Sumar  \nB: Restar \nC: multiplicar \nD: Dividir");
		String option = entrada.next();
					
		switch (option) {
		case "A":
			for (int x=0; x<numeros.length;x++) {
				System.out.println("Dime un numero: ");
				numeros[x] = entrada.nextInt();
			}
			System.out.println("El resultado de sumar: " + numeros[0] + " + " + numeros[1] + " = " + (calculadora.suma(numeros[0], numeros[1])));
			break;

		case "B":
			int y = 0;
			while(y<numeros.length) {
				System.out.println("Dime un numero: ");
				numeros[y] = entrada.nextInt();
				y++;
			}
			System.out.println("El resultado de restar: " + numeros[0] + " - " + numeros[1] + " = " + (calculadora.resta(numeros[0], numeros[1])));
			break;

		case "C":
			System.out.println("Dime un numero: ");
			numeros[0] = entrada.nextInt();
			System.out.println("Dime otro numero: ");
			numeros[1] = entrada.nextInt();
			System.out.println("El resultado de sumar: " + numeros[0] + " x " + numeros[1] + " = " + (calculadora.multi(numeros[0], numeros[1])));
			break;
			
		case "D":
			System.out.println("Dime un numero: ");
			numeros[0] = entrada.nextInt();
			System.out.println("Dime otro numero: ");
			numeros[1] = entrada.nextInt();
			System.out.println("El resultado de sumar: " + numeros[0] + " / " + numeros[1] + " = " + (calculadora.div(numeros[0], numeros[1])));
			break;
			
		case "Kojiman":
			System.out.println("El tiene el poder,\n"
							+ "el tiene el poder,\n"
							+ "para digitalizar bebes!!");
			break;
				
		default:
			System.out.println("La opción introducida no es valida");
			break;
		}
		
		entrada.close();
		calculadora.despedida();
	}

}
