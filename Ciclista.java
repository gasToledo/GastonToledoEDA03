package ar.edu.unlam.pb2.eva03;

public class Ciclista extends Deportista {

	private Integer numeroSocio;
	
	private String nombre;
	
	private String tipoDeBicicleta;
	
	public Ciclista(Integer i, String string, String string2) {
		
		this.numeroSocio = i;
		
		this.nombre = string;
		
		this.tipoDeBicicleta = string2;
	}

	public String getTipoDeBicicleta() {
		
		return this.tipoDeBicicleta;
	}

	public Integer getNumeroDeSocio() {
		
		return this.numeroSocio;
	}

	public Integer getNumeroSocio() {
		return numeroSocio;
	}

	public void setNumeroSocio(Integer numeroSocio) {
		this.numeroSocio = numeroSocio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setTipoDeBicicleta(String tipoDeBicicleta) {
		this.tipoDeBicicleta = tipoDeBicicleta;
	}

}
