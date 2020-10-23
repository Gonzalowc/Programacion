package com.Tarea4_Tipos_de_Datos.Conversión_de_Tipos;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double num;

		System.out.printf("Introduce un numero decimal: ");
		num = sc.nextDouble();

		num = (int)Math.round(num);
		System.out.println(num);
	}
}
