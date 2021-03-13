package clases.poo.ito;

import java.util.HashSet;

public class CuerpoCeleste {

	private String nombre = "";
	private HashSet<Ubicacion> localizaciones = new HashSet<Ubicacion>();
	private String composicion = "";


	public CuerpoCeleste() {
		super();
	}
	
	public CuerpoCeleste(String nombre, String composicion) {
		super();
		this.nombre = nombre;
		this.composicion = composicion;
	}
	
	//=======================================
	public float desplazamiento(float i, float j) {
		float desplazamiento = -1F;
		for(Ubicacion distancia : this.localizaciones) {
			if (distancia.getDistancia() == i) 
				for(Ubicacion distancia2 : this.localizaciones)
					if(distancia2.getDistancia() == j)
						if(i<j) 
							desplazamiento=j-i;
		}
		return desplazamiento;
	}
	
	//=======================================
	public String getNombre() {
		return this.nombre;
	}

	//=======================================
	public void setNombre(String newNombre) {
		this.nombre = newNombre;
	}

	//=======================================
	public void addLocalizaciones(Ubicacion Localizacion){
		this.localizaciones.add(Localizacion);
	}
	
	//=======================================
	public HashSet<Ubicacion> getLocalizaciones() {
		return this.localizaciones;
	}

	//=======================================
	public String getComposicion() {
		return this.composicion;
	}

	//=======================================
	public void setComposicion(String newComposicion) {
		this.composicion = newComposicion;
	}

	@Override
	public String toString() {
		return "CuerpoCeleste [nombre=" + nombre + ", localizaciones=" + localizaciones + ", composicion=" + composicion
				+ "]";
	}

}
