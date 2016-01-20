package Polimorfismo;

import java.util.Scanner;

public class Polimorfismo {

	public static void main(String[] args) {
		 Scanner hoa = new Scanner(System.in);
	        Saludo x=new Saludo();
	        System.out.println("Ingrese su nombre: ");
	        String nom1 = hoa.nextLine();
	        System.out.println("Ingrese su nombre: ");
	        String nom2 = hoa.nextLine();
	        Saludo y=new Saludo("Hola "+ nom1);
	        Saludo z=new Saludo("Hola", nom2);
	        System.out.println(x.MensajeSaludo);
	        System.out.println(y.MensajeSaludo);
	        System.out.println(z.MensajeSaludo);

	}

}
