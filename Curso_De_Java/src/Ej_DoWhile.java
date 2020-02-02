import java.util.*;

public class Ej_DoWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        int ale = (int)(Math.random()*100); // Genera un numero de 0 al
        int num = 0;
        int count = 0;
        
        do {
            count++;
            System.out.println("Introduce un número, por favor");
            num = entrada.nextInt();
            if (ale < num) {
                System.out.println("Más bajo");
            }
            else if (ale > num) {
                System.out.println("Más alto");
            }
        } while (num!=ale);
        System.out.println("Correcto. Lo has conseguido en " + count + " intentos." );
        entrada.close();

	}

}
