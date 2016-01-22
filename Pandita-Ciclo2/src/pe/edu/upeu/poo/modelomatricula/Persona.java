package pe.edu.upeu.poo.modelomatricula;

import java.util.Date;

public class Persona {

	private String nombre;
	private String apePaterno;
	private String apeMaterno;
	private Date fechaNacimiento;
	private String dni;
	private String direccion;
	private String celular;
	private String religion;
	private boolean sexo;
	private  LugarNacimiento lugarNacimiento ;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApePaterno() {
		return apePaterno;
	}
	public void setApePaterno(String apePaterno) {
		this.apePaterno = apePaterno;
	}
	public String getApeMaterno() {
		return apeMaterno;
	}
	public void setApeMaterno(String apeMaterno) {
		this.apeMaterno = apeMaterno;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public boolean isSexo() {
		return sexo;
	}
	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}
	public LugarNacimiento getLugarNacimiento() {
		return lugarNacimiento;
	}
	public void setLugarNacimiento(LugarNacimiento lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}
	
	
	
	
}
