package pe.edu.upeu.poo.modelomatricula;

public class Matricula {
	
	private String codigo;
	private String numMatricula;
	private String partidaNacimiento;
	private String numHermanos;
	private boolean trasladado;
	private String certiEstudios;
	private String gradoEstudios;
	// Constructor
	private TipoPago tipoPago;
	
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNumMatricula() {
		return numMatricula;
	}
	public void setNumMatricula(String numMatricula) {
		this.numMatricula = numMatricula;
	}
	public String getPartidaNacimiento() {
		return partidaNacimiento;
	}
	public void setPartidaNacimiento(String partidaNacimiento) {
		this.partidaNacimiento = partidaNacimiento;
	}
	public String getNumHermanos() {
		return numHermanos;
	}
	public void setNumHermanos(String numHermanos) {
		this.numHermanos = numHermanos;
	}
	public boolean isTrasladado() {
		return trasladado;
	}
	public void setTrasladado(boolean trasladado) {
		this.trasladado = trasladado;
	}
	public String getCertiEstudios() {
		return certiEstudios;
	}
	public void setCertiEstudios(String certiEstudios) {
		this.certiEstudios = certiEstudios;
	}
	public String getGradoEstudios() {
		return gradoEstudios;
	}
	public void setGradoEstudios(String gradoEstudios) {
		this.gradoEstudios = gradoEstudios;
	}
	public TipoPago getTipoPago() {
		return tipoPago;
	}
	public void setTipoPago(TipoPago tipoPago) {
		this.tipoPago = tipoPago;
	}
	

}
