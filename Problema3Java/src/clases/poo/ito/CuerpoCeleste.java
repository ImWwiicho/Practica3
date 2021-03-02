package clases.poo.ito;

import clases.poo.ito.Ubicacion;
import java.util.HashSet;

public class CuerpoCeleste {

	private String nombre = "";
	private HashSet<Ubicacion> localizaciones = new HashSet<Ubicacion>();
	private String composicion = "";


	public CuerpoCeleste() {
		super();
	}
	
	public CuerpoCeleste(String nombre, HashSet<Ubicacion> localizaciones, String composicion) {
		super();
		this.nombre = nombre;
		this.localizaciones = localizaciones;
		this.composicion = composicion;
	}

	public float desplazamiento(int i, int j) {
		float desplazamiento = 0F;
		return desplazamiento;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String newNombre) {
		this.nombre = newNombre;
	}

	public HashSet<Ubicacion> getLocalizaciones() {
		return this.localizaciones;
	}

	public String getComposicion() {
		return this.composicion;
	}

	public void setComposicion(String newComposicion) {
		this.composicion = newComposicion;
	}

	@Override
	public String toString() {
		return "CuerpoCeleste [nombre=" + nombre + ", localizaciones=" + localizaciones + ", composicion=" + composicion
				+ "]";
	}

}
