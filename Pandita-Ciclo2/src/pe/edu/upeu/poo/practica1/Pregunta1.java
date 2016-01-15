package pe.edu.upeu.poo.practica1;

import java.util.Scanner;;

public class Pregunta1 {

	public static void main(String[] args) {
		
		Scanner ven = new Scanner(System.in);
		System.out.println("Ingrese el monto de su venta");
		double saldo = ven.nextDouble();
		double porcentaje = 0;
		if (saldo>0 && saldo<1000){
			System.out.println("No hay bonicación");
		}
		else if (saldo>=1000 && saldo<=5000 ){
			porcentaje = saldo * 3 / 100 ;	
		}
		else if (saldo >=5000 && saldo <=20000){
			porcentaje = saldo * 5 / 100 ;
		}
		else if (saldo >= 20000){
			porcentaje = saldo * 8 / 100 ;
			
		}
		System.out.println("Su bonificacion es de : "+porcentaje );
	}

}
