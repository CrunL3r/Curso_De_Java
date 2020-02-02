import java.util.*;
import javax.swing.*;

public class Ej_Switch {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Elige una opción: \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circulo");
		int figura = entrada.nextInt();

		switch (figura) {

		case 1:

			int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado:"));
			System.out.println("El area del cuadrado es " + Math.pow(lado, 2));// Un ejemplo es como hacer 2 eleveado 3
			break;

		case 2:
			int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base: "));
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura: "));
			System.out.println("El area del cuadrado es " + (base * altura));
			break;

		case 3:
			base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base: "));
			altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura: "));
			System.out.println("El area del cuadrado es " + (base * altura) / 2);
			break;

		case 4:
			int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio: "));
			System.out.print("El area del c�rculo es " );
			System.out.printf("%1,2f", Math.PI*(Math.pow(radio, 2))); // %1.2f siginifica que solamente me coga dos decimales. 
		
		default:
			System.out.print("Opción no valida..." );
			break;
		}
		
		
		entrada.close();

	}

}
