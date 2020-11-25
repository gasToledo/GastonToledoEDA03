package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;

public class Corredor extends Deportista implements ICorredor{

	private Integer numeroSocio;
	
	private String nombre;
	
	private Integer distanciaPreferida;
	
	private Integer cantidadDeKilometrosEntrenados;
	
	
	public Corredor(Integer numeroSocio, String nombre, Integer distanciaPreferida) {
	
		this.setNumeroSocio(numeroSocio);
		this.setNombre(nombre);
		this.setDistanciaPreferida(distanciaPreferida);
		this.cantidadDeKilometrosEntrenados = 0;
		
	}

	public Integer getNumeroDeSocio() {
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

	public void setDistanciaPreferida(Integer distanciaPreferida) {
		this.distanciaPreferida = distanciaPreferida;
	}
	
	public Integer getDistanciaPreferida() {
		
		return this.distanciaPreferida;
	}

	@Override
	public void setCantidadDeKilometrosEntrenados(Integer km) {

		this.cantidadDeKilometrosEntrenados = km;
	}

	@Override
	public Integer getCantidadDeKilometrosEntrenados() {

		return this.cantidadDeKilometrosEntrenados;
	}

}
