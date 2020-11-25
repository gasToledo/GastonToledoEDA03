package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Nadador extends Deportista implements INadador{

	private Integer numeroSocio;
	
	private String nombre;
	
	private String estilo;
	
	
	public Nadador(Integer numero, String nombre, String estilo) {
		
		this.numeroSocio = numero;
		
		this.nombre = nombre;
		
		this.estilo = estilo;
		
	}

	public String getEstiloPreferido() {

		return this.estilo;
	}

	public Integer getNumeroDeSocio() {

		return this.numeroSocio;
	}

	public int getNumero() {
		return numeroSocio;
	}

	public void setNumero(Integer numero) {
		this.numeroSocio = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

}
