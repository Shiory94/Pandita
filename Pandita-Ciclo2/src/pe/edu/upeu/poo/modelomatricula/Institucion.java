package pe.edu.upeu.poo.modelomatricula;

public class Institucion {

	private String razonSocial;
	private int  ruc;
	private String direccion;
	private String emmail;
	private String celular;
	private String fax;
	private String redesSociales;
	private Persona director = new Persona();
	private String web;
	private String logotipo;
	
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public int getRuc() {
		return ruc;
	}
	public void setRuc(int ruc) {
		this.ruc = ruc;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmmail() {
		return emmail;
	}
	public void setEmmail(String emmail) {
		this.emmail = emmail;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getRedesSociales() {
		return redesSociales;
	}
	public void setRedesSociales(String redesSociales) {
		this.redesSociales = redesSociales;
	}
	public Persona getDirector() {
		return director;
	}
	public void setDirector(Persona director) {
		this.director = director;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public String getLogotipo() {
		return logotipo;
	}
	public void setLogotipo(String logotipo) {
		this.logotipo = logotipo;
	}
	
	
}
