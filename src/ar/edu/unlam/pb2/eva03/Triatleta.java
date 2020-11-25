package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;

public class Triatleta extends Deportista{

	private Integer numeroDeSocio;
	private String nombre;
	private String distanciaPreferida;
	private TipoDeBicicleta tipoDeBicicleta;
	
	public Triatleta(int i, String string, String string2, TipoDeBicicleta tria) {

		this.setNumeroDeSocio(i);
		this.setNombre(string);
		this.setDistanciaPreferida(string2);
		this.setTipoDeBicicleta(tria);
		
	}

	public Integer getNumeroDeSocio() {
		return numeroDeSocio;
	}

	public void setNumeroDeSocio(Integer numeroDeSocio) {
		this.numeroDeSocio = numeroDeSocio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDistanciaPreferida() {
		return distanciaPreferida;
	}

	public void setDistanciaPreferida(String distanciaPreferida) {
		this.distanciaPreferida = distanciaPreferida;
	}

	public TipoDeBicicleta getTipoDeBicicleta() {

		return this.tipoDeBicicleta;
	}
	
	public TipoDeBicicleta setTipoDeBicicleta(TipoDeBicicleta tria) {
		
		return this.tipoDeBicicleta = tria;
	}

}
