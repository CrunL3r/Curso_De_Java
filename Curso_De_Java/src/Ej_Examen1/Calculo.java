package Ej_Examen1;

public class Calculo {
	int num1;
	int num2;
	int tiempo;
	String nombre;
	
	// public Calculo (){}
	// Suma
	public int suma(int num1, int  num2) {
		return num1 + num2;
	}
	// Resta
	public int resta(int num1, int num2) {
		return num1 - num2;
	}
	// Multiplicar
	public int multi(int num1, int num2) {
		return num1 * num2;
	}
	// Dividir
	public int div(int num1, int num2) {
		return num1 / num2;
	}
	// Nada m�s iniciar te indica Como debes dirigirte 
	public void buenas(int tiempo) {
		if (tiempo == 1) {
			System.out.println("Buenos d�as, como te llamas?");
		}else if (tiempo == 2) {
			System.out.println("Buenas tardes, como te llamas?");
		}else if (tiempo == 3){
			System.out.println("Buenas noches, como te llamas?");
		} else {
			System.out.println("No tienes ni puta idea amigo/a mío/a xD, Como te llamas?");
		}
		
	}
	// Te da la Bienvenida con tu nombre
	public void bienvenido(String nombre) {
		System.out.println("Bienvenido " + nombre + " !!");
	}
	// Te da
	public void despedida() {
		System.out.println("Adios y hasta otra :)!!");
	}
}
