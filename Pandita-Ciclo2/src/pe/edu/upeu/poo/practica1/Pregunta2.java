package pe.edu.upeu.poo.practica1;

import java.util.Scanner;

public class Pregunta2 {

	public static void main(String[] args) {
		Scanner vocal = new Scanner(System.in);
		System.out.println("Ingrese un valor");
		int n = vocal.nextInt();
		if (n==1){
			System.out.println("Su letra es la 'A' ");
		}
		else if (n==2){
			System.out.println("Su letra es la 'B' ");
		}
		else if (n==3){
			System.out.println("Su letra es la 'C' ");
		}
		else if (n==4){
			System.out.println("Su letra es la 'D' ");
		}
		else if (n==5){
			System.out.println("Su letra es la 'E' ");
		}
		else if (n>5){
			System.out.println("Ud. ha ingresado un valor incorrecto.");

		}

	}

}
