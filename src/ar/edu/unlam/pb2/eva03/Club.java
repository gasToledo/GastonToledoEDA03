package ar.edu.unlam.pb2.eva03;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Club {

	private String nombre;
	private Set<Deportista> socios;
	private Map<String, Evento> competencias;
	private TipoDeEvento tipoDeEvento;
	
	public Club(String string) {

		this.setNombre(string);
		socios = new TreeSet<Deportista>();
		competencias = new LinkedHashMap<String,Evento>();
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Deportista> getSocios() {
		return socios;
	}

	public void setSocios(Set<Deportista> socios) {
		this.socios = socios;
	}

	public Map<String, Evento> getCompetencias() {
		return competencias;
	}

	public void setCompetencias(Map<String, Evento> competencias) {
		this.competencias = competencias;
	}

	public Set<Deportista> getCantidadSocios() {

		return socios;
	}
	
	public void agregarDeportista(Deportista deportista) {

		socios.add(deportista);
		
	}

	public void crearEvento(TipoDeEvento tipo, String string) {

		competencias.put(string, tipo);
		

	}
	
	public Object inscribirEnEvento(String string, Deportista celeste) {

		return null;
	}
	
	public TipoDeEvento getTipoDeEvento() {
		return tipoDeEvento;
	}

	public void setTipoDeEvento(TipoDeEvento tipoDeEvento) {
		this.tipoDeEvento = tipoDeEvento;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((competencias == null) ? 0 : competencias.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((socios == null) ? 0 : socios.hashCode());
		return result;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Club other = (Club) obj;
		if (competencias == null) {
			if (other.competencias != null)
				return false;
		} else if (!competencias.equals(other.competencias))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (socios == null) {
			if (other.socios != null)
				return false;
		} else if (!socios.equals(other.socios))
			return false;
		return true;
	}




	






	
}
