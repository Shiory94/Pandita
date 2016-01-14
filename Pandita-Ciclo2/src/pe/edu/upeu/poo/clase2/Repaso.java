package pe.edu.upeu.poo.clase2;

import com.sun.java_cup.internal.runtime.Symbol;
import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

public class Repaso {

	public static void main(String[] args) {
		
        //objeto de tipo entero y para division double 
		Repaso r = new Repaso();
		
		int a = 30;
		int b = 12;
		/**
		 * Suma + == int & double
		 * Resta -  == int & double
		 * Multipiclacion * == int& double
 		 * divicion /  == int& double
		 * Modulo % == int &double
		 * Raiz cuadrada (Math.sqrt)== double
		 */
		//Esta intruccion me sirve para imprimir
		System.out.println(a%b);
		
		
		
		System.out.println("Operaciones logicas");
		
		/**
		 *And &&
		 *Or || Alt + 124
		 *Negacion !
		 */
		
		System.out.println("Calculando el IMC");
		System.out.println("IMC: " + r.calIMC(72, 1.70));
		
		
	}

	public double calIMC(double a, double b) {
		double imc = a / Math.pow(b,2);
		return  imc;
				
		
		
	}
	
	
	
	
	
	
}
