package pe.edu.upeu.poo.Polimorfismo;

import java.util.Scanner;

public class Saludo  {
	String MensajeSaludo;
    String am1;
    Scanner hoa = new Scanner(System.in);
    public Saludo(){        
        System.out.println("Ingrese su nombre: ");
        am1 = hoa.nextLine();
        MensajeSaludo="Hola "+am1;}
    public Saludo(String Palabra){
        MensajeSaludo=Palabra;}
    public Saludo(String Palabra, String Nombre){
        MensajeSaludo=Palabra.concat(" ").concat(Nombre);}
}
