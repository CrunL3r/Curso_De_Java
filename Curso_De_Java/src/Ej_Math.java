
public class Ej_Math {

	public static void main(String[] args) {
		//raiz cuadrada.
        double raiz = Math.sqrt(9);
        System.out.println(raiz);

        // Redondear números
        double num1 = 5.96;
        int res = (int)Math.round(num1); // <--- Esto es refundición (pasamos double que luego daria un long a un int) .
        System.out.println(res);

        //Numero genereado entre 1 y 100.
        int ale = (int)(Math.random()*100);
        System.out.println(ale);

	}

}
