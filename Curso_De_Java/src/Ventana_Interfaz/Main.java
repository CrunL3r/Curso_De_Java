package Ventana_Interfaz;
import java.util.Date;
import javax.swing.*;

public class Main {
	
	static JFrame ventana;
	static JLabel hola;
	
	public static void main(String[] args) {
		ventana = new JFrame("Hola Mundo");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		hola = new JLabel(new Date().toString());
		ventana.add(hola);
		ventana.pack();
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);

	}

}
