package pe.edu.upeu.poo.clase1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Principal {

	public static void main(String[] args) {
		
		Persona joselin = new Persona();
		joselin.nombre = "Joselin Jimena" ;
		joselin.apePaterno = "Aliaga";
		joselin.apeMaterno = "Ancco";
		joselin.altura = 1.70 ;
		joselin.dni = "77917135";
		joselin.celular = "959282894";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
		joselin.fechaNacimiento = sdf.parse("26/06/2015");
		} catch (ParseException e){
			e.printStackTrace();
		}
		joselin.emmail = "shiorymiyuki94@gmail.com";
		joselin.tipoSangre = "O+";
		joselin.direccion = "Jr Lambayeque 933";
		joselin.religion = "Adventita";
		joselin.sexo = "Femenino";
		joselin.estadoCivil = "Soltera";
		joselin.vive = true ;
				
		System.out.println(joselin);

		
	}
	

}
